module com.example.visualapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.visualapp to javafx.fxml;
    exports com.example.visualapp;
}