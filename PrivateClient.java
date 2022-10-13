package HomeWorks.HWforLesson21;

public class PrivateClient extends Client {

    public PrivateClient(int balance) {
        super(balance);
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public void replenish(int amount) {
        if (amount < 100000) {
            this.balance = this.balance + (int) (0.99 * amount);
            return;
        }
        this.balance = this.balance + (int) (0.995 * amount);
    }

    public void printInfo() {
        System.out.println("your balance is $" + (this.balance / 100));
        System.out.println("условие пополнения: комиссия 1%, если сумма меньше $1000; комиссия 0,5%, если сумма больше либо равна $1000");
        System.out.println("условие снятия: снятие без комиссии");
    }

}
