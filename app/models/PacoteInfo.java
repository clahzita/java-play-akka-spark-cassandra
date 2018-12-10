package models;

public class PacoteInfo {
	
	public Integer id;
	public String diaPartida;
	public String localPartida;
	public Double menorPreco;
	
	public PacoteInfo(Integer id, String diaPartida, String localPartida, Double menorPreco) {
		super();
		this.id = id;
		this.localPartida = localPartida;
		this.diaPartida = diaPartida;
		this.menorPreco = menorPreco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDiaPartida() {
		return diaPartida;
	}

	public void setDiaPartida(String diaPartida) {
		this.diaPartida = diaPartida;
	}

	public String getLocalPartida() {
		return localPartida;
	}

	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}

	public Double getMenorPreco() {
		return menorPreco;
	}

	public void setMenorPreco(Double menorPreco) {
		this.menorPreco = menorPreco;
	}	
	
	
	
}

