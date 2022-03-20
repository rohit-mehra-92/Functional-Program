import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        findTriplets(array, n);
    }

    static void findTriplets(int[] array, int n) {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.print(array[i]);
                        System.out.print(" ");
                        System.out.print(array[j]);
                        System.out.print(" ");
                        System.out.print(array[k]);
                        System.out.print("\n");
                        found = true;

                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");

    }

}