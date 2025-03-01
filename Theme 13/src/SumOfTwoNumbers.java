import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combination = 0;

        for (int i = startNum; i <= finalNum; i++) {
            for (int j = startNum; j <= finalNum; j++) {
                combination++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combination, magicNum);
    }
}
