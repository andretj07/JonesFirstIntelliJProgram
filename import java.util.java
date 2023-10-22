import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the total bill: ");
        double totalBill = scanner.nextDouble();

        System.out.print("Enter the tip percentage (in whole number, without percentage sign): ");
        int tipPercentage = scanner.nextInt();

        System.out.print("Enter the number of people in the party: ");
        int numberOfPeople = scanner.nextInt();

        // Calculate the tip amount
        double tipAmount = totalBill * (tipPercentage / 100.0);

        // Calculate the total bill including tip
        double totalBillWithTip = totalBill + tipAmount;

        // Calculate tip per person
        double tipPerPerson = tipAmount / numberOfPeople;

        // Calculate total per person (bill + tip)
        double totalPerPerson = totalBillWithTip / numberOfPeople;

        // Display the results
        System.out.println("\nResults:");
        System.out.printf("Total tip amount: $%.2f%n", tipAmount);
        System.out.printf("Total bill including tip: $%.2f%n", totalBillWithTip);
        System.out.printf("Tip per person: $%.2f%n", tipPerPerson);
        System.out.printf("Total per person: $%.2f%n", totalPerPerson);

        // Close the scanner
        scanner.close();
    }
}
