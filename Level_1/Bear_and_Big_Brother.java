import java.util.Scanner;

public class Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt( sc.next() ); // Limak's weight
        int b = Integer.parseInt( sc.next() ); // Bob's weight

        int nYears = 0;
        while(a <= b) {
            a *= 3; // triple Limak's weight
            b *= 2; // double Bob's weight

            ++nYears;
        }

        System.out.println(nYears);
    }

}