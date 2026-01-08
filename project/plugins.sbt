ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always

addSbtPlugin("org.playframework" % "sbt-plugin" % "3.0.10")
addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.6.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.4.2")