import java.util.Scanner;

public class printTriangleTypeProgram {
    public static void main(String[] argv){
        printTriangleType(9,9,9);
    }
    public static void printTriangleType(int s1, int s2, int s3) {
        if ((s1 == s2)&&(s1 == s3)&&(s2 == s3)){
            System.out.print("equilateral");
        } else if ((s1 == s2)||(s1 == s3)||(s2 == s3)){
            System.out.print("isosceles");
        }else{
            System.out.print("scalene");
        }
    }
}
