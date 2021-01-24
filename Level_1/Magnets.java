import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nMagnets = Integer.parseInt(sc.nextLine());

        StringBuilder magnetsArrangement = new StringBuilder();
        while(nMagnets > 0) {
            String position = sc.nextLine();
            magnetsArrangement.append(position);
            --nMagnets;
        }

        int groupsCount = 0;

        if(!magnetsArrangement.toString().isEmpty()) {
            groupsCount = 1;  // hence, it has at least one group

            // if two similar poles are next to each other, then a new group follows
            for(int i = 1; i < magnetsArrangement.length(); ++i) {
                if(magnetsArrangement.charAt(i) == magnetsArrangement.charAt(i - 1))
                    ++groupsCount;
            }
        }

        System.out.println(groupsCount);
    }

}