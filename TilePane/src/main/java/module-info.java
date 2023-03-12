module com.jmc.tilepane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.tilepane to javafx.fxml;
    exports com.jmc.tilepane;
}