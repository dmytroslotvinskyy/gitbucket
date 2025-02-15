scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

addSbtPlugin("org.scalameta"    % "sbt-scalafmt"         % "2.4.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-twirl"            % "1.5.1")
addSbtPlugin("com.eed3si9n"     % "sbt-assembly"         % "1.0.0")
addSbtPlugin("org.scalatra.sbt" % "sbt-scalatra"         % "1.0.4")
addSbtPlugin("com.github.sbt"   % "sbt-pgp"              % "2.1.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-license-report"   % "1.2.0")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")
addSbtPlugin("org.scoverage"    % "sbt-scoverage"        % "1.8.2")
addSbtPlugin("com.eed3si9n"     % "sbt-assembly"         % "0.14.6")

