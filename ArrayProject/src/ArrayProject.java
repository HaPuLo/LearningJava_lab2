import java.util.Arrays;

public class ArrayProject {
    public static void main(String[] args) {
        int [] arr= {6, 2, 9, 11, 3};
        System.out.print(percentEven(arr));
    }

    public static int lastIndexOf(int[] a, int target) {
        int lastIndex = 0;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                flag = true;
                lastIndex = i;
            }
        }
        if (flag) {
            return lastIndex;
        } else {
            return -1;
        }
    }

    public static int range(int[] a) {
        int rangeValue = 0;
        int maxValue = a[0];
        int minValue = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            } else if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        rangeValue = maxValue - minValue + 1;
        if (a.length == 1) {
            return 1;
        } else {
            return rangeValue;
        }
    }


    public static int countInRange(int[] a, int min, int max){
        int numberElements = 0;
        for (int i = 0; i< a.length; i++){
            if (a[i] >= min && a[i] <= max){
                numberElements += 1;
            }
        }
        return numberElements;
    }

    public static boolean isSorted(double[] list) {
        int increasingCount = 0;
        int decreasingCount = list.length;
        for (int i = 0; i < list.length -1; i++){
            if (list[i] < list[i+1]){
                increasingCount += 1;
            }
        }
        for (int i = list.length -1 ; i > 0 ; i--){
            if(list[i] < list[i-1]){
                decreasingCount -=1;
            }
        }
        if(increasingCount == (list.length -1) || decreasingCount == 0 || list.length == 1){
            return true;
        }else{
            return false;
        }
    }

    public static int mode(int[] array) {
        int[] spareArray = new int[101];
        for (int i = 0; i < array.length; i++) {
            spareArray[array[i]]++;
        }
        int mode = 101;
        int count = 0;
        for (int i = 0; i < spareArray.length; i++) {
            if (spareArray[i] > count) {
                count = spareArray[i];
                mode = i;
            }
        }
        return mode;
    }

    public static double stdev(int[] a) {
        double stdevNum = 0.0;
        double average = 0.0;
        int sum = a[0];
        for (int i = 0 ; i < a.length ; i++){
            sum = a[i]  + sum;
        }
        average = ((double)(sum / a.length));

        double numerator = 0.0;

        for (int i = 0; i< a.length; i++){
            numerator = Math.pow(a[i] - average, 2) + numerator;
        }
        stdevNum = (Math.sqrt(numerator / (a.length -1)));
        return stdevNum;
    }

    public static int kthLargest(int k, int[] a) {
        int maxNumberFound = 0;
        int compareNumber = 0;
        //sorting array a using insert sort algorithm
        for (int i = 0; i < a.length ; i++){
            compareNumber = a[i];
            int j =  i - 1;
            while (j >= 0 && a[j] < compareNumber){
                a[j +1] = a[j];
                j = j -1;
            }
            a[j + 1] = compareNumber;
        }
        if (k == 0){
            return a[0];
        }else{
            return a[k];
        }
    }

    public static int median(int[] a) {
        int maxNumberFound = 0;
        int compareNumber = 0;
        //sorting array a using insert sort algorithm
        for (int i = 0; i < a.length ; i++){
            compareNumber = a[i];
            int j =  i - 1;
            while (j >= 0 && a[j] < compareNumber){
                a[j +1] = a[j];
                j = j -1;
            }
            a[j + 1] = compareNumber;
        }
        return a[(a.length -1)/2];
    }

    public static int minGap(int[] list) {
        if (list.length <=2 || list.length == 0) {
            return 0;
        }else{
            int [] gapArray = new int[list.length-1];
            for (int i = 0; i < list.length-1; i++){
                gapArray[i]  = list [i+1]-list[i];
            }

            for (int i = 0; i < gapArray.length; i++){
                System.out.print(gapArray[i] +" ");
            }
            System.out.println();
            //sort gapArray
            int maxNumberFound = 0;
            int compareNumber = 0;
            //sorting array a using insert sort algorithm
            for (int i = 0; i < gapArray.length ; i++){
                compareNumber = gapArray[i];
                int j =  i - 1;
                while (j >= 0 && gapArray[j] > compareNumber){
                    gapArray[j +1] = gapArray[j];
                    j = j -1;
                }
                gapArray[j + 1] = compareNumber;
            }
            return gapArray[0];
         }
    }

    public static double percentEven(int[] list) {
        double percent = 0.0;
        if (list.length == 0){
            return 0.0;
        }else{
            int countEvenNumber = 0;
            for (int i = 0; i< list.length; i++){
                if (list[i] % 2 == 0){
                    countEvenNumber += 1;
                }
            }
            percent = (double)countEvenNumber / list.length;
            return percent * 100;
        }
    }
}


