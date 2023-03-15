module com.jmc.borderpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.borderpane to javafx.fxml;
    exports com.jmc.borderpane;
}