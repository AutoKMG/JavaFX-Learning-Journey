module com.jmc.events {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.events to javafx.fxml;
    exports com.jmc.events;
}