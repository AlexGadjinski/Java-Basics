import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int biggestNumber = Integer.MIN_VALUE;
        int totalSum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            totalSum += currentNumber;
            if (currentNumber > biggestNumber) {
                biggestNumber = currentNumber;
            }
        }
        if (biggestNumber == totalSum - biggestNumber) {
            System.out.printf("Yes%nSum = %d", biggestNumber);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(biggestNumber - (totalSum - biggestNumber)));
        }
    }
}
