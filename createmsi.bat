@echo off

"%JAVA_HOME%"\bin\javapackager -deploy -native msi ^
-v ^
-outdir dist -outfile ImageGadget ^
-srcdir dist -srcfiles ImageGadget.jar;lib\GadgetSupport.jar ^
-appclass com.torutk.gadget.image.ImageGadgetApp ^
-name "ImageGadget" ^
-BappVersion=0.1.1 ^
-title "Image Gadget" ^
-vendor Takahashi ^
-description "Image viewer on desktop"

