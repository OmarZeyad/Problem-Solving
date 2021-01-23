import java.util.Scanner;
import java.util.ArrayList;

public class Vanya_and_Fence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());

        ArrayList<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(Integer.parseInt(sc.next()));
        }

        int roadWidth = 0;
        for(int i : heights) {
            if(i > h)
                roadWidth += 2;
            else // if(i <= h)
                roadWidth += 1;
        }

        System.out.println(roadWidth);
    }

}