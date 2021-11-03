import java.util.Arrays;

public class fibonancyProject {
    public static void main(String[] arvg){
        int[] array = new int[12];
        int result = 0;
        for (int i = 0; i < array.length ; i++){
            if (i< 2){
                result = 1;
                array[i] = result;
                System.out.print(array[i]+" ");
            }else {
                result = array[i-1] + array[i-2];
                array[i] = result;
                System.out.print(array[i]+ " ");
            }
        }
    }
}
