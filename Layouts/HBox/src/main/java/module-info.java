module com.jmc.hbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.hbox to javafx.fxml;
    exports com.jmc.hbox;
}