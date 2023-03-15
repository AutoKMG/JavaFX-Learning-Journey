module com.jmc.gridpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.gridpane to javafx.fxml;
    exports com.jmc.gridpane;
}