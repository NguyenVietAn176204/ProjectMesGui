module com.example.mesapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mesapp to javafx.fxml;
    exports com.example.mesapp;
}