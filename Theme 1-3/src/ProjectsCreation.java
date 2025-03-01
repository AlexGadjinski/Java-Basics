import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int time = projectsCount * 3;
        System.out.println("The architect " + name + " will need " + time + " hours to complete " + projectsCount + " project/s.");

    }
}
