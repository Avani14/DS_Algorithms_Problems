package Algorithm_Problems.Sorting_Algorithms;

public class MergeSort {
    public static void sort(int[] arr,int l,int r)
    {
        l=0;
        r=arr.length-1;
        int m=l+(r-1)/2;
        if(l<r)
        {
            sort(arr,l,m);
            sort(arr,m+1,r);
            mergeSort(arr,l,m,r);
        }
    }
    public static void mergeSort(int[] arr,int l ,int m, int r)
    {
        int num1 = m - l + 1;
        int num2 = r - m;
        int[] leftArray = new int[num1];
        int[] rightArray = new int[num2];
        for(int i = 0 ; i < num1 ; ++i)
        {
            leftArray[i] = arr[l+i];
        }
        for(int i = 0 ; i < num2 ; ++i)
        {
            rightArray[i] = arr[m+1+i];
        }
        int i=0,j=0;
        int k = l;
        while(i < num1 && j < num2)
        {
            if(leftArray[i]<rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<num1)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<num2)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
