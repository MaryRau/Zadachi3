// задача 6
public class BankAccount {
    private int accountNumber;
    private float balance;

    public int getAccount()
    {
        return accountNumber;
    }

    public float getBalance()
    {
        return balance;
    }

    public void addMoney(float sum)
    {
        this.balance += sum;
    }

    public void subMoney(float sum)
    {
        this.balance -= sum;
    }
}