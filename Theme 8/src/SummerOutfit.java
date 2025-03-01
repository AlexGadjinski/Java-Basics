import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            switch (dayTime) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        } else if (degrees > 18 && degrees <=24) {
            switch (dayTime) {
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        } else if (degrees >= 25) {
            switch (dayTime) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
