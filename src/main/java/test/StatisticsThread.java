package test;

public class StatisticsThread extends Thread {

    PackageGroup location;

    StatisticsThread(PackageGroup gate) {
        this.location = gate;
    }

    @Override
    public void run() {

        do {
            location.count();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (location.packages != null);
    }
}

