import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitCoins = Integer.parseInt(scanner.nextLine());
        double chineseCurrency = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitCoinsInLeva = bitCoins * 1168;
        double chineseCurrencyInDolars = chineseCurrency * 0.15;
        double dolarsInLeva = chineseCurrencyInDolars * 1.76;

        double sumInLeva = dolarsInLeva + bitCoinsInLeva;
        double sumInEuro = sumInLeva / 1.95;

        double totalSum = sumInEuro - ((commission / 100) * sumInEuro);

        System.out.printf("%.2f", totalSum);
    }
}
