import java.util.Scanner;


public class CodeBits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menuSelection(input);
        input.close();
    }

    public static void menuSelection(Scanner input) {


        int menuSelectionOption;


        do {
            System.out.println("");
            System.out.println("Here are a few methods for you to try, please make a selection: ");
            System.out.println("1.Convert Celsius to Fahrenheit");
            System.out.println("2.Convert cm to inches and feet");
            System.out.println("3.Convert distance to steps");
            System.out.println("4.Convert seconds to minutes and hours");
            System.out.println("5.Select every other character of a String.");
            System.out.println("6.Counting the votes in a 2D array.");
            System.out.println("7.Exit Program");
            System.out.println("Which selection do you wish? [1-6]:");

            menuSelectionOption = input.nextInt();

            switch (menuSelectionOption) {
                case 1:
                    convertCelsiusToFahrenheit(input);
                    break;
                case 2:
                    convertCmToInchFeet(input);
                    break;
                case 3:
                    convertDistanceToSteps(input);
                    break;
                case 4:
                    convertSecondsToMinsHours(input);
                    break;
                case 5:
                    stringBits(String.valueOf(input));
                    break;
                case 6:
                    countVotes();
                    break;
                case 7:
                    System.out.println("Thank you for using my program, exiting now, have a good day!");
                    break;
                default:
                    System.out.println("Please choose a valid option.");
            }
        } while (menuSelectionOption != 7);


    }


    private static void convertCelsiusToFahrenheit(Scanner input) {
        System.out.print("Enter temperature that you want to convert from Celsius to Fahrenheit: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * (double) 9.0F / (double) 5.0F + (double) 32.0F;
        System.out.print(celsius + "℃ is converted to " + fahrenheit + "°F.\n");
    }

    private static void convertCmToInchFeet(Scanner input) {
        System.out.print("Enter the exact distance in CM to convert to feet and inches & meters and kilometers.");
        double CM_PER_METER = (double) 100.0F;
        double METER_PER_KM = (double) 1000.0F;
        double CM_PER_INCH = 2.54;
        int INCH_PER_FOOT = 12;
        System.out.print("Exactly how many cm are you converting?");
        double cm = input.nextDouble();
        int inch = (int) (cm / 2.54);
        int feet = inch / 12;
        int remainder = inch % 12;
        double meter = (double) ((int) (cm / (double) 100.0F));
        double km = meter / (double) 1000.0F;
        System.out.printf("%.2f cm = %d ft, %d in.  Also \n", cm, feet, remainder);
        System.out.printf("%s meters and %s kilometers \n", meter, km);
    }

    private static void convertDistanceToSteps(Scanner input) {
        System.out.print("Please list the distance in feet to find out how many steps that would take.");
        double STEP_LENGTH = (double) 3.0F;
        double distance = input.nextDouble();
        double steps = distance / (double) 3.0F;
        System.out.print("That distance would take this many steps: " + steps + "\n");
    }

    private static void convertSecondsToMinsHours(Scanner input) {
        System.out.print("How many seconds do you wish to convert to minuets and hours? ");
        double sec = input.nextDouble();
        double SEC_TO_MIN = sec / (double) 60.0F;
        double MIN_TO_HOUR = SEC_TO_MIN / (double) 60.0F;
        double remainder = SEC_TO_MIN % (double) 60.0F;
        System.out.print("The amount of time would be: " + MIN_TO_HOUR + " hours and " + remainder + " minutes\n");
    }

    private static void stringBits(String text) {
        Scanner inputText = new Scanner(System.in);
        System.out.println("Please let me know the String you wish to change: ");
        System.out.println("");
        String str = inputText.nextLine();
        String result = "";
        // Note: the loop increments i by 2
        for (int i = 0; i < str.length(); i += 2) {
            // result = result + input.substring(i, i+1);
            result = result + str.charAt(i);
            // Alternately could use input.charAt(i)
        }
        System.out.println("Here is the result of this method:: " + result + ":: This came from the entered word: " + str);
        System.out.println("");
    }

    public static void countVotes() {
        int[][] votesTable =
                {{12, 13, 14, 10, 15, 16}, // candidate 0
                 {5, 2, 6, 8, 4, 3}, // candidate 1
                 {13, 15, 10, 12, 11, 17}, // candidate 2
                };
        for (int row = 0; row < votesTable.length; row++) {
            int voteCount = 0;
            for (int column = 0; column < votesTable[row].length; column++) {
                voteCount += votesTable[row][column];
            }
            System.out.println("Candidate " + row + ": "
                    + voteCount + " votes.");
        }

    }
}






