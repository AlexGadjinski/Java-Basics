import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();

        int maxSum = Integer.MIN_VALUE;
        String bestMovie = "";
        int counter = 0;

        while (!filmName.equals("STOP")) {
            int totalSum = 0;
            for (int i = 0; i < filmName.length(); i++) {
                int ascii = filmName.charAt(i);

                if (ascii > 96 && ascii < 123) {
                    ascii -= 2 * filmName.length();
                } else if (ascii > 64 && ascii < 91) {
                    ascii -= filmName.length();
                }

                totalSum += ascii;
            }
            if (totalSum > maxSum) {
                maxSum = totalSum;
                bestMovie = filmName;
            }
            counter++;
            if (counter == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            filmName = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxSum);
    }
}
