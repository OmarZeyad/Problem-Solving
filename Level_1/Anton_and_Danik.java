import java.util.Scanner;

public class Anton_and_Danik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long nGames = Integer.parseInt(sc.nextLine());
        String gamesResult = sc.nextLine();

        int A = 0, D = 0;
        for(char g : gamesResult.toCharArray()) {
            if(g == 'A')
                ++A;
            else // if(g == 'D'))
                ++D;
        }

        if(A > D) System.out.println("Anton");
        else if(D > A) System.out.println("Danik");
        else System.out.println("Friendship");
    }

}