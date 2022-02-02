import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = row - 1;
        int maxc = col - 1;
        int count = 0;
        int totalele = row * col;
        while (count < row * col) {
            for (int i = minr, j = minc; i <= maxr && count < totalele; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            for (int i = maxr, j = minc; j <= maxc && count < totalele; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            for (int i = maxr, j = maxc; i >= minr && count < totalele; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            for (int i = minr, j = maxc; j >= minc && count < totalele; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}
