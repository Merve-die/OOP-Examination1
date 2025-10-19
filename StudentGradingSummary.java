/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.studentgradingsummary;
import java.util.Scanner;

public class StudentGradingSummary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] gradeCount = new int[10]; // index 1–9 used
        int i = 1;

        while (i <= 5) {
            System.out.print("Enter score for student " + i + " (0 - 100): ");
            int score = input.nextInt();
            int grade = 9;
            String remark = "Fail";

            if (score >= 80 && score <= 100) { grade = 1; remark = "Distinction"; }
            else if (score >= 75) { grade = 2; remark = "Distinction"; }
            else if (score >= 66) { grade = 3; remark = "Credit"; }
            else if (score >= 60) { grade = 4; remark = "Credit"; }
            else if (score >= 50) { grade = 5; remark = "Credit"; }
            else if (score >= 45) { grade = 6; remark = "Credit"; }
            else if (score >= 35) { grade = 7; remark = "Pass"; }
            else if (score >= 30) { grade = 8; remark = "Pass"; }

            System.out.printf("Student %d -> Score: %d | Grade: %d | Remark: %s%n", i, score, grade, remark);
            gradeCount[grade]++;
            i++;
        }

        System.out.println("\n=== Grade Summary ===");
        for (int g = 1; g <= 9; g++) {
            System.out.println("Grade " + g + ": " + gradeCount[g] + " student(s)");
        }
        input.close();
    }
}


