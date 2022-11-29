package edu.kreyolonlineclass.familyLesson;

import java.util.Stack;

public class StackPages {
  private static Stack<String> dynamicPages = new Stack<>();

    public static Stack<String> getDynamicPages() {
        return dynamicPages;
    }
    public static String getPage(){
        return dynamicPages.pop();
    }

}

