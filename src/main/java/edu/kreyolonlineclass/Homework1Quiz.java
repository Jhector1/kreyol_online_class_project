package edu.kreyolonlineclass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Homework1Quiz {

    @FXML
    private Text txtA;
    @FXML
    private Text phantomText;
    @FXML
    private Text txtAn;
    @FXML
    private Text txtLan;
    @FXML
    private Text txtLa;
    @FXML
    private Text txtNan;


    @FXML
    private Text text;

    @FXML
    private Rectangle placeHolder;

    @FXML
    public void dragButton(MouseEvent event) {
        txtA.setCursor(Cursor.CLOSED_HAND);
        txtA.setLayoutX(event.getSceneX());
        txtA.setLayoutY(event.getSceneY());

    }

    @FXML
    public void releasedButton(MouseEvent event) {
          if(placeHolder.contains(txtA.getLayoutX(), txtA.getLayoutY())){
              txtA.setLayoutX(phantomText.getLayoutX());
              txtA.setLayoutY(phantomText.getLayoutY());
        }
        else{
        txtA.setX(0);
        txtA.setY(0);


    }
    }

//    @FXML
//    void myEvent (MouseEvent event){
//        txtA.setLayoutX(phantomText.getLayoutX());
//        txtA.setLayoutY(phantomText.getLayoutY());
//        placeHolder.toBack();
//        txtA.setFill(Color.BLACK);
//}

}
