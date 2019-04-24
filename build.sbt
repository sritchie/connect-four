val scalaTestVersion = "3.0.5"
val scalacheckVersion = "1.13.4"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.samritchie",
      scalaVersion := "2.12.7"
    )),
    name := "interview"
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
  "org.scalacheck" %% "scalacheck" % scalacheckVersion % Test
)
