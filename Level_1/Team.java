import java.util.Scanner;

public class Team {

    private static Scanner sc = new Scanner(System.in);

    private static void getFrindsOpinions(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nProblems = Integer.parseInt(sc.next());

        final int N_FRIENDS = 3;
        int[] whoIsSure = new int[N_FRIENDS];

        int problemsToBeSolved = 0;
        for(int i = 0; i < nProblems; i++) {
            getFrindsOpinions(whoIsSure);
            if(sum(whoIsSure) >= 2)
                ++problemsToBeSolved;
        }

        System.out.println(problemsToBeSolved);
    }

}