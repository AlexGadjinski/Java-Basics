import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFood = Double.parseDouble(scanner.nextLine());
        double otherFood = Double.parseDouble(scanner.nextLine());
        double result = dogFood * 2.50 + otherFood * 4.00;
        System.out.println(result + " lv.");
    }
}
