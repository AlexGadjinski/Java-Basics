import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double totalCommission = 0;

        if (sales >= 0 && sales <= 500) {
            switch (city) {
                case "Sofia":
                    totalCommission = 0.05 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Varna":
                    totalCommission = 0.045 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Plovdiv":
                    totalCommission = 0.055 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales > 500 && sales <= 1000) {
            switch (city) {
                case "Sofia":
                    totalCommission = 0.07 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Varna":
                    totalCommission = 0.075 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Plovdiv":
                    totalCommission = 0.08 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales > 1000 && sales <= 10000) {
            switch (city) {
                case "Sofia":
                    totalCommission = 0.08 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Varna":
                    totalCommission = 0.10 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Plovdiv":
                    totalCommission = 0.12 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales > 10000) {
            switch (city) {
                case "Sofia":
                    totalCommission = 0.12 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Varna":
                    totalCommission = 0.13 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                case "Plovdiv":
                    totalCommission = 0.145 * sales;
                    System.out.printf("%.2f", totalCommission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
