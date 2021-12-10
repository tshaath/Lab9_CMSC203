package sample;

public class SavingsAccount extends BankAccount{
    private double rate=0.025;
    private static int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount)
    {
        super(name,amount);
        setAccountNumber(getAccountNumber()+"-"+savingsNumber);
    }
    public void postInterest()
    {
        super.deposit((0.025*getBalance())/12);
    }
    @Override
    public String getAccountNumber()
    {
        return super.getAccountNumber();
    }
    public SavingsAccount(SavingsAccount oldAccount, double amount)
    {
        super(oldAccount, amount);
        savingsNumber+=1;
        this.accountNumber=oldAccount.accountNumber;
    }

}
