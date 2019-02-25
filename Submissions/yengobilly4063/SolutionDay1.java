package com.codz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionDay1 {

  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    boolean quit = false;

    while(!quit){
      int choice = getChoice();
      switch (choice){
        case 0:
          System.out.println("Ending program");
          quit = true;
          break;
        case 1:
          getLongestWord(storeWordsInArrayLists(getEachWord(getSentence())));
          break;
      }
    }

  }








  private static String getSentence(){
    System.out.print("Enter Sentence :");
    String sentence = scan.nextLine();

    return sentence;
  }

  private static String[] getEachWord(String sentence){
    String[] splitWords = sentence.split("\\W+");

    return splitWords;
  }

  private static ArrayList<String> storeWordsInArrayLists(String[] splitWords){
    ArrayList<String> arrayListOfWords = new ArrayList<String>();

    for (String word : splitWords){
      System.out.println("Storing word " + word + " | Length :" + word.length());
      arrayListOfWords.add(word);
    }

    return arrayListOfWords;
  }

  private static void getLongestWord(List<String> arrayListOfWords){
     String largestWord = arrayListOfWords.get(0);
     for (int i=1; i<arrayListOfWords.size(); i++){
       if (arrayListOfWords.get(i).length() > largestWord.length()){
         largestWord = arrayListOfWords.get(i);
       }
     }
    System.out.println("=========================================");
    System.out.println("First Longest word is " + largestWord );
    System.out.println("=========================================");
  }



  ///Just to get choice values and to restrict the inout to numbers
  private static int getChoice() {

    boolean stop = false;
    while (!stop) {
      System.out.println("(1=Play || 0=quit)");
      System.out.print("Enter Choice :");
      boolean hasNextInt = scan.hasNextInt();
      if (hasNextInt) {
        int choice = scan.nextInt();
        scan.nextLine();
        stop = true;
        return choice;
      }
      System.out.println("Invalid input\n");
      scan.nextLine();
    }
    return -1;
  }

}
