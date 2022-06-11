package Algorithm_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    static ArrayList<String> arrayOfPermutation;
    public static void swap(char[] c,int i,int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static void permute(char[] c, int index)
    {
        if(index == c.length -1)
        {
            System.out.println(String.valueOf(c));
        }
        for (int i = index; i < c.length; i++) {
            swap(c,index,i);
            permute(c,index+1);
            swap(c,index,i);
        }
    }
    public static void findPermutations(String str) {

        // base case
        if (str == null || str.length() == 0) {
            return;
        }

        permute(str.toCharArray(), 0);
    }
    public static void compare(String str1,String str2)
    {
        if(str1.equals(str2))
        {
            System.out.println("The Permutation of "+str1+" and "+str2+" are equal");
        }
        else {
            System.out.println("The Permutation of \"+str1+\" and \"+str2+\" are not equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.next();
        System.out.println("All the permutation of "+str1+" are: ");
        findPermutations(str1);
        System.out.println("Enter a string");
        String str2 = sc.next();
        System.out.println("All the permutation of "+str2+" are: ");
        findPermutations(str2);
    }

}
