package skillFactoryTasks.module_6.a11_Account;

public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    void withdraw(int n) {
        balance = n > balance ? 0 : balance - n;
    }

    void put(int n) {
        balance += n;
    }

    int checkBalance() {
        return balance;
    }


}
