package HomeWorks.HWforLesson21;

public class HW23 {
    public static void main(String[] args) {
        Client client = new PrivateClient(500000); //$5000
        client.printInfo();
        client.replenish(200000); //fee $10
        client.printInfo();
    }
}
