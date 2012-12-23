import sbt._
import Keys._
import PlayProject._
import templemore.xsbt.cucumber.CucumberPlugin

object ApplicationBuild extends Build {

    val appName         = "cucumbertest"
    val appVersion      = "1.0-SNAPSHOT"

    val buildSettings = Defaults.defaultSettings ++
                        CucumberPlugin.cucumberSettings ++
                        Seq ( CucumberPlugin.cucumberFeaturesDir := file("./test/features/"),
                              CucumberPlugin.cucumberJunitReport := true,
                              CucumberPlugin.cucumberHtmlReport := true, 
                              CucumberPlugin.cucumberJsonReport := true )

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA, settings = buildSettings).settings(
      // Add your own project settings here      
    )
}
