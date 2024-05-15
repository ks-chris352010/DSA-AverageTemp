import java.util.Scanner;

public class DSAAverageTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs from the user:
        double[] temperatures = new double[8];
        System.out.println("Enter 8 temperatures:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        scanner.close();

        // Calculate average temperature:
        double total = 0;
        for (double temperature : temperatures) {
            total += temperature;
        }
        double average = total / temperatures.length;
        System.out.println("Average temperature: " + average);

        // Count temperatures above average:
        int aboveAverageCount = 0;
        for (double temperature : temperatures) {
            if (temperature > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("Number of days above average temperature: " + aboveAverageCount);
    }
}
