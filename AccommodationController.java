
package vu.accommodationcontroller;
import java.util.Scanner;

abstract class Area {
    protected String name;
    protected int occupants;
    protected boolean[] lights = new boolean[3]; // lights 1–3

    public Area(String name) {
        this.name = name;
        this.occupants = 0;
    }

    public void addOccupants(int n) {
        occupants += n;
    }

    public void removeOccupants(int n) {
        occupants = Math.max(0, occupants - n);
    }

    public void switchLight(int lightNumber, boolean state) {
        if (lightNumber >= 1 && lightNumber <= 3)
            lights[lightNumber - 1] = state;
    }

    public void reportStatus() {
        System.out.println("\n--- " + name + " Status Report ---");
        System.out.println("Occupants: " + occupants);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "ON" : "OFF"));
        }
        System.out.println("---------------------------------\n");
    }
}

class GymArea extends Area {
    public GymArea() {
        super("Gym Area");
    }
}

class SwimmingArea extends Area {
    public SwimmingArea() {
        super("Swimming Area");
    }
}

public class AccommodationController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Area gym = new GymArea();
        Area pool = new SwimmingArea();
        Area activeArea = gym;
        char choice;

        while (true) {
            System.out.println("\n=== Accommodation Menu ===");
            System.out.println("S – Select active area (G=Gym, P=Swimming)");
            System.out.println("W – Add occupants");
            System.out.println("X – Remove occupants");
            System.out.println("Y – Switch ON a light");
            System.out.println("Z – Switch OFF a light");
            System.out.println("R – Report status");
            System.out.println("Q – Quit");
            System.out.print("Enter choice: ");
            choice = input.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'S':
                    System.out.print("Select area (G/P): ");
                    char areaChoice = input.next().toUpperCase().charAt(0);
                    if (areaChoice == 'G') activeArea = gym;
                    else if (areaChoice == 'P') activeArea = pool;
                    else System.out.println("Invalid area. Try again.");
                    break;

                case 'W':
                    System.out.print("Enter number of occupants to add: ");
                    int add = validateInt(input);
                    activeArea.addOccupants(add);
                    break;

                case 'X':
                    System.out.print("Enter number of occupants to remove: ");
                    int remove = validateInt(input);
                    activeArea.removeOccupants(remove);
                    break;

                case 'Y':
                    System.out.print("Enter light number to switch ON (1-3): ");
                    int onLight = validateLight(input);
                    activeArea.switchLight(onLight, true);
                    break;

                case 'Z':
                    System.out.print("Enter light number to switch OFF (1-3): ");
                    int offLight = validateLight(input);
                    activeArea.switchLight(offLight, false);
                    break;

                case 'R':
                    activeArea.reportStatus();
                    break;

                case 'Q':
                    System.out.println("Exiting program. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    
    private static int validateInt(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Invalid input. Enter an integer: ");
            input.next();
        }
        return input.nextInt();
    }

    private static int validateLight(Scanner input) {
        int light = validateInt(input);
        while (light < 1 || light > 3) {
            System.out.print("Light must be 1–3. Try again: ");
            light = validateInt(input);
        }
        return light;
    }
}



    

