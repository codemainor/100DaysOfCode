package com.codz;

import java.util.Scanner;

public class SolutionDay2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a sentence : ");

    String sentence = scan.nextLine().toLowerCase();

    int count = 0;

    for(int i=0; i<sentence.length(); i++){
      char j = sentence.charAt(i);
      if ( j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u' ){
        count++;
      }
    }
    System.out.println("Number of vowels in sentence is " + count);
  }
}
