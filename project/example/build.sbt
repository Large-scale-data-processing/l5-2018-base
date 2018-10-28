name := "spark-example"

version := "0.0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.0.0"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided", // All spark deps deeds to be provided when we are using spark-submit
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided"
)