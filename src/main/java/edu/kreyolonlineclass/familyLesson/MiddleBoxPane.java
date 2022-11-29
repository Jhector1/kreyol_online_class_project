package edu.kreyolonlineclass.familyLesson;

import edu.kreyolonlineclass.ListOfThings;
import edu.kreyolonlineclass.Main;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MiddleBoxPane implements ListOfThings {


    private CorrectAnswer correctAnswer;
    public boolean thruth;


    public MiddleBoxPane(CorrectAnswer correctAnswer) {
        this.correctAnswer = correctAnswer;

    }

    public MiddleBoxPane()  {


    }

    public Image getImage(String fileName) {
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream("image/" + fileName)));

    }

    public boolean checkCorrectAnswer(String word, String word2) {
        return word.equals(word2);

    }

    public void setCorrectAnswer(CorrectAnswer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public CorrectAnswer getCorrectAnswerClass() {
        return correctAnswer;
    }

    public File getFileName(String filename) {
        return new File(getClass().getResource( filename).getFile());
    }
    public List<Image> listOfImages(String filename) {
        return Arrays.asList(getImage(getFileName(filename)));

    }
    public List<String> listOfCreoleWords(String filename) throws FileNotFoundException {

            return listOfAFileLines(getFileName(filename));
    }
    public List<String[]> listOfCreoleWordsInArray(String filename) throws FileNotFoundException {

        return listOfFileLinesInArray(getFileName(filename));
    }

    public List<String> listOfEnglishWords(String filename) throws FileNotFoundException {
         return listOfAFileLines(getFileName(filename));


    }

    public List<String> listOfAudios(String filename) {
        return Arrays.asList(getAudio(getFileName(filename)));

    }

    public void imageOnClicked(Label label, Button btCheck) {
        thruth = false;

        try {
            new MediaPlayer(new Media(getClass().getResource("audio/" + new FamilyLesson1().listAudioFile.get(new FamilyLesson1().nameTitleList.indexOf(label.getText().trim()))).toExternalForm())).play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        labelOnClicked(label);
        btCheck.setDisable(false);
        correctAnswer.setWordToCheck(label.getText().trim());
       // new Main().getScene().getStylesheets().add(getClass().getResource("myStyleSheet.css").toExternalForm());
        //isHover(label);
        label.getStyleClass().add(".labelOnHover");


    }

    boolean labelOnClicked(Label... labels) {
        for (Label lb : labels) {

            lb.setStyle("-fx-pref-width: 163px;\n" +
                    "    -fx-pref-height: 198px;\n" +
                    "    -fx-background-color: lightsteelblue;");
        }
        return true;
    }

    public static <E> void shuffleListsWithCommonSeed(Long seed, List<?>... lists) {
        for (List<?> lst : lists) {
            Collections.shuffle(lst, new Random(seed));
        }
    }

    public void setLabelGraphicFor(List<Image> imageViewArrayList, ImageView... imageViews) {
        for (int i = 0; i < 3; i++) {
            imageViews[i].setImage(imageViewArrayList.get(i));
        }
    }
        void setLabelDefault(Label... labels) {
        for (Label lb : labels) {
            lb.setStyle("    -fx-pref-width: 153px;\n" +
                    "    -fx-pref-height: 188px;\n" +
                    "    -fx-background-color: transparent;");
        }
    }
    boolean isHover(Label... labels) {
        for (Label lb : labels) {
            lb.setOnMouseEntered(e -> {
                lb.setStyle("-fx-pref-width: 163px;\n" +
                        "    -fx-pref-height: 198px;\n" +
                        "    -fx-background-color: lightsteelblue;");
            });
        }
        return true;
    }

    boolean notHover(Label... labels) {
        if (thruth == true) {
            for (Label lb : labels) {

                lb.setOnMouseExited(e -> {

                    lb.setStyle("    -fx-pref-width: 153px;\n" +
                            "    -fx-pref-height: 188px;\n" +
                            "    -fx-background-color: transparent;");
                });
            }
        }
        return true;
    }

    public void setLabelTextFor(List<String> nameTitleList, Label... labels) {
        for (int i = 0; i < 3; i++) {
            labels[i].setText(nameTitleList.get(i));
            labels[i].getStyleClass().add(".labelOnHover");
            //isHover(labels);
          //  notHover(labels);

        }
    }

}
