package Algorithm_Problems.Sorting_Algorithms;

public class SortDriver {
    public static void main(String[] args) {
        int[] arr = {9,7,6,5,4,3,2};

        System.out.print("List before sorting : ");
        Common.printData(arr);
//        BubbleSort.bubbleSort(arr);
        InsertionSort.insertionSort(arr);
    }
}
