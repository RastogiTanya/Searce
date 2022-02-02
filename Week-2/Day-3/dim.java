import java.util.*;

public class dim {
    public static void main(String[] args) {
        int[][] dim = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2 rows 3 columns
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                // System.out.println("dim[" + i + "][" + j + "] = "
                // + dim[i][j]);
            }
        }
        Scanner scn = new Scanner(System.in);

        int[][] arr = new int[2][3]; // 2 rows 3 columns
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("dim[" + i + "][" + j + "] = "
                        + dim[i][j]);
            }
        }
    }
}
