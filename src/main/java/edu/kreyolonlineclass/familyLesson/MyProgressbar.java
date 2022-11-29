package edu.kreyolonlineclass.familyLesson;

import javafx.scene.control.ProgressBar;

public class MyProgressbar {
    private double progress;
    double count=1;
    ProgressBar progressBar;
    public MyProgressbar(ProgressBar progressBar){
        this.progressBar=progressBar;
    }
    public MyProgressbar(ProgressBar progressBar,double progress){
        this.progress=progress;
        this.progressBar=progressBar;
    }

    public double getProgress() {
        return count++;

    }

    public void setProgressBar(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public ProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgress(double progress) {
       this.progressBar.setProgress(progress);
    }
}

