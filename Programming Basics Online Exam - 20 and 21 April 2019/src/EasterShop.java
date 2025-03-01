import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startEggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int boughtEggsCounter = 0;

        while (!input.equals("Close")) {
            int eggsFillOrBuy = Integer.parseInt(scanner.nextLine());

            if (input.equals("Buy") && startEggs < eggsFillOrBuy) {
                System.out.println("Not enough eggs in store!");
                System.out.printf("You can buy only %d.", startEggs);
                return;
            }

            if (input.equals("Buy")) {
                startEggs -= eggsFillOrBuy;
                boughtEggsCounter += eggsFillOrBuy;
            } else if (input.equals("Fill")) {
                startEggs += eggsFillOrBuy;
            }

            input = scanner.nextLine();
        }
        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.", boughtEggsCounter);
    }
}
