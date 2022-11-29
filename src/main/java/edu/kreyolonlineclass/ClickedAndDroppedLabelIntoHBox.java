package edu.kreyolonlineclass;

import edu.kreyolonlineclass.familyLesson.MiddleBoxPane;
import edu.kreyolonlineclass.familyLesson.BottomBoxPane;
import edu.kreyolonlineclass.familyLesson.CorrectAnswer;
import edu.kreyolonlineclass.familyLesson.MiddleBoxPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ClickedAndDroppedLabelIntoHBox {

    public ClickedAndDroppedLabelIntoHBox()  {
    }

    boolean checkIsEmpty(HBox  boxChosenWords) {
        return boxChosenWords.getChildren().isEmpty();
    }



    String getTextInLable(HBox  boxChosenWords) {
        String text = "";
        for (int i = 0; i < boxChosenWords.getChildren().size(); i++) {
            text += ((Label) (boxChosenWords.getChildren().get(i))).getText().trim() + " ";
        }
        return text;
    }




    Map<String, Integer> getBoxIndex(Label... labels) {
        HashMap<String, Integer> getBoxIndex2 = new HashMap<>();
        for (int i = 0; i < labels.length; i++) {
            getBoxIndex2.put(labels[i].getText(), i);
        }
        return getBoxIndex2;
    }



    void getEnglishWords(MiddleBoxPane middleBoxPane,Label label, int count) throws FileNotFoundException {
        List<String> list = middleBoxPane.listOfEnglishWords("englishAndKreyolWordsFile/englishWord.txt");
        label.setText(list.get(count));
    }


    void getKreyolWord(MiddleBoxPane middleBoxPane, Label[] labels, int count, HBox... hBoxes) throws FileNotFoundException {

        // File file = middleBoxPane.getFileName();
        List<String[]> myListWords = middleBoxPane.listOfCreoleWordsInArray("englishAndKreyolWordsFile/KreyolWords.txt");
        String[] arrayWord = myListWords.get(count);
        int arrayIndex = myListWords.get(count).length;
        for (int i = 0; i < arrayIndex; i++) {
            labels[i].setText(arrayWord[i].trim());
        }
        for (int i = 0; i < arrayIndex; i++) {
            labels[i].setPrefWidth(arrayWord[i].trim().length() * 15);

        }
        for (int i = 0; i < arrayIndex; i++) {
            hBoxes[i].setPrefWidth(labels[i].getPrefWidth());
        }
        for (int i = 0; i < arrayIndex; i++) {
            hBoxes[i].getChildren().clear();
        }
        for (int i = 0; i < arrayIndex; i++) {
            hBoxes[i].getChildren().add(labels[i]);
        }
    }
    void choseWord(MiddleBoxPane middleBoxPane,HBox  boxChosenWords,Button btCheck,Label[] labels, HBox... hBoxes) {
        for (HBox box : hBoxes) {
            for (Label lb : labels) {
                lb.setOnMouseClicked(e -> {

                    if (!boxChosenWords.getChildren().contains(lb)) {
                        boxChosenWords.getChildren().add(lb);
                        System.out.println(getTextInLable(boxChosenWords));middleBoxPane.getCorrectAnswerClass().setWordToCheck(getTextInLable(boxChosenWords));
                    } else {
                        hBoxes[getBoxIndex(labels).get(lb.getText())].getChildren().add(lb);
                    }
                    btCheck.setDisable(checkIsEmpty(boxChosenWords));
                });

            }
        }
    }
}


