import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals("No More Books")) {
            if (input.equals(favouriteBook)) {
                System.out.printf("You checked %d books and found it.", counter);
                return;
            }

            counter++;
            input = scanner.nextLine();
        }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", counter);
    }
}
