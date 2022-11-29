package edu.kreyolonlineclass.familyLesson;

import javafx.scene.text.Text;

public class QuestionLabel {
    Text textQuestion;
    String noun;

    public  QuestionLabel(Text textQuestion, String noun){
        this.textQuestion=textQuestion;
        this.noun=noun;
    }
    public QuestionLabel(){

    }

    public Text getTextQuestion() {
        return textQuestion;
    }

    public String getNoun() {
        return noun;
    }

    public void setTextQuestion(Text textQuestion) {
        this.textQuestion = textQuestion;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }
}
