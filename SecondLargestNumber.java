import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
//        Take an input of multiple numbers from a user. Find the second largest number of the
//        numbers.
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter multiple numbers separated by spaces: ");
                String input = scanner.nextLine();

                // Splitting the input string into an array of numbers
                String[] numbersStr = input.split(" ");
                int[] numbers = new int[numbersStr.length];

                // Parsing the array of number strings into an array of integers
                for (int i = 0; i < numbersStr.length; i++) {
                    numbers[i] = Integer.parseInt(numbersStr[i]);
                }

                // Finding the second largest number
                if (numbers.length < 2) {
                    System.out.println("Insufficient numbers. Please enter at least 2 numbers.");
                } else {
                    int largest = Integer.MIN_VALUE;
                    int secondLargest = Integer.MIN_VALUE;

                    for (int num : numbers) {
                        if (num > largest) {
                            secondLargest = largest;
                            largest = num;
                        } else if (num > secondLargest && num < largest) {
                            secondLargest = num;
                        }
                    }

                    System.out.println("The second largest number is: " + secondLargest);
                }

                scanner.close();
    }
}