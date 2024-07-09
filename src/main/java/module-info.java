module com.example.proyectouno_entrega_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.desktop;
    requires javafx.media;
    requires com.google.gson;

    opens com.example.proyectouno_entrega_2 to javafx.fxml, com.google.gson;
    exports com.example.proyectouno_entrega_2;
}