import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class Boy_or_Girl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Set<Character> distinctChars = new HashSet<>();
        for(char ch : name.toCharArray()) {
            distinctChars.add(ch);
        }

        System.out.println((distinctChars.size() % 2 == 0) ?
                           "CHAT WITH HER!" : "IGNORE HIM!");
    }

}