/*
 * Copyright © 2018 TAKAHASHI,Toru
 */

module com.torutk.gadget.image {
    requires java.prefs;
    requires javafx.controls;
    requires javafx.fxml;
    requires com.torutk.gadget.support;
    opens com.torutk.gadget.image to javafx.graphics, javafx.fxml;
}
