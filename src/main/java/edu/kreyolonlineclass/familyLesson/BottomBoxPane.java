package edu.kreyolonlineclass.familyLesson;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class BottomBoxPane {
    public BottomBoxPane() {

    }
    public void checkName(TopBoxPane topBoxPane, MiddleBoxPane middleBoxPane, ProgressBar progressBar, Label labelCorrection, Button btCheck, Button btContinue, HBox box ,int count) {
        topBoxPane.getMyProgressbar().setProgressBar(progressBar);
        if (middleBoxPane.getCorrectAnswerClass().checkCorrectAnswer()) {
           new MediaPlayer(new Media(getClass().getResource("tada.mp3").toExternalForm())).play();
            topBoxPane.getMyProgressbar().setProgress((topBoxPane.getMyProgressbar().getProgress() / count));
            setButtonAndLabelState(false, true, btCheck, btContinue, labelCorrection);
            setLabelCorrection(labelCorrection, "Well done");
            setFill(box, "green");
        } else {
          new MediaPlayer(new Media(getClass().getResource("error.mp3").toExternalForm())).play();

            setButtonAndLabelState(false, true, btCheck, btContinue, labelCorrection);
            setLabelCorrection(labelCorrection, "Correct Answer:\n" + middleBoxPane.getCorrectAnswerClass().getCorrectWord());
            setFill(box, "red");
        }

    }

    public void setButtonAndLabelState(boolean state1, boolean state2, Button btCheck, Button btContinue, Label labelCorrection) {
        btCheck.setVisible(state1);
        btCheck.setDisable(state1);
        btContinue.setVisible(state2);
        labelCorrection.setVisible(state2);
    }

    public void setFill(Node node, String color) {
        node.setStyle("-fx-background-color: " + color);

    }

    public void setLabelCorrection(Label labelCorrection, String text) {
        labelCorrection.setText(text);
    }

}
