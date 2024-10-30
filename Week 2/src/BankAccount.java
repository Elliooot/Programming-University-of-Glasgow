public class BankAccount {
    protected Person person; protected int accountNumber;
    protected double balance; private static int nextAccountNumber = 53240;

    public BankAccount(Person p){
        person = p;
        accountNumber = nextAccountNumber++;
        balance = 0.0;
    }

    public void deposit(int a, double f){
        balance += f;
        System.out.println(toString());
    }
    public void withdraw(int a, double f){
        balance -= f;
        System.out.println(toString());
    }

    public Person getPerson(){ return person; }
    public int getAccountNumber(){ return accountNumber; }
    public double getBalance(){ return balance; }

    @Override
    public String toString() {
        return person.getName() + "(" + accountNumber + "): " + "£" + balance;
    }
}
