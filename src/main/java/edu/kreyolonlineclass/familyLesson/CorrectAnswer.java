package edu.kreyolonlineclass.familyLesson;

public class CorrectAnswer {
    private String wordToCheck;
    private String correctWord;
    public CorrectAnswer(){

    }public CorrectAnswer(String correctWord){
        this.correctWord=correctWord;
    }
    public CorrectAnswer(String wordToCheck, String correctWord){
        this.wordToCheck=wordToCheck;
        this.correctWord=correctWord;
    }

    public String getWordToCheck() {
        return wordToCheck;
    }

    public String getCorrectWord() {
        return correctWord;
    }

    public void setWordToCheck(String wordToCheck) {
        this.wordToCheck = wordToCheck;
    }

    public void setCorrectWord(String correctWord) {
        this.correctWord = correctWord;
    }

    public boolean checkCorrectAnswer(){
        return wordToCheck.trim().equals(correctWord.trim());
    }
    public boolean checkCorrectAnswer(String correctWord){
        return wordToCheck.trim().equals(correctWord.trim());
    }
}
