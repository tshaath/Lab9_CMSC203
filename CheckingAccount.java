package sample;

public class CheckingAccount extends BankAccount{
    private static double FEE=0.15;

    public CheckingAccount(String name, double amount)
    {
        super(name, amount);
        setAccountNumber(getAccountNumber() + "-10");
    }
@Override
    public boolean withdraw(double amount)
    {
        double feeAmount=amount+FEE;
        return super.withdraw(feeAmount);

    }
}
