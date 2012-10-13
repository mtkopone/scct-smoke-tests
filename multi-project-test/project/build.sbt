resolvers += Classpaths.typesafeResolver

// resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

resolvers += "scct-local-repository" at "file:///Users/mtkopone/projects/scct-root/gh-pages/maven-repo"

addSbtPlugin("reaktor" % "sbt-scct" % "0.2-SNAPSHOT")
