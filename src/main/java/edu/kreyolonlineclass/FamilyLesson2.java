package edu.kreyolonlineclass;

import edu.kreyolonlineclass.familyLesson.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FamilyLesson2 {
    @FXML
    ImageView arrow;
    @FXML
    Button btCheck;
    @FXML
    Label lbEnglishWord;
    @FXML
    Button btNext;
    @FXML
    HBox boxChosenWords;
    @FXML
    HBox boxFanm;
    @FXML
    HBox boxTigason;
    @FXML
    HBox boxTifi;
    @FXML
    HBox boxNonm;
    @FXML
    HBox boxBebe;
    @FXML
    Label lbFanm;
    @FXML
    Label lbNonm;
    @FXML
    Label lbTiFi;
    @FXML
    Label lbTigason;
    @FXML
    Label lbBebe;
    int count = 0;
    ClickedAndDroppedLabelIntoHBox clickedAndDroppedLabelIntoHBox = new ClickedAndDroppedLabelIntoHBox();
    @FXML
    ProgressBar progressBar;
    @FXML
    Label lbCorrection;
    @FXML
    HBox boxBottom;
   BottomBoxPane bottomBoxPane = new BottomBoxPane();
    edu.kreyolonlineclass.familyLesson.TopBoxPane topBoxPane = new TopBoxPane(new MyProgressbar(progressBar));
   MiddleBoxPane middleBoxPane = new MiddleBoxPane(new CorrectAnswer("Nonm nan"));


    @FXML
    void checkCorrection() {
        new BottomBoxPane().checkName(topBoxPane, middleBoxPane, progressBar, lbCorrection, btCheck, btNext, boxBottom, 6);
    }
    @FXML
    public void goBackTo(MouseEvent event){
        new GoTo().page(event,StackPages.getPage());
    }

    @FXML
    void actionOnWord()  {
        clickedAndDroppedLabelIntoHBox.choseWord(middleBoxPane,boxChosenWords,btCheck,new Label[]{lbTigason, lbTiFi, lbNonm, lbBebe, lbFanm}, boxTigason, boxTifi, boxNonm, boxBebe, boxFanm);
    }
    @FXML
    void nextButtonOnClicked() throws FileNotFoundException {
        if (count < 5) {
            bottomBoxPane.setButtonAndLabelState(true, false, btCheck, btNext, lbCorrection);
            bottomBoxPane.setFill(boxBottom, "white");

            clickedAndDroppedLabelIntoHBox.getEnglishWords(middleBoxPane,lbEnglishWord, count);
            middleBoxPane.getCorrectAnswerClass().setCorrectWord(middleBoxPane.listOfEnglishWords("englishAndKreyolWordsFile/correctWord.txt").get(count));
            clickedAndDroppedLabelIntoHBox.getKreyolWord(middleBoxPane,new Label[]{lbTigason, lbTiFi, lbNonm, lbBebe, lbFanm}
                    , count, boxTigason, boxTifi, boxNonm, boxBebe, boxFanm);
            btCheck.setDisable(clickedAndDroppedLabelIntoHBox.checkIsEmpty(boxChosenWords));
            count++;
        } else
            btNext.setDisable(true);


    }


}