package edu.kreyolonlineclass;

import edu.kreyolonlineclass.Homework1Quiz;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    Scene scene;

    public Scene getScene() {
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("familyLesson/FXMLFamily/index_FXML/FXMLIndex/FXMLIndex.fxml"));
         scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("myStyleSheet.css").toExternalForm());
       primaryStage.getIcons().add(new Image(getClass().getResource("logoApp.jpg").toExternalForm()));

        primaryStage.setTitle("Quiz 1");
        primaryStage.show();
    }
}
