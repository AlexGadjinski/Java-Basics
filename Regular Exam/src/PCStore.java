import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double pricePerOneRam = Double.parseDouble(scanner.nextLine());
        int ramsCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double processorInLeva = processorPrice * 1.57;
        double videoCardInLeva = videoCardPrice * 1.57;
        double pricePerOneRamInLeva = pricePerOneRam * 1.57;
        double totalRam = pricePerOneRamInLeva * ramsCount;

        processorInLeva = processorInLeva - processorInLeva * discount;
        videoCardInLeva = videoCardInLeva - videoCardInLeva * discount;

        double totalPrice = processorInLeva + videoCardInLeva + totalRam;

        System.out.printf("Money needed - %.2f leva.", totalPrice);
    }
}
