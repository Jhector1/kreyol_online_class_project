package edu.kreyolonlineclass.familyLesson;

import edu.kreyolonlineclass.familyLesson.MyProgressbar;
import javafx.scene.control.ProgressBar;
import javafx.scene.text.Text;

public class TopBoxPane {
   QuestionLabel questionLabel;
    MyProgressbar myProgressbar;
    public TopBoxPane(QuestionLabel questionLabel, MyProgressbar myProgressbar){
        this.questionLabel=questionLabel;
        this.myProgressbar=myProgressbar;
    }
    public TopBoxPane(MyProgressbar myProgressbar){

        this.myProgressbar=myProgressbar;
    }
    public  TopBoxPane(){

    }
    public MyProgressbar getMyProgressbar() {
        return myProgressbar;
    }

    public QuestionLabel getQuestionLabel() {
        return questionLabel;
    }

    public void setQuestionLabel(QuestionLabel questionLabel) {
        this.questionLabel = questionLabel;
    }


    public void setText(Text textQuestion, String text) {
        textQuestion.setText(text);
    }

    public void setMyProgressbar(MyProgressbar myProgressbar) {
        this.myProgressbar = myProgressbar;
    }
}
