import cucumber.runtime.{EN, ScalaDsl, PendingException}

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

  // This is for starting server and stop server.
  // Actually I'm not sure this is correct way.
  val testServer: TestServer = TestServer(3333)
  val browser = TestBrowser.of(Helpers.HTMLUNIT)

  Before{
    testServer.start()
  }
  After{
    browser.quit()
    testServer.stop()
  }

  Given("""^Set a database$"""){ () =>
    browser.goTo("http://localhost:3333")
    browser.$("button").click()
  }
  When("""^I go to the home page$"""){ () =>
    browser.goTo("http://localhost:3333/tasks")
  }
  Then("""^I am in the home page$"""){ () =>
    assert( browser.url == "http://localhost:3333/tasks" )
  }
  Then("""^I should see "([^"]*)"$"""){ (str:String) =>
    assert(browser.$("body").getTexts().get(0).contains(str))  
  }
  When("""^I fill in "([^"]*)" with "([^"]*)"$"""){ (field:String, value:String) =>
    browser.$("#" + field).text(value)
  }
  When("""^I push "([^"]*)"$"""){ (name:String) =>
    browser.submit("#" + name)
  }
  Then("""^I should not see "([^"]*)"$"""){ (str:String) =>
    assert(false == browser.$("body").getTexts().get(0).contains(str))  
  }

}
