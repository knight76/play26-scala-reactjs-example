name := """play26-scala-reactjs-example"""

version := "2.6.3"

scalaVersion := "2.12.2"

scalacOptions += "-target:jvm-1.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

resolvers += "Central Maven Repository" at "http://repo.maven.apache.org/maven2"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
resolvers += "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

libraryDependencies ++= Seq(
                  guice,
                  "org.webjars" %% "webjars-play" % "2.6.2",
                  "org.webjars" % "bootstrap" % "3.1.1-1",
                  "org.webjars" % "webjars-locator" % "0.32-1",
                  "org.webjars" % "requirejs" % "2.3.5",
                  "org.webjars" % "marked" % "0.3.2-1",
                  "org.webjars" % "react" % "15.6.1",
                  "org.webjars.npm" % "react-dom" % "15.6.1",
                  "org.webjars.npm" % "react-autosuggest" % "3.7.3"
)

dependencyOverrides += "org.webjars.npm" % "minimatch" % "2.0.10"
