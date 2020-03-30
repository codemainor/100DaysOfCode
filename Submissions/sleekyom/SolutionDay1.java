import java.util.Scanner;

public class SolutionDay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your desired statement : ");

        String word = scanner.nextLine();

        String[] array = word.split(" ");

        array.toString().replaceAll("[^\\w\\s]","");

        System.out.println("The longest string in your input is : " + longestString(array));


    }

    public static String longestString(String[] array) {
        int index = 0;
        int elementLength = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > elementLength) {
                index = i;
                elementLength = array[i].length();
            }

        }
        return array[index];
    }
}
