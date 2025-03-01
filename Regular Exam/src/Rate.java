import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double investedSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());

        double simpleInterest = investedSum;
        double complexInterest = 0;

        for (int i = 1; i <= months; i++) {
           simpleInterest += investedSum * 0.03;
        }


        for (int i = 1; i <= months; i++) {
          complexInterest = investedSum + investedSum * 0.027;
          investedSum = complexInterest;
        }

        System.out.printf("Simple interest rate: %.2f lv.%n", simpleInterest);
        System.out.printf("Complex interest rate: %.2f lv.%n", complexInterest);

        if (simpleInterest > complexInterest) {
            System.out.printf("Choose a simple interest rate. You will win %.2f lv.", simpleInterest - complexInterest);
        } else {
            System.out.printf("Choose a complex interest rate. You will win %.2f lv.", complexInterest - simpleInterest);
        }
    }
}
