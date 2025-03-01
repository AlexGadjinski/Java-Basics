import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPriceInBGNPerKilos = Double.parseDouble(scanner.nextLine());
        double amountOfBananasInKilos = Double.parseDouble(scanner.nextLine());
        double amountOfOrangesInKilos = Double.parseDouble(scanner.nextLine());
        double amountOfRaspberriesInKilos = Double.parseDouble(scanner.nextLine());
        double amountOfStrawberriesInKilos = Double.parseDouble(scanner.nextLine());

        double raspberriesPriceInBGNPerKilos = strawberriesPriceInBGNPerKilos * 0.50;
        double orangesPriceInBGNPerKilos = raspberriesPriceInBGNPerKilos * 0.60;
        double bananasPriceInBGNPerKilos = raspberriesPriceInBGNPerKilos * 0.20;

        double sumTotal = strawberriesPriceInBGNPerKilos * amountOfStrawberriesInKilos + raspberriesPriceInBGNPerKilos * amountOfRaspberriesInKilos + bananasPriceInBGNPerKilos * amountOfBananasInKilos + orangesPriceInBGNPerKilos * amountOfOrangesInKilos;

        System.out.printf("%.2f", sumTotal);
    }
}
