import java.util.Scanner;

public class DeleteTenthArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Get 10 elements from the user
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the position x from the user
        System.out.println("Enter the position x (1-10):");
        int x = scanner.nextInt();

        // Calculate the x^10 position
        int x10 = (int) Math.pow(x, 10) % 10; // Modulo 10 to stay within array bounds

        // Print the original array
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Delete the element at position x^10
        System.out.println("Deleting element at position " + x10);
        for (int i = x10; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Print the modified array
        System.out.println("Modified array:");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
