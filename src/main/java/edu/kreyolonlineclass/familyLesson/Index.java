package edu.kreyolonlineclass.familyLesson;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Index {
    Parent root;
    Scene scene;
    Stage stage;
    @FXML
    Label intro;
    @FXML
    Label family;
    @FXML
    Label restaurant;
    @FXML
    Label travel;
    @FXML
    Label phrases;
    @FXML
    ImageView arrow;

    @FXML
    void goToFamilyLesson1(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLFamily/FXMLFamilyToChooseLesson.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StackPages.getDynamicPages().add("FXMLFamily/index_FXML/FXMLIndex/FXMLIndex.fxml");
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void goBackTo(MouseEvent event){
        new GoTo().page(event,StackPages.getPage());
    }
}

