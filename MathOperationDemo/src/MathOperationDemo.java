public class MathOperationDemo {
    public static void main(String[] avgr){
        double x = 10;
        int y = 3;

        //Mix double and int --> Double in Java
        System.out.println("x + y = "+ (x+y));
        System.out.println("x - y = "+ (x-y));
        System.out.println("x * y = "+ (x*y));
        System.out.println("x / y = "+ (x/y));

        x++;
        y *= 10;
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
}
