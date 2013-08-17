import sbt._
import Keys._
import play.Project._
import templemore.sbt.cucumber.CucumberPlugin

object ApplicationBuild extends Build {

    val appName         = "cucumbertest"
    val appVersion      = "1.0-SNAPSHOT"

    Resolver.sonatypeRepo( "release" )

    val buildSettings = Defaults.defaultSettings ++
                        CucumberPlugin.cucumberSettings ++
                        Seq ( CucumberPlugin.cucumberFeaturesLocation := "./test/features/",
                              CucumberPlugin.cucumberJunitReport := true,
                              CucumberPlugin.cucumberHtmlReport := true, 
                              CucumberPlugin.cucumberJsonReport := true )

    val appDependencies = Seq(
      // Add your project dependencies here,
      jdbc,
      anorm,
      "info.cukes" % "cucumber-scala_2.10" % "1.1.4" % "test",
      "org.fluentlenium" % "fluentlenium-festassert" % "0.9.0" % "test" exclude("org.jboss.netty", "netty"),
      "com.github.detro.ghostdriver" % "phantomjsdriver" % "1.0.3" % "test"
    )

    val main = play.Project(appName, appVersion, appDependencies, settings = buildSettings).settings(
      // Add your own project settings here      
    )
}
