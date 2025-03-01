import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerEggsCount = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggsCount = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();

        while (!winner.equals("End of battle")) {

            if (winner.equals("one")) {
                secondPlayerEggsCount -= 1;
            } else if (winner.equals("two")) {
                firstPlayerEggsCount -= 1;
            }

            if (firstPlayerEggsCount == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggsCount);
                return;
            } else if (secondPlayerEggsCount == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEggsCount);
                return;
            }

            winner = scanner.nextLine();
        }
        System.out.printf("Player one has %d eggs left.%n", firstPlayerEggsCount);
        System.out.printf("Player two has %d eggs left.%n", secondPlayerEggsCount);
    }
}
