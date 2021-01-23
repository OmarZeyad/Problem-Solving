import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Gravity_Flip {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nBoxColumns = Integer.parseInt(sc.next());

        ArrayList<Integer> columns = new ArrayList<>();
        while(nBoxColumns > 0) {
            columns.add(Integer.parseInt(sc.next()));
            --nBoxColumns;
        }

        Collections.sort(columns);

        System.out.print(columns.get(0));
        for (int i = 1; i < columns.size(); i++) {
            System.out.print(" " + columns.get(i));
        }

        System.out.println();
    }

}