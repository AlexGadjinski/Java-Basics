import java.util.Scanner;

public class Illidan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeopleCount = Integer.parseInt(scanner.nextLine());
        int strengthPerPerson = Integer.parseInt(scanner.nextLine());
        int strengthIllidan = Integer.parseInt(scanner.nextLine());

        int totalPeopleStrength = totalPeopleCount * strengthPerPerson;

        if (totalPeopleStrength < strengthIllidan) {
            System.out.printf("You are not prepared! You need %d more points.", Math.abs(strengthIllidan - totalPeopleStrength));
        } else {
            System.out.printf("Illidan has been slain! You defeated him with %d points.", Math.abs(strengthIllidan - totalPeopleStrength));
        }
    }
}
