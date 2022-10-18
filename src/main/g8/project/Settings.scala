import sbt._
import Keys._
import sbtassembly.AssemblyPlugin.autoImport._


object Settings {

  lazy val settings = Seq(
    organization := "$package$",
    version := "$version$" + sys.props.getOrElse("buildNumber", default="0-SNAPSHOT"),
    scalaVersion := "$scala_version$",
    publishMavenStyle := true,
    Test / publishArtifact := false
  )

  lazy val testSettings = Seq(
    Test / fork := false,
    Test / parallelExecution := false
  )

  lazy val itSettings = Defaults.itSettings ++ Seq(
    IntegrationTest / logBuffered := false,
    IntegrationTest / fork := true
  )

  lazy val $appname;format="word-space,start-case,lowercase,word-only"$Settings = Seq(
    assembly / assemblyJarName := "$appname$-" + version.value + ".jar",
    assembly / test := {},
    assembly / target := file(baseDirectory.value + "/../bin/"),
    assembly / assemblyOption := (assembly / assemblyOption).value.copy(
      includeScala = false,
      includeDependency=true),
    assembly / assemblyMergeStrategy := {
      case PathList("META-INF", xs@_*) => MergeStrategy.discard
      case n if n.startsWith("reference.conf") => MergeStrategy.concat
      case _ => MergeStrategy.first
    }
  )

  lazy val $module1;format="word-space,start-case,lowercase,word-only"$Settings = Seq()

  lazy val $module2;format="word-space,start-case,lowercase,word-only"$Settings = Seq()

}
