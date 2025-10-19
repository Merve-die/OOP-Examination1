/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.gracemirrorcheck;
import java.util.Scanner;

public class GraceMirrorCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter object distance u (negative for concave mirror): ");
        double u = input.nextDouble();

        System.out.print("Enter image distance v (positive for real image): ");
        double v = input.nextDouble();

        
        double f = 1 / ((1 / v) + (1 / u));

        System.out.printf("\nCalculated focal length (f): %.2f cm\n", f);

        if (f >= 21.0 && f <= 25.0) {
            System.out.println("✅ The mirror is ACCEPTABLE. Focal length is within range.");
        } else {
            System.out.println("❌ The mirror is NOT acceptable. Focal length out of range.");
        }

        input.close();
    }
}


