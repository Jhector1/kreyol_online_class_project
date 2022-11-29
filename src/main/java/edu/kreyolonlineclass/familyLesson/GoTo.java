package edu.kreyolonlineclass.familyLesson;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GoTo {
    Parent root;
    Scene scene;
    Stage stage;
    public  void  page(MouseEvent event, String filename){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
        try {
            root=loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
       // stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("image/boy.jpg"))));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

