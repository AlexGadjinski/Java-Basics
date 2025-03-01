import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());

        int validCombinationsCount = 0;

        for (int i = 0; i <= sum ; i++) {
            for (int j = 0; j <= sum ; j++) {
                for (int k = 0; k <= sum ; k++) {
                    if (i + j + k == sum) {
                        validCombinationsCount++;
                    }
                }
            }
        }
        System.out.println(validCombinationsCount);
    }
}
