import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double result = 0;

        switch (symbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = 1.0 * num1 / num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, result);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = num1 % num2;
                    System.out.printf("%d %% %d = %.0f", num1, num2, result);
                }
                break;
        }
        if (!symbol.equals("/") && !symbol.equals("%")) {
            String type = "";
            if (result % 2 == 0) {
                type = "even";
            } else {
                type = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", num1, symbol, num2, result, type);
        }
    }
}
