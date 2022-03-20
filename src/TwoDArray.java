import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n;

        System.out.print("Enter the number of Row");
        m = sc.nextInt();

        System.out.println();

        System.out.print("Enter the number of Column");
        n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter Element");
                arr[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Printing element");
        for (int i = 0; i < m; i++)
        {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
    }
}

