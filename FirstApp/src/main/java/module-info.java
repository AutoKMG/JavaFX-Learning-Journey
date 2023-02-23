module com.kmgfirstfx.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kmgfirstfx.firstapp to javafx.fxml;
    exports com.kmgfirstfx.firstapp;
}