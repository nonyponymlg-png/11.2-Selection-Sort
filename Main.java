public class Main {
    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13};
        System.out.println("Original Array: ");
        printArray(array);
        
        selectionSort(array);
        
        System.out.println("Sorted Array: ");
        printArray(array);
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[min]>array[j]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

}
