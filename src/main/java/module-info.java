module com.example.dsbkml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dsbkml to javafx.fxml;
    exports com.example.dsbkml;
}