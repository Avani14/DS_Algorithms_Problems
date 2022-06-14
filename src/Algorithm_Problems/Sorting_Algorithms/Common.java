package Algorithm_Problems.Sorting_Algorithms;

public class Common implements ICommon {

    @Override
    public void printList(int[] arr)
    {
        int count = arr.length;
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printData(int[] arr) {
        Common c= new Common();
        c.printList(arr);
    }
}
