import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 20 / 100;
        double drinks = cake - cake * 45 / 100;
        double animator = rent / 3;
        double sum = rent + cake + drinks + animator;

        System.out.println(sum);
    }
}
