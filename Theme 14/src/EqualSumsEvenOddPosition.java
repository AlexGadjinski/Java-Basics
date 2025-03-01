import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= finalNum ; i++) {
            int oddSum = 0;
            int evenSum = 0;

//           String currentNum = Integer.toString(i);
            String currentNum = "" + i;

            for (int position = 0; position < currentNum.length(); position++) {
                int currentNumAtPosition = Integer.parseInt("" + currentNum.charAt(position));
                if (position % 2 == 0) {
                    evenSum += currentNumAtPosition;
                } else {
                    oddSum += currentNumAtPosition;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
