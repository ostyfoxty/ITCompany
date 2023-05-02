module com.example.javalaba63 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalaba63 to javafx.fxml;
    exports com.example.javalaba63;
}