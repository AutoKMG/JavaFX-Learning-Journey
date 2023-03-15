module com.jmc.flowpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.flowpane to javafx.fxml;
    exports com.jmc.flowpane;
}