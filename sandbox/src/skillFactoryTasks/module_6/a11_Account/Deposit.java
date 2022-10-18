package skillFactoryTasks.module_6.a11_Account;

public class Deposit extends Account {

    int period;
    double percent;


    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    double withdraw() {
        if (period <= 0) {
            double res = Double.parseDouble(String.valueOf(balance * (100 + percent))) / 100;
            balance = 0;
            return res;
        }
        return 0;
    }

    void waitDays(int n) {
        period -= n;
    }

    boolean isPeriodExpired() {
        return period <= 0;
    }
}
