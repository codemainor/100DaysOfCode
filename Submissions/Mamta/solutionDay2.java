import java.util.Scanner;

public class CountVowels {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println(" enter a sentence");
    String sentence=sc.nextLine();
    int count=0;
    int length= sentence.length();
    for(int i=0;i<length;i++)
    {
      char c=sentence.charAt(i);
      if (c== ('a') | c== ('e') |c== ('i') |c== ('o') |c== ('u') )
      {
        count++;
      }
    }
    System.out.println(" Number of vowels in the sentence are : "+ count);

  }

}
