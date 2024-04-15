
package dart;

import java.util.Scanner;

public class Dart {
    public static void main(String[] args) {
        int currentA = 0, currentB = 0, currentC = 0, currentD = 0, currentE = 0, currentF = 0, currentG = 0, currentUdc = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Dart Game !!!");
        System.out.print("Enter the number of darts to be thrown: ");
        int dartNumber = scn.nextInt();
        for (int i = 1; i <= dartNumber; i++) {
            double coordinateX = (int) ((Math.random() * 10 - 5) * 10) / 10.0;
            double coordinateY = (int) ((Math.random() * 10 - 5) * 10) / 10.0;
            double addition = coordinateX + coordinateY;
            System.out.println("Coordinates: " + "(" + coordinateX + " , " + coordinateY + ") ");
            if (coordinateX > 0 && coordinateY > 0 && addition < 5.0) {
                currentA++;
                System.out.println("Region: A");
                System.out.println("");
            } else if (coordinateX > 0 && coordinateY > 0 && addition > 5.0) {
                currentB++;
                System.out.println("Region: B");
                System.out.println("");
            } else if (coordinateX < 0 && coordinateY > 0 && Math.sqrt(Math.pow((coordinateX + 3), 2) + Math.pow((coordinateY - 3), 2)) < 1.0) {
                currentC++;
                System.out.println("Region: C");
                System.out.println("");

            } else if (coordinateX < 0 && coordinateY > 0 && Math.sqrt(Math.pow((coordinateX + 3), 2) + Math.pow((coordinateY - 3), 2)) > 1.0) {
                currentG++;
                System.out.println("Region: G");
                System.out.println("");
            } else if (coordinateX < 0 && coordinateY < 0 && coordinateX < coordinateY) {
                currentD++;
                System.out.println("Region D");
                System.out.println("");
            } else if (coordinateX < 0 && coordinateY < 0 && coordinateX > coordinateY) {
                currentE++;
                System.out.println("Region E");
                System.out.println("");
            } else if (coordinateX > 0 && coordinateY < 0) {
                currentF++;
                System.out.println("Region F");
                System.out.println("");

            } else {
                currentUdc++;
                System.out.println("Undecided");
                System.out.println("");

            }

        }
        System.out.println("Region Statistic:");
        System.out.println("A: " + currentA + " darts " + "(" + (currentA * 100) / dartNumber + "%" + ")");
        System.out.println("B: " + currentB + " darts " + "(" + (currentB * 100) / dartNumber + "%" + ")");
        System.out.println("C: " + currentC + " darts " + "(" + (currentC * 100) / dartNumber + "%" + ")");
        System.out.println("D: " + currentD + " darts " + "(" + (currentD * 100) / dartNumber + "%" + ")");
        System.out.println("E: " + currentE + " darts " + "(" + (currentE * 100) / dartNumber + "%" + ")");
        System.out.println("F: " + currentF + " darts " + "(" + (currentF * 100) / dartNumber + "%" + ")");
        System.out.println("G: " + currentG + " darts " + "(" + (currentG * 100) / dartNumber + "%" + ")");
        System.out.println("Undecided: " + currentUdc + " darts " + "(" + (currentUdc * 100) / dartNumber + "%" + ")");
    }

    
}
