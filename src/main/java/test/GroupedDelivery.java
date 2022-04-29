package test;

public class GroupedDelivery extends Thread {
    private Package package1;

    GroupedDeliveryThread(Package package1) {
        this.package1 = package1;
    }

    @Override
    public void run() {
        System.out.println("[Delivering for " + package1.getLocation() + " and date " + package1.getDeliveryDate());
    }

}
