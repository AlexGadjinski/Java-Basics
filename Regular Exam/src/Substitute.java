import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numK = Integer.parseInt(scanner.nextLine());
        int numL = Integer.parseInt(scanner.nextLine());
        int numM = Integer.parseInt(scanner.nextLine());
        int numN = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = numK; i <= 8; i++) {
            for (int j = 9; j >= numL; j--) {
                for (int k = numM; k <= 8; k++) {
                    for (int l = 9; l >= numN; l--) {
                        if (i % 2 == 0 && k % 2 == 0 && j % 2 != 0 && l % 2 != 0 ) {
                            if (counter == 6) {
                                return;
                            }
                            if (i == k && j == l) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                counter++;
                            }
                        }
                    }
                }
            }
        }
    }
}
