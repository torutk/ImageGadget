@echo off

REM increment the version number each creation.
set APP_VERSION=0.3.0

"%JAVA_HOME%"\bin\jpackage ^
--type msi ^
--win-upgrade-uuid 7f321f89-8892-45e8-9cc6-09639d621fda ^
--win-menu-group "High Bridge" ^
--win-menu ^
--win-shortcut ^
--app-version %APP_VERSION% ^
--description "Image viewer on desktop" ^
--name "ImageGadget" ^
--dest build\installer ^
--vendor "High Bridge" ^
--module-path build\libs;javafx-gadgetsupport\build\libs ^
--module com.torutk.gadget.image ^
--java-options "-Xms32m -Xmx64m -Xss256k -XX:TieredStopAtLevel=1 -XX:CICompilerCount=2 -XX:CompileThreshold=1500 -XX:InitialCodeCacheSize=160k -XX:ReservedCodeCacheSize=32m -XX:MetaspaceSize=12m -XX:+UseSerialGC" ^
--verbose



