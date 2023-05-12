public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.printIn("Array setelah diurutkan:");
        printArray (arr);

        int[]arr2 = {64, 34, 25, 12, 22, 11, 90};
        insertionsort(arr2);
        system.out.printIn ("array 2 setelah diurutkan");
        printArray(arr2);

        int[]arr3 = {64, 34, 25, 12, 22, 11, 90};
        selectionsort(arr3);
        system.out.printIn("array 3 setelah diurutkan");
        printArray(arr3);
}

public static void insertionsort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) 
    {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] >key) {
            arr[j + 1] = arr[j];
            j = j -1;
        }
    }    arr[j + 1] = key;
}    
