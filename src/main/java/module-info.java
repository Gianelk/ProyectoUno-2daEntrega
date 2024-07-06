module com.example.proyectouno_entrega_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.proyectouno_entrega_2 to javafx.fxml;
    exports com.example.proyectouno_entrega_2;
}