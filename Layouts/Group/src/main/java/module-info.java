module com.jmc.group {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.group to javafx.fxml;
    exports com.jmc.group;
}