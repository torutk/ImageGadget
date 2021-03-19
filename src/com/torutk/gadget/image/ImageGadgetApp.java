/*
 * © 2017 TAKAHASHI,Toru
 */
package com.torutk.gadget.image;

import com.torutk.gadget.support.TinyGadgetSupport;
import java.util.prefs.Preferences;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * ImageGadgetアプリケーションのエントリポイントを提供するクラス。
 */
public class ImageGadgetApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ImageGadgetView.fxml"));
        Scene scene = new Scene(root);
        
        var support = TinyGadgetSupport.ofTaskbarless(primaryStage, Preferences.userNodeForPackage(this.getClass()));
        var stage = support.getTransparentStage();
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
