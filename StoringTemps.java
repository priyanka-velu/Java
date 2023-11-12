import java.util.Scanner;
import java.util.ArrayList;

public class CSC320_CT5 {
    public static void main (String [] args) {
        ArrayList<String> weekDays = new ArrayList<String>();
        ArrayList<Integer> weekTemps = new ArrayList<Integer>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        weekTemps.add(70);
        weekTemps.add(73);
        weekTemps.add(85);
        weekTemps.add(80);
        weekTemps.add(82);
        weekTemps.add(79);
        weekTemps.add(77);

        Scanner scnr = new Scanner(System.in);
        String day;
        int indexDay;
        int i;

        System.out.println("Enter a day of the week (Monday-Sunday) to obtain the temperature for that day or enter (week) for the weekly temperature: ");
        day = scnr.next();
        indexDay = weekDays.indexOf(day);

        if (indexDay != -1) {
                System.out.println("The temperature for " + weekDays.get(indexDay) + " is " + weekTemps.get(indexDay) + " degrees.");
            }
        else if (day.equals("week")) {
            float avgTemp = 0;

            for (i = 0; i < weekDays.size(); ++i) {
                System.out.println("Day: " + weekDays.get(i) + ", Temperature: " + weekTemps.get(i));
            }

            for (Integer weekTemp : weekTemps) {
                avgTemp += weekTemp;
            }
            avgTemp /= weekTemps.size();
            System.out.print("The weekly average temperature is " + avgTemp + " degrees.");
            System.out.println();
        }
        else {
            System.out.println("Sorry, that was an invalid option. Please try again.");
        }
    }
}
