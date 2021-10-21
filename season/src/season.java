import java.util.Scanner;

public class season {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Month of season: ");
        int month = sc.nextInt();
        System.out.print("Day of season: ");
        int day = sc.nextInt();
        System.out.println(season(month, day));
    }

    public static String season(int month, int day) {
        if (((month >=3) && (month <=6)) && (((month == 3) && (day >= 16) && (day <= 31)) || ((month == 6) && (day >= 1) && (day <= 15))
                || (((month == 4) || (month == 5))))) {
                return "Spring";
        } else if (((month >=6) && (month <=9)) && (((month == 6) && (day >= 16) && (day <= 31)) || ((month == 9) && (day >= 1) && (day <= 15))
                || (((month == 7) || (month == 8))))) {
                return "Summer";
        } else if (((month >=9) && (month <=12)) && (((month == 9) && (day >= 16) && (day <= 31)) || ((month == 12) && (day >= 1) && (day <= 15))
                || (((month == 10) || (month == 11))))) {
                return "Fall";
        } else {
            return "Winter";
        }
    }
}
