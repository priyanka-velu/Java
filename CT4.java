import java.util.Scanner;

public class CSC320_CT4 {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double[] array = new double[10];

        double n = 10;
        double total = 0;
        double average = 0;

        // output array
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scnr.nextDouble();
        }

        // make array
        System.out.println("The array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        double min = array[0];
        double max = array[0];

        // average
        for (int i = 0; i < n; i++) {
            total += array[i];
        }
        average = total / n;

        // minimum
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // maximum
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
