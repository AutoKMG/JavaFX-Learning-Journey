module com.jmc.textflow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.textflow to javafx.fxml;
    exports com.jmc.textflow;
}