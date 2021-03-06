addSbtPlugin("com.typesafe.sbt"   % "sbt-git"            % "1.0.0")
addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.19.0")
addSbtPlugin("org.scalameta"      % "sbt-scalafmt"       % "2.4.0")
addSbtPlugin("org.scoverage"      % "sbt-scoverage"      % "1.6.1")
addSbtPlugin("com.typesafe.sbt"   % "sbt-site"           % "1.4.0")

// Publish to Maven Central
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.1")
addSbtPlugin("com.jsuereth"   % "sbt-pgp"      % "2.0.1")
