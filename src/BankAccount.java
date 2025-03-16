public abstract class BankAccount{

        private final String accountNumber;
        private String accountHolderName;   
        protected double balance; 

        public BankAccount(String accountNumber, String accountHolderName, double balance) {
            
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName; 
            this.balance = balance; 

        }

        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        
        public String getAccountHolderName() {
            return accountHolderName;
        }
        
        public String getAccountNumber() {
            return accountNumber;
        }
        
        public void setBalance(double balance){
            this.balance = balance;
        }
        public double getBalance() {
            return balance;
        }

        public abstract void calculateInterest();

        public void deposit(double amount){
           if ( amount > 0) {
            balance += amount;
            System.out.println("Account number " + accountNumber + ": +" + amount);
           }

           else {
            System.out.println("Wrong value for deposit");
           }
        }

        public void withdraw(double amount){

            if ( amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Account number " + accountNumber + ": -" + amount);
               }
    
               else {
                System.out.println("Wrong value for withdraw");
    
               }
        }

    }
