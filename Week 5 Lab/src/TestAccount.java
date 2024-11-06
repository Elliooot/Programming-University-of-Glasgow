public class TestAccount {
    public static void main(String[] args) {
        Person p = new Person("Bill", 56, "blue");
        SavingAccount s = new SavingAccount(p, 5);
        s.deposit(100);
        s.withdraw(90);
        s.withdraw(20);
    }
}
