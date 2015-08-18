lazy val AnalyticsJavaLibrary = project.in(file("."))
  .settings(
    libraryDependencies ++= Seq(
      "com.google.code.gson" % "gson" % "2.3.1",
      "commons-codec" % "commons-codec" % "1.10",
      "commons-io" % "commons-io" % "2.4",
      "io.jsonwebtoken" % "jjwt" % "0.5"
    )
  )
