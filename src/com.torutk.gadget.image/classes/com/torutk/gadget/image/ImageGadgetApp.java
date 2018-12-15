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
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ImageGadgetView.fxml"));
        Scene scene = new Scene(root);
        
        new TinyGadgetSupport(stage, Preferences.userNodeForPackage(this.getClass()));
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
