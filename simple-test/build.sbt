organization := "reaktor.scct"

name := "simple-test"

version := "1.0"

scalaVersion := "2.10.0-RC3"

libraryDependencies ++= Seq(
  "net.liftweb" % "lift-common_2.9.1" % "2.4",
  "junit" % "junit" % "4.10" % "test",
  "org.specs2" %% "specs2" % "1.12.3" % "test"
)

resolvers += "some stuff" at "https://oss.sonatype.org/content/groups/scala-tools/"

// logLevel := Level.Debug
