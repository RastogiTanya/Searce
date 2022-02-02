import java.util.*;

public class matrixmul {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] mat1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = scn.nextInt();
            }
        }
        // r1 c1 r2 c2=3
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] mat2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = scn.nextInt();
            }
        }
        // for (int i = 0; i < r2; i++) {
        // for (int j = 0; j < c2; j++) {
        // System.out.println("mat1[" + i + "][" + j + "] = "
        // + mat2[i][j]);
        // }
        // }

        if (c1 != r2) {
            System.out.println("Invalid input");
        } else {
            int[][] res = new int[r1][c2];
            int p1 = 0;
            int q1 = 0;
            int p2 = 0;
            int q2 = 0;
            for (int i = 0; i < r1; i++) {
                // System.out.println("round- " + i);

                for (int j = 0; j < c2; j++) {

                    res[i][j] = (mat1[p1][q1] * mat2[p2][q2]) + (mat1[p1][++q1] * mat2[++p2][q2])
                            + (mat1[p1][++q1] * mat2[++p2][q2]);
                    // System.out.print("after" + p2);
                    p2 = 0;
                    q2++;
                    q1 = 0;
                }
                p1 = p1 + 1;
                q2 = 0;

            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.println("res[" + i + "][" + j + "] = "
                            + res[i][j]);
                }
            }
        }

    }
}
// a b c
// d e f
// g h i