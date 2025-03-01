import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int wholeTime = pagesInBook / pagesPerHour;
        int hoursPerDay = wholeTime / numberOfDays;

        System.out.println(hoursPerDay);
    }
}
