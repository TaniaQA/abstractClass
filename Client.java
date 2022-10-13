package HomeWorks.HWforLesson21;

abstract public class Client {

    protected int balance; //in coins

    public Client(int balance) {

        this.balance = balance;
    }

    public abstract void withdraw(int amount);

    public abstract void replenish(int amount);

    public abstract void printInfo();

    public int getBalance() {

        return balance;
    }
}
