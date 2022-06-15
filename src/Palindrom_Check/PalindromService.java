package Palindrom_Check;

import Common.IQueue;
import Common.Queue;

public class PalindromService {
    public void checkIfPalindrom(String str)
    {
        IQueue<Character> queue = new Queue<Character>();
        for(int i = 0;i<str.length();i++)
        {
            queue.enqueue(str.charAt(i));
        }
        queue.printData();
        int i =1;
        int flag = 0;
        while(queue.size()>0)
        {
            if(queue.dequeue() == str.charAt(str.length()-1))
            {
                flag = 1;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 0)
        {
            System.out.println("Not a palindrom ");
        }
        else {
            System.out.println("It is a palindrom");
        }
    }
}
