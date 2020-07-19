module com.torutk.gadget.image {
    requires com.torutk.gadget.support;
    requires javafx.controls;
    requires javafx.fxml;
    opens com.torutk.gadget.image to javafx.graphics, javafx.fxml;
}
