module com.jmc.anchorpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.anchorpane to javafx.fxml;
    exports com.jmc.anchorpane;
}