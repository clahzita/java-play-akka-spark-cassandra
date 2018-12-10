
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object listar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[PacoteInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pacotes: List[PacoteInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Lista de Pacotes")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
  """),format.raw/*4.3*/("""<h1>Lista de Pacotes</h2>
  <table class="table table-striped">
	<thead>
		<tr>
			<th>Local Partida</th>
			<th>Dia Partida</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		"""),_display_(/*14.4*/for(pacote <- pacotes) yield /*14.26*/{_display_(Seq[Any](format.raw/*14.27*/("""
		"""),format.raw/*15.3*/("""<tr>
			<td>"""),_display_(/*16.9*/pacote/*16.15*/.localPartida),format.raw/*16.28*/("""</td>
			<td>"""),_display_(/*17.9*/pacote/*17.15*/.diaPartida),format.raw/*17.26*/("""</td>
			<td><a href=#>Edit</a></td>
		</tr>
		""")))}),format.raw/*20.4*/("""
	"""),format.raw/*21.2*/("""</tbody>
</table>
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(pacotes:List[PacoteInfo]): play.twirl.api.HtmlFormat.Appendable = apply(pacotes)

  def f:((List[PacoteInfo]) => play.twirl.api.HtmlFormat.Appendable) = (pacotes) => apply(pacotes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 10 18:48:22 BRT 2018
                  SOURCE: /home/clarissa/eclipse-workspace/java-play-akka-spark-cassandra/app/views/listar.scala.html
                  HASH: 4081c1c230f9cc9871674a4dd08ba80dbaadca43
                  MATRIX: 959->1|1080->29|1107->31|1139->55|1178->57|1207->60|1406->233|1444->255|1483->256|1513->259|1552->272|1567->278|1601->291|1641->305|1656->311|1688->322|1766->370|1795->372|1844->391
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|51->20|52->21|54->23
                  -- GENERATED --
              */
          