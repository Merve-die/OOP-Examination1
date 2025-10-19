/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.babyfeedingtime;
public class BabyFeedingTime {
    public static void main(String[] args) {
        double porridgeLitres = 2.0;
        double milkLitres = 2.0;

        double porridgeServing = 0.25; 
        double milkServing = 0.5;      

        int porridgeTime = 45;
        int milkTime = 30;

        int porridgeFeeds = (int)(porridgeLitres / porridgeServing);
        int milkFeeds = (int)(milkLitres / milkServing);

        int totalTime = (porridgeFeeds * porridgeTime) + (milkFeeds * milkTime);

        System.out.println("Baby will take a total of " + totalTime + " minutes (" +
                           (totalTime/60.0) + " hours) to finish both porridge and milk.");
    }
}


