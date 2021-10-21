import java.util.Scanner;

public class CompareString {
    public static void main(String[] arvg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the first people: ");
        String a = sc.nextLine();
        System.out.print("Name of the second people: ");
        String b = sc.nextLine();
        //Using equals method to get string b
        if (a.equals(b)){
            System.out.println("two people have the same name");
        }else {
            System.out.println("two people don't have the same name");
        }
    }

}
