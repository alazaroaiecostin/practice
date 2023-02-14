import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int i, j;

        double sum = 0, diff = 0, prod = 1, quot = 1;

        double numbers = 0;

        String userTerm;

        System.out.print("Enter your expression: ");

        Scanner scan = new Scanner(System.in);

        userTerm = scan.nextLine();

        String[] separated = userTerm.split("");

        if (separated.length > 3 || separated.length <= 1) {
            System.out.println("Please enter a string containing only up to 3 digits!");
        } else {
            for (i = 0; i < separated.length; i++) {
                if (separated[i].matches("[0-9]")) {
                    numbers = Double.parseDouble(separated[i]);
                    sum += numbers;
                    prod *= numbers;
                    if (separated.length % 2 == 0) {
                        for (j = separated.length - 1; j > 0; j--) {
                            diff = Double.parseDouble(separated[0]) - Double.parseDouble(separated[j]);
                            quot = Double.parseDouble(separated[0]) / Double.parseDouble(separated[j]);
                        }
                    } else {
                        for (j = separated.length - 1; j > 0; j--) {
                            diff = Double.parseDouble(separated[0]) - Double.parseDouble(separated[i]) - Double.parseDouble(separated[j]);
                            quot = Double.parseDouble(separated[0]) / Double.parseDouble(separated[i]) / Double.parseDouble(separated[j]);
                        }
                    }
                    System.out.println();
                    System.out.println("Current number: " + numbers);
                    System.out.println();
                } else {
                    System.out.println("Please enter a string containing only up to 3 digits!");
                    System.out.println();
                    break;
                }
            }
            System.out.println("Sum: " + sum);
            System.out.println();
            System.out.println("Difference: " + diff);
            System.out.println();
            System.out.println("Product: " + prod);
            System.out.println();
            System.out.println("Quotient: " + quot);
            System.out.println();
        }
    }
}

