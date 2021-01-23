import java.util.Scanner;

public class Petya_and_Strings {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String first  = sc.nextLine();
        String second = sc.nextLine();

        int state = first.compareToIgnoreCase(second);

        if(state < 0)      System.out.println(-1);
        else if(state > 0) System.out.println( 1);
        else               System.out.println( 0);
    }

}