name := "lastChance"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra_2.11" % "2.4.0",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided")

enablePlugins(JettyPlugin)