import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String bestWord = "";
        double maxWordPoints = Integer.MIN_VALUE;

        while (!input.equals("End of words")) {
            double currentWordPoints = 0;
            boolean flag = false;

            for (int i = 0; i < input.length(); i++) {
                int asciiNum = input.charAt(i);
                currentWordPoints += asciiNum;

                if (i == 0) {
                    if (asciiNum == 97 || asciiNum == 101 || asciiNum == 105 || asciiNum == 111 || asciiNum == 117 || asciiNum == 121 || asciiNum == 65 || asciiNum == 69 || asciiNum == 73 || asciiNum == 79 || asciiNum == 85 || asciiNum == 89) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                currentWordPoints = currentWordPoints * input.length();
            } else {
                currentWordPoints = Math.floor(currentWordPoints / input.length());
            }

            if (currentWordPoints > maxWordPoints) {
                maxWordPoints = currentWordPoints;
                bestWord = input;
            }

            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", bestWord, maxWordPoints);
    }
}