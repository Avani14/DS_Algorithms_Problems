package Cash_Counter;

public class CashCounterService {
    float initialBalance = 10000.00F;
    public void withdraw(float amount)
    {
        if(amount>initialBalance)
        {
            System.out.println("Not enough balance, Please try again later");
            return;
        }
        initialBalance -= amount;
        System.out.println("Your withdraw of amount "+amount+" was successfully completed");
    }
    public void deposit(float amount)
    {
        initialBalance+=amount;
        System.out.println("Your deposit of amount "+amount+" was successfully completed");
    }
}
