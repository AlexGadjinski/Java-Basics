import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
            int counter = 0;
            String currentNum = "" + i;

            for (int position = 0; position < 4; position++) {
                int currentNumAtPosition = Integer.parseInt("" + currentNum.charAt(position));

                if (currentNumAtPosition == 0) {
                    break;
                } else if (input % currentNumAtPosition == 0) {
                    counter++;
                }
            }
            if (counter == 4) {
                System.out.print(i + " ");
            }
        }
    }
}
