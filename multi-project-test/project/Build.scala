import sbt._
import Keys._

object MultiProjectTestBuild extends Build {
    lazy val root = Project(id = "multi-project-test", base = file(".")) settings (ScctPlugin.mergeReportSettings: _*) aggregate(first, second, third)

    lazy val first = Project(id = "first", base = file("first")) settings (ScctPlugin.instrumentSettings: _*)
    lazy val second = Project(id = "second", base = file("second")) settings (ScctPlugin.instrumentSettings: _*) dependsOn(first)
    lazy val third = Project(id = "third", base = file("third")) aggregate(grandchild)
    lazy val grandchild = Project(id = "grandchild", base = file("third/grand-child")) settings (ScctPlugin.instrumentSettings: _*) dependsOn(second)

    // Adding scct plugin settings to individual projects works, just append this:
    //    settings(ScctPlugin.scctSettings: _*)
    // Adding scct to parent project settings doesn't work, don't know why, tried this:
    //    super.settings ++ seq(ScctPlugin.scctSettings: _*)

    override lazy val settings = super.settings ++ Seq(
      organization := "reaktor.scct",
      scalaVersion := "2.9.2",
      libraryDependencies ++= Seq(
        "junit" % "junit" % "4.10" % "test",
        "org.specs2" %% "specs2" % "1.9" % "test"
      )
    )
}