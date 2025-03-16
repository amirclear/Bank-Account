public class Main {
    public static void main(String[] args) {
        
    BankCustomers bank = new BankCustomers();

    TransactionAccount account1 = new TransactionAccount("1000", "Amir", 1000);
    TransactionAccount account2 = new TransactionAccount("1001","Ali" , 1500);
    TransactionAccount account3 = new TransactionAccount("1002","Sadra" , 2000);

    SavingsAccount save1 = new SavingsAccount("2000","Mohammad" , 1500);
    SavingsAccount save2 = new SavingsAccount("2001","Arya" , 2000);
    SavingsAccount save3 = new SavingsAccount("2002","Hosein" , 1000);
    
    bank.addAccount(account1);
    bank.addAccount(account2);
    bank.addAccount(account3);

    bank.addAccount(save1);
    bank.addAccount(save2);
    bank.addAccount(save3);  

    System.out.println("Exist Account");
    bank.findAccount("1000");
    System.out.println("");

    System.out.println("non-Exist Account");
    bank.findAccount("9999");
    System.out.println("");

    System.out.println("Initial Balance Of Account Number " + account1.getAccountNumber() + ": " + account1.getBalance());
    account1.deposit(500);
    System.out.println("Initial Balance Of Account Number " + account1.getAccountNumber() + ": " + account1.getBalance());

    System.out.println("");
    System.out.println("Initial Balance Of Account Number " + account2.getAccountNumber() + ": " + account2.getBalance());
    account2.deposit(-500);

    System.out.println("\nCalculate Interest\n");
    account1.calculateInterest();
    System.out.println("");
    save1.calculateInterest();
    System.out.println("");

    System.out.println("Initial Balance Of Account Number " + account1.getAccountNumber() + " after interset: " + account1.getBalance());
    System.out.println("");
    System.out.println("Initial Balance Of Account Number " + save1.getAccountNumber() + " after interset: " + save1.getBalance());

    System.out.println("\nWithdraw Account");
    account1.withdraw(100);  
    System.out.println("");
    account2.withdraw(-500);
    System.out.println(""); 
    account3.withdraw(10000);
    System.out.println("");

    save1.withdraw(-5);
    System.out.println("");
    save2.withdraw(6000);
    System.out.println("");
    save3.withdraw(500);
    System.out.println("");


    bank.showAllBalances();
    }
    
}
