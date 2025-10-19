/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.elitesaccoforloop;
import java.util.Scanner;

public class EliteSaccoForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double INTEREST_RATE = 0.05;

        System.out.print("Enter number of members: ");
        int members = input.nextInt();

        for (int i = 1; i <= members; i++) {
            System.out.println("\n--- Member " + i + " ---");
            System.out.print("Enter principal amount: ");
            double principal = input.nextDouble();

            System.out.print("Enter time period in years: ");
            double time = input.nextDouble();

            double amount = principal * (1 + INTEREST_RATE * time);
            System.out.printf("Value of investment after %.1f years = %.2f\n", time, amount);
        }
        input.close();
    }
}


