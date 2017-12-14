
resolvers += "Typesafe Releases Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Central Maven Repository" at "http://repo.maven.apache.org/maven2"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.6")
addSbtPlugin("com.github.ddispaltro" % "sbt-reactjs" % "0.6.8")

dependencyOverrides += "org.webjars.npm" % "minimatch" % "3.0.4"
dependencyOverrides += "org.webjars.npm" % "graceful-readlink" % "1.0.1"
