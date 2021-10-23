import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class longestNameProgram {
    public static void main(String[] argv){
        Scanner console = new Scanner(System.in);
        longestName(console, 1);
    }
    public static void longestName(Scanner console, int names) {
        //Input data from user
        int n = 0;
        String[] namesArray = new String[names];
        while(n < names){
            System.out.print("name #" + (n+1) + "? ");
            namesArray[n] = console.next();
            n++;
        }
        //Check the longest name logic
        boolean tieFlag = false;
        String longestNameFound = namesArray[0];
        for (int i = 0 ; i< namesArray.length; i ++) {
            if (namesArray[i].length() > longestNameFound.length()) {
                longestNameFound = namesArray[i];
                tieFlag = false;
            }else if ((namesArray[i].length() == longestNameFound.length())&&(names !=1)) {
                tieFlag = true;
            }
        }

        longestNameFound = longestNameFound.substring(0,1).toUpperCase()+ longestNameFound.substring(1).toLowerCase();
        System.out.print( longestNameFound +"'s name is longest");
        System.out.println();
        if (tieFlag){//Have 2 more the longest name
            System.out.print("(There was a tie!)");
        }
    }
}
