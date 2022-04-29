package test;

import java.io.*;
import java.time.LocalDate;
import java.util.Random;
import java.util.TreeSet;

public class Main {

    TreeSet<Package> packages = new TreeSet<>();

    public void readPackages() {

        File f = new File("/Users/albertarifovici/IdeaProjects/test2/src/main/resources/Packages.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] input = line.split(",");
                packages.add(new Package(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), LocalDate.parse(input[3])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File not accessible");
        }
    }
    public static void main(String[] args) throws InterruptedException {

        PackageGroup group1 = new PackageGroup();//random location from treeset
        StatisticsThread statisticsThread = new StatisticsThread(group1);

        statisticsThread.start();

        for (int i = 1; i <= 1000; i++) {
            Thread GroupedDelivery= new GroupedDelivery(packages, group1);
            GroupedDelivery.start();
            Thread.sleep(500);
            GroupedDelivery.join();
        }
    }
}

