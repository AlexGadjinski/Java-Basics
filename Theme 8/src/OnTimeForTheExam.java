import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        int totalArriveMinutes = arriveHour * 60 + arriveMin;
        int totalExamMinutes = examHour * 60 + examMin;

        int hoursDifference = 0;
        int minutesDifference = 0;

        if (totalArriveMinutes > totalExamMinutes) {
            System.out.println("Late");
        } else if (totalExamMinutes - totalArriveMinutes <= 30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (totalArriveMinutes < totalExamMinutes) {
            if (totalExamMinutes - totalArriveMinutes < 60) {
                System.out.printf("%d minutes before the start", (totalExamMinutes - totalArriveMinutes));
            } else {
                hoursDifference = (totalExamMinutes - totalArriveMinutes) / 60;
                minutesDifference = (totalExamMinutes - totalArriveMinutes) % 60;
                System.out.printf("%d:%02d hours before the start", hoursDifference, minutesDifference);
            }
        } else if (totalArriveMinutes > totalExamMinutes) {
            if (totalArriveMinutes - totalExamMinutes < 60) {
                System.out.printf("%d minutes after the start", (totalArriveMinutes - totalExamMinutes));
            } else {
                hoursDifference = (totalArriveMinutes - totalExamMinutes) / 60;
                minutesDifference = (totalArriveMinutes - totalExamMinutes) % 60;
                System.out.printf("%d:%02d hours after the start", hoursDifference, minutesDifference );
            }
        }
    }
}
