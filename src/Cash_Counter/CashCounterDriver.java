package Cash_Counter;

import Common.IQueue;
import Common.Queue;

import java.util.Scanner;

public class CashCounterDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQueue<Integer> q = new Queue<Integer>();
        CashCounterService ccs = new CashCounterService();
        char ans;
        char option;
        System.out.println("How many people are initially in the line");
        int count = sc.nextInt();
        for(int i = 0;i<count;i++)
        {
            q.enqueue(1);
        }
        while(!q.isEmpty()) {
                System.out.println("What would you like to perform \nEnter w for withdraw and d for deposit");
                option = sc.next().charAt(0);
                switch (option)
                {
                    case 'w':
                        System.out.println("Enter the amount you wish to withdraw");
                        float amountWithdraw = sc.nextFloat();
                        ccs.withdraw(amountWithdraw);
                        q.dequeue();
                        break;
                    case 'd':
                        System.out.println("Enter the amount you wish to deposit");
                        float amountDeposit = sc.nextFloat();
                        ccs.deposit(amountDeposit);
                        q.dequeue();
                        break;

                }
                if(q.isEmpty())
                {
                    System.out.println("Are there people in line\nEnter y for yes and n for no");
                    ans = sc.next().charAt(0);
                    if(ans == 'y'){
                        q.enqueue(1);
                    }
                }
        }
    }

}
