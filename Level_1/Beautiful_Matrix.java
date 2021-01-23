import java.util.Scanner;

public class Beautiful_Matrix {

    // i -> row, j -> column
    static final int MATRIX_ROWS = 5, MATRIX_COLUMNS = 5;
    static int[][] matrix = new int[MATRIX_ROWS][MATRIX_COLUMNS];

    private static void move(int iFrom, int jFrom, int iTo, int jTo) {
        int temp;

        temp                 = matrix[iTo][jTo];
        matrix[iTo][jTo]     = matrix[iFrom][jFrom];
        matrix[iFrom][jFrom] = temp;;
    }

    public static void main(String[] args) {
        // fill the matrix, and remember where the 1 is
        Scanner sc = new Scanner(System.in);

        int iOfSingleOne = 0, jOfSingleOne = 0;
        for(int i = 0; i < MATRIX_ROWS; i++) {
            for (int j = 0; j < MATRIX_COLUMNS; j++) {
                int val = Integer.parseInt(sc.next());
                if(val == 1) {
                    iOfSingleOne = i;
                    jOfSingleOne = j;
                }
                matrix[i][j] = val;
            }
        }

        // moving decisions
        int nMoves = 0;
        final int I_MID = MATRIX_ROWS / 2, J_MID = MATRIX_COLUMNS / 2;
        while(iOfSingleOne != I_MID || jOfSingleOne != J_MID) {
            if(iOfSingleOne < I_MID) {
                move(iOfSingleOne, jOfSingleOne, iOfSingleOne + 1, jOfSingleOne);
                ++iOfSingleOne;
            }
            else if(iOfSingleOne > I_MID) {
                move(iOfSingleOne, jOfSingleOne, iOfSingleOne - 1, jOfSingleOne);
                --iOfSingleOne;
            }
            else if(jOfSingleOne < J_MID) {
                move(iOfSingleOne, jOfSingleOne, iOfSingleOne, jOfSingleOne + 1);
                ++jOfSingleOne;
            }
            else if(jOfSingleOne > J_MID) {
                move(iOfSingleOne, jOfSingleOne, iOfSingleOne, jOfSingleOne - 1);
                --jOfSingleOne;
            }

            ++nMoves;
        }

        System.out.println(nMoves);
    }

}