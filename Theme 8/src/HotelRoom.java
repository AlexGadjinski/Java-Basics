import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightLodging = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                if (nightLodging > 7 && nightLodging <= 14) {
                    studioPrice = 50 * nightLodging * 0.95;
                    apartmentPrice = 65 * nightLodging;
                } else if (nightLodging > 14) {
                    studioPrice = 50 * nightLodging * 0.70;
                    apartmentPrice = 65 * nightLodging * 0.90;
                } else {
                    studioPrice = 50 * nightLodging;
                    apartmentPrice = 65 * nightLodging;
                }
                break;
            case "June":
            case "September":
                if (nightLodging > 14) {
                    studioPrice = 75.20 * nightLodging * 0.80;
                    apartmentPrice = 68.70 * nightLodging * 0.90;
                } else {
                    studioPrice = 75.20 * nightLodging;
                    apartmentPrice = 68.70 * nightLodging;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76 * nightLodging;
                if (nightLodging > 14) {
                    apartmentPrice = 77 * nightLodging * 0.90;
                } else {
                    apartmentPrice = 77 * nightLodging;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
