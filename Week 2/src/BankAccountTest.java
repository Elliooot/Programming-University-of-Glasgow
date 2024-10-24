public class BankAccountTest {
    public static void main(String[] args){
        Person person1 = new Person("Jack", 17, "Male");
        Person person2 = new Person("Alice", 23, "Female");
        BankAccount account1 = new BankAccount(person1);
        BankAccount account2 = new BankAccount(person2);
        BankAccount account3 = new BankAccount(person1);
//        System.out.println(account1.getAccountNumber());
//        System.out.println(account2.getAccountNumber());
//        System.out.println(account1.getBalance());
        account1.deposit(0, 5.0);
//        System.out.println(account1.getBalance());
        account1.withdraw(0, 1.6);
//        System.out.println(account1.getBalance());
        account2.deposit(1, 70);
        account2.deposit(1, 300);
        account2.withdraw(1, 170);
        account3.deposit(2, 100);
    }
}
