public class Egg2 {
    public static void main(String[] argv){
        Egg2_WithoutMiddle();
        Egg2_Middle();
        Egg2_WithoutMiddle();
        Egg2_HalfOfBottomEgg();
        Egg2_WithMiddle();
    }
    public static void Egg2_Top(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void Egg2_Middle(){
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void Egg2_Bottom(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    public static void Egg2_WithoutMiddle(){
        Egg2_Top();
        Egg2_Bottom();
    }
    public static void Egg2_HalfOfBottomEgg(){
        Egg2_Middle();
        Egg2_Bottom();
    }
    public static void Egg2_WithMiddle(){
        Egg2_Top();
        Egg2_Middle();
        Egg2_Bottom();
    }
}
