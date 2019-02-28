package com.codz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionDay1 {

  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    String sentence = getSentence();
    String[] wordArray = getEachWord(sentence);
    ArrayList<String> wordsInList = storeWordsInArrayLists(wordArray);
    getLongestWord(wordsInList);


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
    System.out.println("Output: " + largestWord );
    System.out.println("=========================================");
  }


}
