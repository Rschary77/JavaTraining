public class SavingsAccount extends BankAccount{
    public void deposit()
    {
        System.out.println("depositing in savings account");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw amount from savings account");

    }
}
