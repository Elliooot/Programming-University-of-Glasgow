public class SavingAccountTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", 17, "Male");
        Person person2 = new Person("Alice", 23, "Female");
        Person p3 = new Person("Elliot", 25, "Male");

        SavingAccount savingAccount1 = new SavingAccount(person1);
        SavingAccount savingAccount2 = new SavingAccount(person2);
        BankAccount b = new SavingAccount(p3); // Polymorphism: BankAccount -> SavingAccount
//        SavingAccount c = new BankAccount(p3); // SavingAccount cannot be cast to BankAccount

        System.out.println(savingAccount1.toString());
        savingAccount1.deposit(0, 500);
        savingAccount1.interestIncome(3.875);
        savingAccount1.withdraw(0, 155);
        System.out.println(savingAccount2.toString());
        savingAccount2.deposit(1, 1000);
        savingAccount2.interestIncome(4.25);
        savingAccount2.withdraw(1, 2000);
    }
}
