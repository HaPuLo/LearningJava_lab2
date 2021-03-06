import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class smallestLargest {
    public static void main(String[] argv) {
        smallestLargestNumber();
    }
    public static void smallestLargestNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter ? ");
        int numbers_input = sc.nextInt();
        int[] array = new int[numbers_input];
        //Require user input the number into system
        int n = 0;
        while (n < numbers_input) {
            System.out.print("Number " + (n + 1) + " : ");
            int number = sc.nextInt();
            array[n] = number;
            n++;
        }
        //System.out.println(Arrays.toString(array));

        int smallest = 0;
        int largest = 0;
        smallest = largest = array[0];
        //Get the smallest and largest number
        /*
        for(int i = 0; i < array.length ; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
            if (array[i] > largest){
                largest = array[i];
            }
        }
        */
        int m = 0;
        while (m < array.length){
            if (array[m] < smallest){
                smallest = array[m];
            }
            if (array[m] > largest){
                largest = array[m];
            }
            m++;
        }
        //Find the smallest and largest number
        System.out.print("Smallest : " + smallest);
        System.out.println();
        System.out.print("Largest : " + largest);
    }
}
