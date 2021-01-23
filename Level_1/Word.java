import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int uppCount = 0, lowCount = 0;
        for(char ch : word.toCharArray()) {
            if(Character.isUpperCase(ch))
                ++uppCount;
            else
                ++lowCount;
        }

        System.out.println( (uppCount > lowCount) ?
                            word.toUpperCase() : word.toLowerCase());
    }

}