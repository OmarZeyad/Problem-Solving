import java.util.Scanner;

public class Word_Capitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder capWord = new StringBuilder(word);
        capWord.setCharAt( 0, Character.toUpperCase(capWord.charAt(0)) );

        System.out.println(capWord.toString());
    }

}