public class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(Person customer, double interestRate){// check private -> protected
        super(customer);
        this.interestRate = interestRate;
    }

    public void withdraw(double amount){
        if(amount > getBalance()){
            throw new InsufficientFundsException();
        }else{
            super.withdraw(amount); // avoids code duplication
        }
    }

    public void interestIncome(double interestRate){
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
        System.out.println(toString());
    }

    public String toString() {
        return super.toString() + " (savings)";
    }
}
