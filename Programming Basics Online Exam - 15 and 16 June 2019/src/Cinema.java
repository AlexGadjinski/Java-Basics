import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int totalIncome = 0;

        while (!input.equals("Movie time!")) {
            int currentPeople = Integer.parseInt(input);
            int currentMoney = 0;
            capacity -= currentPeople;

            if (capacity < 0) {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.", totalIncome);
                return;
            }

            currentMoney = 5 * currentPeople;
            if (currentPeople % 3 == 0) {
                currentMoney -= 5;
            }

            totalIncome += currentMoney;
            input = scanner.nextLine();
        }
        System.out.printf("There are %d seats left in the cinema.%n", capacity);
        System.out.printf("Cinema income - %d lv.", totalIncome);
    }
}
