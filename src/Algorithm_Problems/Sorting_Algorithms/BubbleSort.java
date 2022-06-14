package Algorithm_Problems.Sorting_Algorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        int count = arr.length;
        int temp;
        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.print("List after sorting : ");
        System.out.println();
        Common.printData(arr);
    }

}
