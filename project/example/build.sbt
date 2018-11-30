name := "flink-example"

version := "0.0.1"

scalaVersion := "2.11.8"

val flinkVersion = "1.6.2"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion % "provided", // All flink deps deeds to be provided when we are using cluster
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion % "provided",
)