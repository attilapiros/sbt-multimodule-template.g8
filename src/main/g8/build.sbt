import Dependencies._
import Settings._

lazy val $module1;format="word-space,start-case,lowercase,word-only"$ = (project in file("$module1$")).
  settings(Settings.settings: _*).
  settings(Settings.$module1;format="word-space,start-case,lowercase,word-only"$Settings: _*).
  settings(libraryDependencies ++= $module1;format="word-space,start-case,lowercase,word-only"$Dependencies)

lazy val $module2;format="word-space,start-case,lowercase,word-only"$ = (project in file("$module2$")).
  settings(Settings.settings: _*).
  settings(Settings.$module2;format="word-space,start-case,lowercase,word-only"$Settings: _*).
  settings(libraryDependencies ++= $module2;format="word-space,start-case,lowercase,word-only"$Dependencies)

lazy val $appname;format="word-space,start-case,lowercase,word-only"$ = (project in file("$appname$")).
  settings(Settings.settings: _*).
  settings(Settings.$appname;format="word-space,start-case,lowercase,word-only"$Settings: _*).
  dependsOn($module1;format="word-space,start-case,lowercase,word-only"$, $module2;format="word-space,start-case,lowercase,word-only"$).
  configs(Test)
