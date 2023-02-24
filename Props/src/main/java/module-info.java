module com.javaprops.props {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javaprops.props to javafx.fxml;
    exports com.javaprops.props;
}