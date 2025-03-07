import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double evenSum = 0;

        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNumber;
                if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }
            } else {
                oddSum += currentNumber;
                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == 1000000000.0 && oddMax == -1000000000.0) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == 1000000000.0 && evenMax == -1000000000.0) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
