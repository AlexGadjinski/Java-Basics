import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int countMysala = 0;
        int countMontBlanc = 0;
        int countKili = 0;
        int countK2 = 0;
        int countEverest = 0;
        int countPeople = 0;

        for (int i = 1; i <= groups; i++) {
            int currentPeople = Integer.parseInt(scanner.nextLine());
            countPeople += currentPeople;

            if (currentPeople < 6) {
                countMysala += currentPeople;
            } else if (currentPeople < 13) {
                countMontBlanc += currentPeople;
            } else if (currentPeople < 26) {
                countKili += currentPeople;
            } else if (currentPeople < 41) {
                countK2 += currentPeople;
            } else {
                countEverest += currentPeople;
            }
        }
        double percentMysala = countMysala * 1.0 / countPeople * 100;
        double percentMontBlanc = countMontBlanc * 1.0 / countPeople * 100;
        double percentKili = countKili * 1.0 / countPeople * 100;
        double percentK2 = countK2 * 1.0 / countPeople * 100;
        double percentEverest = countEverest * 1.0 / countPeople * 100;

        System.out.printf("%.2f%%%n", percentMysala);
        System.out.printf("%.2f%%%n", percentMontBlanc);
        System.out.printf("%.2f%%%n", percentKili);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
