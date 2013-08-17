package cucumber.runtime.scala.test

import _root_.org.junit.runner.RunWith
import _root_.cucumber.api.junit.Cucumber

@RunWith(classOf[Cucumber])
@Cucumber.Options(strict=true, features = Array( "features/" ), glue = Array("test/features/step_definitions/"))
// @Cucumber.Options(strict=true, features = {"./features/"})
class RunCukesTest
