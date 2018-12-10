package controllers;

import akka.actor.*;
import models.PacoteInfo;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import models.PacoteInfo;
import models.PacoteInfoMsg;

public class ListarPacotesActor extends AbstractActor {
	private Cluster cluster;
	private Session session;
	
	public static Props getProps() {
        return Props.create(ListarPacotesActor.class);
    }
	
	public ListarPacotesActor() {
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        session = cluster.connect("mykeyspace");
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder()//
                .match(PacoteInfoMsg.class, p -> {
                	
                	ResultSet results = session.execute("SELECT * FROM pacote_info");
                	List<PacoteInfo> listaPacotes = new ArrayList<>();

                	for (Iterator<Row> iterator = results.iterator(); iterator.hasNext();) {
                    
                		Row row = iterator.next();
                        
                		PacoteInfo pacote = new PacoteInfo(row.getInt("pacote_id")
                				, row.getString("pacote_dia_partida"), row.getString("pacote_local_partida"),
                				row.getDouble("pacote_menor_preco"));
                        
                        listaPacotes.add(pacote);
                        
                        System.out.println(pacote.toString());
                    }
                    sender().tell(listaPacotes, self());
                }).build();
	}
}
