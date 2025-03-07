import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakePieces = width * length;

        while (cakePieces >= 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            } else {
                cakePieces -= Integer.parseInt(input);
            }
        }
        if (cakePieces >= 0) {
            System.out.printf("%d pieces are left.", cakePieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        }
    }
}
