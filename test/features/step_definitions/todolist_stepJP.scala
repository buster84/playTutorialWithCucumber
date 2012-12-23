import cucumber.runtime.{JA, ScalaDsl, PendingException}

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

class TodoListJASteps extends ScalaDsl with JA {
  前提("""^データベースを初期化$"""){ () =>
    Env.browser.goTo("http://localhost:3333")
    Env.browser.$("button").click()
  }
  もし("""^私がトップページに行く$"""){ () =>
    Env.browser.goTo("http://localhost:3333/tasks")
  }
  ならば("""^私はトップページにいるべき$"""){ () =>
    assert( Env.browser.url == "http://localhost:3333/tasks" )
  }
  ならば("""^私は"([^"]*)"をみれるべき$"""){ (str:String) =>
    assert(Env.browser.$("body").getTexts().get(0).contains(str))  
  }
  もし("""私が"([^"]*)"に"([^"]*)"を入力$"""){ (field:String, value:String) =>
    Env.browser.$("#" + field).text(value)
  }
  もし("""^私が"([^"]*)"を押す$"""){ (name:String) =>
    Env.browser.submit("#" + name)
  }
  ならば("""^私は"([^"]*)"をみれないべき$"""){ (str:String) =>
    assert(false == Env.browser.$("body").getTexts().get(0).contains(str))  
  }
}
