import java.util.Scanner;

public class ScannerCharater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get char in string input from User then display next character
        char character = (char) (sc.next().charAt(0) + 1);
        System.out.println(character);
    }
}


