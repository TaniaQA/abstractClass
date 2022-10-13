package HomeWorks.HWforLesson21;

public class PhysicalClient extends Client {

    public PhysicalClient(int balance) {
        super(balance);
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public void replenish(int amount) {
        this.balance = this.balance + amount;
    }

    public void printInfo() {
        System.out.println("your balance is $" + (this.balance / 100));
        System.out.println("условие пополнения: без комиссии");
        System.out.println("условие снятия: без комиссии");
    }

}
