import java.util.ArrayList;

public class BankCustomers {

    private ArrayList<BankAccount> accountsList;

    public BankCustomers() {
        accountsList = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        if (accountsList.isEmpty()) {
            System.out.println("No accounts available");
            return;
        }
        System.out.println("Account List\n");
        for (BankAccount account : accountsList) {
            System.out.println("Account Holder Name: " + account.getAccountHolderName() +"\nAccount Number: " + account.getAccountNumber() +"\nBalance: " + account.getBalance() + "\n");
        }
    }


    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account found\n" + "Account Holder: " + account.getAccountHolderName() +"\nBalance: " + account.getBalance());
                return account;
            }
        }
        System.out.println("Error: Account not found");
        return null;
    }
}

