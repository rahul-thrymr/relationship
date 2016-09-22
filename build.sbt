name := """relationship"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)


 lazy val myProject = (project in file("."))
 .enablePlugins(PlayJava, PlayEbean)
 libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1100-jdbc41" 