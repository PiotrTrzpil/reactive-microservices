name := "auth-password"

version := "1.0"

scalaVersion := "2.11.5"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val akkaStreamV = "1.0-M5"
  val slickV = "2.1.0"
  val postgresV = "9.3-1102-jdbc41"
  val jbcryptV = "0.3m"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaStreamV,
    "com.typesafe.slick" %% "slick" % slickV,
    "org.postgresql" % "postgresql" % postgresV,
    "org.mindrot" % "jbcrypt" % jbcryptV
  )
}

Revolver.settings
