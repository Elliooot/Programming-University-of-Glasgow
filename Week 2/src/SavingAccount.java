public class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(Person p){// check private -> protected
        super(p);
    }

    public void withdraw(int a, double f){
        if(f <= balance){
            balance -= f;
            System.out.println(toString());
        }else{
            System.out.println("Cannot Overdrawn");
        }
    }

    public void interestIncome(double interestRate){
        double interest = balance * interestRate / 100.0;
        balance += interest;
        System.out.println(toString());
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public String toString() {
        return person.getName() + "(" + accountNumber + "): " + "£" + balance;
    }
}
