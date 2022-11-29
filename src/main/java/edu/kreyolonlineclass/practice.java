package edu.kreyolonlineclass;

import edu.kreyolonlineclass.familyLesson.FamilyLesson1;
import edu.kreyolonlineclass.familyLesson.StackPages;
import edu.kreyolonlineclass.familyLesson.interfacePractice;

import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class practice {
    public static void main(String[] args) throws FileNotFoundException {
       String a = "8";
       System.out.println(a);
       dothidone(()->{
           System.out.println(90);
       });
    }
    static void dothidone(myinter rt){
        rt.dothis();
    }


}

interface myinter{
    void dothis();
}