public class TransactionAccount extends BankAccount {

    private final double overDraftLimit = 500;

    public TransactionAccount( String accountNumber,  String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There isn't interest in this account.");
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = balance + overDraftLimit; 

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }

        if (amount > availableBalance) {
            System.out.println("Withdrawal denied! You can withdraw up to " + availableBalance);
        } else {
            balance -= amount; 
            System.out.println("Withdrawal successful!\nNew balance: " + balance);
        }
    }
}
