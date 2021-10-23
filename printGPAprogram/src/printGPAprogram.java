import java.util.Scanner;
import java.util.Arrays;

public class printGPAprogram {
    public static void main(String[] argv){
        printGPA();

    }
    public static void printGPA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student record: ");
        String dataInput = sc.next();
        int numberOfScore = sc.nextInt();
        float[] array = new float[numberOfScore];
        int n = 0;
        float averageScore;
        float sumOfScore = 0;
        while (n < numberOfScore){
            array[n]= sc.nextFloat();
            sumOfScore = sumOfScore + array[n];
            n++;
        }
        averageScore = sumOfScore / numberOfScore;
        System.out.print(dataInput);
        System.out.print(Arrays.toString(array));
        System.out.print(dataInput + "'s grade is "+ averageScore);
    }
}
