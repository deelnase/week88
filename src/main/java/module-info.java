module com.example.week88 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week88 to javafx.fxml;
    exports com.example.week88;
}