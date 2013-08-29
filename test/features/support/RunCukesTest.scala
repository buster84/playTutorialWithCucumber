package cucumber.examples.scalacalculator

import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber

@RunWith(classOf[Cucumber])
@Cucumber.Options(format = Array("pretty", "html:target/cucumber-html-report"),strict = true, features = Array("test/features/"), glue = Array("classpath:cucumber.stepDefinitions", "classpath:cucumber.support"))
class RunCukesTest
