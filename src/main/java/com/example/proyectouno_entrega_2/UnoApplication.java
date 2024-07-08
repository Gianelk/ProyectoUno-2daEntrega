package com.example.proyectouno_entrega_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class UnoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        String filePath = "src/main/resources/images/icono.png";
        Image icon = new Image(new File(filePath).toURI().toString());
        stage.getIcons().add(icon);


        stage.setTitle("Uno!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {

        launch();
    }
}