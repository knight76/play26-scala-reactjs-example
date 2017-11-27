
resolvers += "Typesafe Releases Repository" at "http://repo.typesafe.com/typesafe/releases/"
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.6")
addSbtPlugin("com.github.ddispaltro" % "sbt-reactjs" % "0.6.8" exclude ("org.webjars.npm", "minimatch"))