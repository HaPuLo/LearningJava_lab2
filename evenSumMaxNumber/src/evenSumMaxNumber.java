import java.util.Scanner;
import java.util.Arrays;

public class evenSumMaxNumber {
    public static void main(String[] argv){
        evenSum();
    }
    public static void evenSum() {
        Scanner sc= new Scanner(System.in);
        System.out.print("how many integers? ");
        int number = sc.nextInt();

        int n = 0;
        int[] array = new int[number];
        while (n< array.length){
            System.out.print("next integer? ");
            array[n] = sc.nextInt();
            n++;
        }
        System.out.println(Arrays.toString(array));

        int m = 0;
        int sumOfEven = 0;
        int max = 0;
        while (m < array.length){
            if (array[m] % 2 == 0){
                sumOfEven = sumOfEven + array[m];
                if (array[m] > max){
                    max = array[m];
                }
            }
            m++;
        }
        System.out.println("even sum = "+ sumOfEven);
        System.out.println("even max = "+ max);
    }
}
