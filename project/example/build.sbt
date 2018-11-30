name := "flink-example"

version := "0.0.1"

scalaVersion := "2.11.8"

val flinkVersion = "1.7.0"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion,
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
  "org.apache.flink" %% "flink-connector-twitter" % flinkVersion,
  "org.apache.flink" %% "flink-clients" % flinkVersion,
  "commons-logging" % "commons-logging" % "1.2",
)