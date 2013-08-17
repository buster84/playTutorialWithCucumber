import cucumber.api.scala.{EN, ScalaDsl}

import play.api.test._

import play.api._
import libs.ws.WS
import play.api.mvc._
import play.api.http._

import play.api.libs.iteratee._
import play.api.libs.concurrent._

import org.openqa.selenium._
import org.openqa.selenium.firefox._
import org.openqa.selenium.htmlunit._

class CucumberSteps extends ScalaDsl with EN {

  Given("""^Set a database$"""){ () =>
    Env.browser.goTo("http://localhost:3333")
    Env.browser.$("button").click()
  }
  When("""^I go to the home page$"""){ () =>
    Env.browser.goTo("http://localhost:3333/tasks")
  }
  Then("""^I am in the home page$"""){ () =>
    assert( Env.browser.url == "http://localhost:3333/tasks" )
  }
  Then("""^I should see "([^"]*)"$"""){ (str:String) =>
    assert(Env.browser.$("body").getTexts().get(0).contains(str))  
  }
  When("""^I fill in "([^"]*)" with "([^"]*)"$"""){ (field:String, value:String) =>
    Env.browser.$("#" + field).text(value)
  }
  When("""^I push "([^"]*)"$"""){ (name:String) =>
    Env.browser.submit("#" + name)
  }
  Then("""^I should not see "([^"]*)"$"""){ (str:String) =>
    assert(false == Env.browser.$("body").getTexts().get(0).contains(str))  
  }
  Then("""Take screenshot"""){() =>
    Env.takeScreenshot()
  }

}
