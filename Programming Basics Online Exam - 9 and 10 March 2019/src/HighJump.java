import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wishedHeight = Integer.parseInt(scanner.nextLine());
        int totalJumpsCounter = 0;

        for (int i = wishedHeight - 30; i <= wishedHeight; i += 5) {
            int failedCounter = 0;

            for (int j = 1; j <= 3; j++) {
                int currentHeight = Integer.parseInt(scanner.nextLine());
                totalJumpsCounter++;

                if (currentHeight > i) {
                    break;
                } else {
                    failedCounter++;
                }
            }
            if (failedCounter == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", i, totalJumpsCounter);
                return;
            }
        }
        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wishedHeight, totalJumpsCounter);
    }
}
