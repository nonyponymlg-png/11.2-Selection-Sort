import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
            arr2[i] = arr1[i]; // Copy array for recursive sorting
        }
        
        // Display original array
        System.out.println("Original array:");
        printArray(arr1);
        
        // Sort and display sorted array (Iterative)
        insertionSortIterative(arr1);
        System.out.println("Sorted array (Iterative):");
        printArray(arr1);
        
        // Sort and display sorted array (Recursive)
        insertionSortRecursive(arr2, n);
        System.out.println("Sorted array (Recursive):");
        printArray(arr2);
        
        scanner.close();
    }

  // Iterative insertion sort method
    public static void insertionSortIterative(int[] arr) {
        int start = 1;
        while (start < arr.length) {
            int i = arr[start];
            int j = start-1;

            while (j >= 0 && arr[j] > i) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = i;
            start++;
        }
    }

    // Recursive insertion sort method
    public static void insertionSortRecursive(int[] arr, int n) {
        if(n<=1) {
            return;
        }
        insertionSortRecursive(arr, n-1);
        int l=arr[n-1];
        int j=n-2;
        while (j >= 0 && arr[j] > l) {
                arr[j+1] = arr[j];
                j--;
        }
        arr[j+1] = l;
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
