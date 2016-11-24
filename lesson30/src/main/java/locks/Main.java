package locks;

public class Main {
    public static void main(String[] args) {
    }
}

class Human implements Runnable {

    Account account;
    Lock lock;

    Human(Account account, Lock lock) {
        this.account = account;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();

        if (account.getMoney() > 100) {
            account.withdraw(100);
        }

        lock.unlock();
    }
}