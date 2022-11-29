package edu.kreyolonlineclass;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuizPane {
   public String name;

    public QuizPane() throws FileNotFoundException {
    }


    public String getName() {
        return name;
    }

    public void imageOnClicked(Label label, Button btCheck) {
        btCheck.setDisable(false);
        name = label.getText().trim();
        System.out.println(name);
    }
    <E>void shuffleLists(Long seed,List<?>... lists){
        for(List<?> lst: lists){
            Collections.shuffle(lst, new Random(seed));
        }
    }
    void setLabelTextFor(List<String> nameTitleList,Label... labels){
        for(int i=0; i<3; i++){
            labels[i].setText(nameTitleList.get(i));
//            labels[i].setStyle("    -fx-pref-width: 153px;\n" +
//                    "    -fx-pref-height: 188px;\n" +
//                    "    -fx-background-color: white;");
        }
    }
    void setLabelGraphicFor(List<Image> imageViewArrayList,ImageView... imageViews){
        for(int i=0; i<3; i++){
            imageViews[i].setImage(imageViewArrayList.get(i));
        }
    }
    void setButtonAndLabelState(boolean state1, boolean state2,Button btCheck,Button btContinue, Label labelCorrection){
        btCheck.setVisible(state1);
        btCheck.setDisable(state1);
        btContinue.setVisible(state2);
        labelCorrection.setVisible(state2);
    }


}
