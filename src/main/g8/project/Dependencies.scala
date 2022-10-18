import sbt._
import Keys._

object Dependencies {

  lazy val version = new {
      val scalaTest       = "3.2.14"
  }

  lazy val library = new  {
      val test  = "org.scalatest" %% "scalatest" % version.scalaTest % Test
  }

  val $module1;format="word-space,start-case,lowercase,word-only"$Dependencies: Seq[ModuleID] = Seq(
    library.test,
  )

  val $module2;format="word-space,start-case,lowercase,word-only"$Dependencies: Seq[ModuleID] = Seq(
    library.test,
  )

  val $appname;format="word-space,start-case,lowercase,word-only"$Dependencies: Seq[ModuleID] = Seq(
    library.test,
  )

}
