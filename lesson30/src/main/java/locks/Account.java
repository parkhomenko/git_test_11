package locks;

public class Account {

    private int totalMoney;

    public Account(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getMoney() {
        return totalMoney;
    }

    public void withdraw(int sum) {
        totalMoney = totalMoney - sum;
    }
}
