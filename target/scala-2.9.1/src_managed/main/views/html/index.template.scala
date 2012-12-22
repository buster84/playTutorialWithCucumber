
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[String]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/tasks/*7.15*/.size)),format.raw/*7.20*/(""" task(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*10.10*/tasks/*10.15*/.map/*10.19*/ { task =>_display_(Seq[Any](format.raw/*10.29*/("""
            <li>
                """),_display_(Seq[Any](/*12.18*/task/*12.22*/.label)),format.raw/*12.28*/("""
                
                """),_display_(Seq[Any](/*14.18*/form(routes.Application.deleteTask(task.id))/*14.62*/ {_display_(Seq[Any](format.raw/*14.64*/("""
                    <input type="submit" id="delete" value="Delete">
                """)))})),format.raw/*16.18*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
    </ul>
    
    <h2>Add a new task</h2>
    
    """),_display_(Seq[Any](/*23.6*/form(routes.Application.newTask)/*23.38*/ {_display_(Seq[Any](format.raw/*23.40*/("""
        
        """),_display_(Seq[Any](/*25.10*/inputText(taskForm("label")))),format.raw/*25.38*/(""" 
        
        <input type="submit" id="create" value="Create">
        
    """)))})),format.raw/*29.6*/("""
    
""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[String]) = apply(tasks,taskForm)
    
    def f:((List[Task],Form[String]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 22 21:09:26 JST 2012
                    SOURCE: /Users/okumurayasuki/work/scala/app/todolist/app/views/index.scala.html
                    HASH: 0421ca39b95119e6890f1e8e3b3f8a3ff681178b
                    MATRIX: 522->1|658->44|686->63|722->65|747->82|786->84|836->99|849->104|875->109|948->146|962->151|975->155|1023->165|1094->200|1107->204|1135->210|1206->245|1259->289|1299->291|1418->378|1478->406|1567->460|1608->492|1648->494|1703->513|1753->541|1866->623|1904->630
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|28->7|31->10|31->10|31->10|31->10|33->12|33->12|33->12|35->14|35->14|35->14|37->16|39->18|44->23|44->23|44->23|46->25|46->25|50->29|52->31
                    -- GENERATED --
                */
            