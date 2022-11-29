package edu.kreyolonlineclass;

import javafx.scene.image.Image;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface ListOfThings<E> {

     default List<String> listOfAFileLines(File file) throws FileNotFoundException {
        ArrayList<String> listWord1 = new ArrayList<>();
        try (Scanner read = new Scanner(file)) {
            while (read.hasNextLine()) {
                listWord1.add(read.nextLine());
            }
        }
        return listWord1;
    }
     default ArrayList<String[]> listOfFileLinesInArray(File file) throws FileNotFoundException {
        ArrayList<String[]> listWord = new ArrayList<>();
        try (Scanner read = new Scanner(file)) {
            while (read.hasNextLine()) {
                listWord.add(read.nextLine().split(" "));
            }
        }
        return listWord;

    }
    default Image getImage(String fileName) {
        return new Image(getClass().getResourceAsStream("image/"+fileName));

    }
    default Image[] getImage(File file) {
        Image[] listFile = new Image[(int) file.listFiles().length];
        if (file.isDirectory()) {
            for (int i = 0; i < file.listFiles().length; i++) {
                listFile[i] = getImage(file.listFiles()[i].getName());
            }
        }
        return listFile;
    }
    default String[] getAudio(File file) {
        String[] listFile = new String[(int) file.listFiles().length];
        if (file.isDirectory()) {
            for (int i = 0; i < file.listFiles().length; i++) {
                listFile[i] = file.listFiles()[i].getName();
            }
        }
        return listFile;
    }
}
