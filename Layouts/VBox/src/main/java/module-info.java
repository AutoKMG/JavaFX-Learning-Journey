module com.jmc.vbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.vbox to javafx.fxml;
    exports com.jmc.vbox;
}