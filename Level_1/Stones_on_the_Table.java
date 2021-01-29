import java.util.Scanner;


public class Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int nStones   = Integer.parseInt( sc.nextLine() );
        String colors = sc.nextLine();

        int removedStones = 0;
        for(int i = 0; i < colors.length() - 1; ++i) {
            if(colors.charAt(i) == colors.charAt(i + 1))
                ++removedStones;
        }

        System.out.println(removedStones);
    }

}