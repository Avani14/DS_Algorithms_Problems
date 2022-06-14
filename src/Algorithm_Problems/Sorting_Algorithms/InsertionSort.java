package Algorithm_Problems.Sorting_Algorithms;

public class InsertionSort{
    public static void insertionSort(int[] arr)
    {
        int temp;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i-1; j>=0 && temp<arr[j]; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.print("List after sorting is : ");
        Common.printData(arr);
    }

}
