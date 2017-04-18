lazy val commonSettings = Seq(
  organization := "in.thecache",
  version := "0.1.0",
  scalaVersion := "2.12.1"
)

lazy val scalactic = "org.scalactic" %% "scalactic" % "3.0.1"

lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.1"

lazy val root = (project in file("."))
  .settings(
    commonSettings,

    name := "Scala99Problems",

    scalaSource in Compile := baseDirectory.value / "src" / "main" / "scala",

    scalaSource in Test := baseDirectory.value / "src" / "test" / "scala",

    libraryDependencies += scalactic,

    libraryDependencies += scalatest % Test
  )
