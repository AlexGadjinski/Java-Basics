import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lengthInCentimetres = Double.parseDouble(scanner.nextLine());
        double breadthInCentimetres = Double.parseDouble(scanner.nextLine());
        double heightInCentimetres = Double.parseDouble(scanner.nextLine());
        double percentNecessaryThings = Double.parseDouble(scanner.nextLine());

        double volumeInCubicCentimetres = lengthInCentimetres * breadthInCentimetres * heightInCentimetres;
        double volumeInCubicDecimetres = volumeInCubicCentimetres * 0.001;
        double finalResult = volumeInCubicDecimetres - volumeInCubicDecimetres * percentNecessaryThings / 100;

        System.out.printf("%.2f", finalResult);
    }
}
