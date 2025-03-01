import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int current = Integer.parseInt(input);
            if (current < minNumber) {
                minNumber = current;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
