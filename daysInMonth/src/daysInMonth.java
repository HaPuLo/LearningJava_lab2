import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.println(day_InMonth(month));

    }
    public static int day_InMonth(int month) {
        if ((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)
                ||(month == 10)||(month == 12)){
            return 31;
        }else if ((month == 4)||(month == 6)||(month == 9)||(month == 11)){
            return 30;
        }else
            return 28;
    }
}
