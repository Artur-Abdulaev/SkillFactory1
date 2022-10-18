package skillFactoryTasks.module_6.a11_Account;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    void withdraw(int n) {
        balance -= n;
    }

    int getDebt() {
        return balance < 0 ? -balance : 0;
    }
}
