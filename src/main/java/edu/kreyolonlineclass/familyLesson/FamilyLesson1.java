package edu.kreyolonlineclass.familyLesson;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.io.FileNotFoundException;
import java.util.List;

public class FamilyLesson1 {

    @FXML
  private   HBox box;


    @FXML
   private Label label;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Button btCheck;
    @FXML
    private  Button btContinue;
    @FXML
    private Label labelCorrection;

    private BottomBoxPane bottomBoxPane = new BottomBoxPane();
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Text textQuestion;

    private MiddleBoxPane middleBoxPane = new MiddleBoxPane(new CorrectAnswer("Tigason an"));
    public List<String> nameTitleList = middleBoxPane.listOfCreoleWords("englishAndKreyolWordsFile/lesson1KreyolWord.txt");
    public List<String> nameQuestionList = middleBoxPane.listOfEnglishWords("englishAndKreyolWordsFile/lesson1EnglishWord.txt");

    List<String> listAudioFile = middleBoxPane.listOfAudios("audio");
    List<Image> imageViewArrayList= middleBoxPane.listOfImages("image");
    @FXML
    ImageView imageView1;
    @FXML
    ImageView imageView2;
    @FXML
    ImageView imageView3;
    @FXML
    ImageView arrow;
    int count = 0;
    TopBoxPane topBoxPane = new TopBoxPane(new QuestionLabel(), new MyProgressbar(progressBar));


    public FamilyLesson1() throws FileNotFoundException {

    }
    @FXML
    public void goBackTo(MouseEvent event){
        new GoTo().page(event,StackPages.getPage());
    }

    @FXML
    void clickImage() throws FileNotFoundException {
        middleBoxPane.imageOnClicked(label, btCheck);
    }

    @FXML
    void clickImage1()  {
        middleBoxPane.imageOnClicked(label1, btCheck);
    }

    @FXML
    void clickImage2() {
        middleBoxPane.imageOnClicked(label2, btCheck);
    }

    @FXML
    void checkName() {
        bottomBoxPane.checkName(topBoxPane, middleBoxPane, progressBar, labelCorrection, btCheck, btContinue, box, 11);

    }

    //Action when the continue button is clicked
    @FXML
    void continueAction() {

        middleBoxPane.thruth = true;
        bottomBoxPane.setFill(box, "white");
        bottomBoxPane.setButtonAndLabelState(true, false, btCheck, btContinue, labelCorrection);
        long seed = System.nanoTime();
        middleBoxPane.setLabelDefault(label, label1, label2);
        if (count < 10) {
            //shuffle the list with common seed so the same data can be accessed through same index
            MiddleBoxPane.shuffleListsWithCommonSeed(seed, imageViewArrayList, nameTitleList, nameQuestionList, listAudioFile);
            middleBoxPane.setLabelTextFor(nameTitleList, label, label1, label2);
            middleBoxPane.setLabelGraphicFor(imageViewArrayList, imageView1, imageView2, imageView3);
            topBoxPane.getQuestionLabel().setNoun(nameQuestionList.get((int) (Math.random() * 3)));
            topBoxPane.setText(textQuestion, "Which one of these is the \"" + topBoxPane.getQuestionLabel().getNoun() + "\"?");
            //set the correct word to be compared
            // by getting the index of the english word to be translated
            // and parse that index to the list of creole word to be set the correct word
            middleBoxPane.getCorrectAnswerClass().setCorrectWord(nameTitleList.get(nameQuestionList.indexOf(topBoxPane.getQuestionLabel().getNoun())));
            count++;
        } else
            btContinue.setDisable(true);

    }
}
