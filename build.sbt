lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.7"
)

lazy val spin = (project in file("spin"))
  .dependsOn(util)
  .settings(commonSettings: _*)

lazy val util = (project in file("shared/util"))
  .settings(commonSettings: _*)