import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());

        int redEggsCount = 0;
        int orangeEggsCount = 0;
        int blueEggsCount = 0;
        int greenEggsCount = 0;
        int maxEggs = Integer.MIN_VALUE;
        String colourMax = "";

        for (int i = 1; i <= eggs; i++) {
            String currentColour = scanner.nextLine();

            if (currentColour.equals("red")) {
                redEggsCount += 1;
                if (redEggsCount > maxEggs) {
                    maxEggs = redEggsCount;
                    colourMax = "red";
                }
            } else if (currentColour.equals("orange")) {
                orangeEggsCount += 1;
                if (orangeEggsCount > maxEggs) {
                    maxEggs = orangeEggsCount;
                    colourMax = "orange";
                }
            } else if (currentColour.equals("blue")) {
                blueEggsCount += 1;
                if (blueEggsCount > maxEggs) {
                    maxEggs = blueEggsCount;
                    colourMax = "blue";
                }
            } else if (currentColour.equals("green")) {
                greenEggsCount += 1;
                if (greenEggsCount > maxEggs) {
                    maxEggs = greenEggsCount;
                    colourMax = "green";
                }
            }
        }
        System.out.printf("Red eggs: %d%n", redEggsCount);
        System.out.printf("Orange eggs: %d%n", orangeEggsCount);
        System.out.printf("Blue eggs: %d%n", blueEggsCount);
        System.out.printf("Green eggs: %d%n", greenEggsCount);
        System.out.printf("Max eggs: %d -> %s", maxEggs, colourMax);
    }
}
