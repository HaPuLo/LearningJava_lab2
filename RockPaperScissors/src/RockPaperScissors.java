import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Does the player One choose rock , paper or scissors ? ");
        String playerOne= input.next();
        System.out.print("Does the player Two choose rock , paper or scissors ? ");
        String playerTwo= input.next();

        if (playerOne.equals("rock")){
            if (playerTwo.equals("scissors")){
                System.out.println("Player One wins!");
            } else if (playerTwo.equals("paper")){
                System.out.println("Player Two wins!");
            }else {//player two choose rock
                System.out.println("Tie!");
            }
        }else if(playerOne.equals("paper")){
            if (playerTwo.equals("scissors")){
                System.out.println("Player Two wins!");
            } else if (playerTwo.equals("paper")){
                System.out.println("Tie");
            }else {//player two choose rock
                System.out.println("Player One wins!");
            }
        }else {//player One choose scissors
            if (playerTwo.equals("scissors")){
                System.out.println("Tie");
            } else if (playerTwo.equals("paper")){
                System.out.println("Player One wins");
            }else {//player two choose rock
                System.out.println("Player Two wins!");
            }
        }
    }

}
