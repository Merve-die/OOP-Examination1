
package vu.telecombilling;
public class TelecomBilling {
    public static void main(String[] args) {
        double airtime = 10000.0;
        double tax = 0.10 * airtime;
        double balance = airtime - tax;

        int callSeconds = 5 * 60;
        double callCostPerSec = 200.0;
        double totalCallCost = callSeconds * callCostPerSec;

        double finalBalance = balance - totalCallCost;

        System.out.println("Initial Airtime: UGX " + airtime);
        System.out.println("Service Charge (10%): UGX " + tax);
        System.out.println("Balance after charge: UGX " + balance);
        System.out.println("Total call cost: UGX " + totalCallCost);
        System.out.println("Final balance: UGX " + finalBalance);

        if (finalBalance < 0)
            System.out.println("⚠️  Insufficient balance!");
    }
}


