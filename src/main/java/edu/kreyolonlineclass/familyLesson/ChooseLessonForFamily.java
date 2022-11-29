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

import java.io.IOException;

public class ChooseLessonForFamily {
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    Label lesson1LbStart;
    @FXML
    Label lesson2LbStart;
    @FXML
    Label lesson3LbStart;
    @FXML
    Label lesson4LbStart;
    @FXML
    Label lesson5LbStart;
    @FXML
    ImageView arrow;

    @FXML
    public void  lesson1LbStartOnClicked(MouseEvent event){
       new GoTo().page(event,"FXMLFamily/FXMLFamilyLesson1.fxml");
       StackPages.getDynamicPages().add("FXMLFamily/FXMLFamilyToChooseLesson.fxml");
    }

    @FXML
    public void  lesson2LbStartOnClicked(MouseEvent event){
        new GoTo().page(event,"FXMLFamily/FXMLFamilyLesson2.fxml");
        StackPages.getDynamicPages().add("FXMLFamily/FXMLFamilyToChooseLesson.fxml");

    }
    @FXML
    public void goBackTo(MouseEvent event){
        new GoTo().page(event,StackPages.getPage());
    }

}
