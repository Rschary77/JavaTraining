public class CurrentAccount extends BankAccount{
    @Override
    public void deposit() {
        System.out.println("depositing amount in current account ");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw amount current account");

    }
}

