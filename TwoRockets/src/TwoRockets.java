public class TwoRockets {
    public static void main(String[] argv){
        TopRocket();
        MiddleRocket();
        MiddleRocketNation();
        MiddleRocket();
        TopRocket();
    }

    public static void TopRocket(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void MiddleRocket(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void MiddleRocketNation(){
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
