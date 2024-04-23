import java.util.Scanner;

public class NextDateCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day, month, year;

        do {
            System.out.print("Nhập ngày: ");
            day = scanner.nextInt();
        } while (day < 1 || day > 31);

        do {
            System.out.print("Nhập tháng: ");
            month = scanner.nextInt();
        } while (month < 1 || month > 12);

        do {
            System.out.print("Nhập năm: ");
            year = scanner.nextInt();
        } while (year < 1 || year > 2024);

        int[] nextDate = calculateNextDate(day, month, year);
        System.out.println("Ngày tiếp theo là: " + nextDate[0] + "/" + nextDate[1] + "/" + nextDate[2]);

        scanner.close();
    }

    public static int[] calculateNextDate(int day, int month, int year) {
        int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        if (day < daysInMonth[month]) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }

        return new int[] { day, month, year };
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
