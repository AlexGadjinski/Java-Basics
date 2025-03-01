import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentName = scanner.nextLine();

        int maxPoints = Integer.MIN_VALUE;
        String maxName = "";

        while (!currentName.equals("Stop")) {
            int currentPoints = 0;
            for (int i = 0; i < currentName.length(); i++) {
                int currentNum = Integer.parseInt(scanner.nextLine());
                int asciiNum = currentName.charAt(i);

                if (currentNum == asciiNum) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }

                if (currentPoints >= maxPoints) {
                    maxPoints = currentPoints;
                    maxName = currentName;
                }
            }
            currentName = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", maxName, maxPoints);
    }
}
