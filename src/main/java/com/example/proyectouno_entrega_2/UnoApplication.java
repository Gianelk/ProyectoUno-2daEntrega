package com.example.proyectouno_entrega_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;


public class UnoApplication extends Application {
    boolean isPlaying = false;

    @Override
    public void start(Stage stage) throws IOException {
        music();
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        String filePath = "src/main/resources/images/icono.png";
        Image icon = new Image(new File(filePath).toURI().toString());
        stage.getIcons().add(icon);

        scene.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
            if (event.getCode() == KeyCode.Q) {
                if (mediaPlayer!= null) {
                    if (isPlaying) {
                        mediaPlayer.pause();
                        isPlaying = false;
                    } else {
                        mediaPlayer.play();
                        isPlaying = true;
                    }
                }
            }
        });
        stage.setTitle("Uno!");
        stage.setScene(scene);
        stage.show();
    }

    MediaPlayer mediaPlayer;
    public void music() {
        String s = "src/main/resources/music/music.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(h);
        mediaPlayer.play();


    }

    public static void main(String[] args) {
        launch();
    }
}