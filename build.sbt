name := "IRC_Bot"

version := "1.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies := Seq(
  "org.pircbotx" % "pircbotx" % "2.0",
  "com.typesafe.akka" %% "akka-actor" % "2.1.0",
  "ch.qos.logback" % "logback-classic" % "1.0.7",
  "junit" % "junit" % "4.10" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test"
)

mainClass in (Compile,run) := Some("scala.main.IRCBot")

scalaVersion := "2.10.2"

crossScalaVersions := Seq("2.9.1")
