import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grades = Double.parseDouble(scanner.nextLine());
        double minimumSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double excellentGradesScholarship = 0;

        if (income < minimumSalary && grades > 4.5) {
            socialScholarship = Math.floor(minimumSalary * 0.35);
        }
        if (grades >= 5.5)  {
            excellentGradesScholarship = Math.floor(grades * 25);
        }

        if (socialScholarship > excellentGradesScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (excellentGradesScholarship >= socialScholarship && excellentGradesScholarship > 0) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentGradesScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
