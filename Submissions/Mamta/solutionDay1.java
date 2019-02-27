package longest;

import java.util.Scanner;

public class longestWord {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter a sentence");
	String sentence=sc.nextLine();
	sentence=sentence.trim();
	sentence=sentence+ " ";
	int l= sentence.length();// total length
	int longestlength=0;// length of longest
	String b=""; //to store the word temporarily
	
	String longestword="";// to store longest word
	for(int i=0;i<l;i++)
	{
		char c=sentence.charAt(i);
		if (c!=' ')
			b=b+c;
		else
		{
			int lt=b.length();// stored length of previous word
			if (lt>longestlength)
			{
				longestlength=lt;
				longestword=b;
				
			}
			b="";
			
		}
	}
	System.out.println("Longest word : "+longestword);

	}

}
