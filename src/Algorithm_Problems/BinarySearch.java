package Algorithm_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(String[] arrayOfStr,String word)
    {
        int front = 0,rear = arrayOfStr.length-1;
        int middle;
        while(front < rear)
        {
            middle = front + (rear - 1) / 2;
            int result = word.compareTo(arrayOfStr[middle]);
            if(result == 0)
            {
                return middle;
            }
            if(result > 0)
            {
                front = middle + 1;
            }
            else
            {
                rear = middle-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line :");
        String line = sc.nextLine();
        System.out.println("Enter the word you wish to search :");
        String word = sc.next();
        String[] arrayOfString = line.split(" ");

        Arrays.sort(arrayOfString);
        System.out.println("Sorted array is");
        for (String w:arrayOfString) {
            System.out.print(w+" ");
        }
        System.out.println();
        int result = binarySearch(arrayOfString,word);
        if(result == -1)
        {
            System.out.println("String "+ word+" is not present in the line "+line);
        }
        else {
            System.out.println("String "+word+" is present are index "+result);
        }
    }
}
