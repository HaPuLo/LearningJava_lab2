import java.util.Locale;
import java.util.Scanner;

public class Ass1_luckyNumber {
    public static void main(String[] argv){
        System.out.println("I'm thinking of a number between 0 and 100...");
        play();
    }
    public static void play(){
        //report game statistic variable
        int totalGames = 1;
        int totalGuess=0;
        int gameGuess=0;
        int minGameGuess=gameGuess;
        double guessAvg = 0.0;
        int bestGame = 0;
        int minGuess = 0;
        Scanner sc = new Scanner(System.in);
        //generate random number
        double number = Math.random() * 10;
        int randomNumber = (int)number;
        System.out.println("The random number is : " + randomNumber);
        //Control game flag, found the valid number set to false out while loop
        boolean validNumberNotFound = true;
        do{
            System.out.print("Your guess? ");
            int guessNumber = sc.nextInt();
            if(!(guessNumber >=0) && !(guessNumber <=100)){
                while(!(guessNumber >=0) && !(guessNumber <=100)){
                    System.out.println("Please input the number 0 to 100 ");
                    System.out.print("Your guess? ");
                    guessNumber = sc.nextInt();
                    if ((guessNumber >=0) && (guessNumber <=100)){
                        break;
                    }
                }
            }
            gameGuess +=1;
            //Check the number to see if it's valid
            if (guessNumber > randomNumber){
                System.out.println("It's lower.");
                validNumberNotFound  = true;
            }else if (guessNumber < randomNumber){
                System.out.println("It's higher. ");
                validNumberNotFound  = true;
            }else if(guessNumber == randomNumber) {
                System.out.println("You got it right in " + gameGuess + " guesses!");
                //update new total game Guess and reset counter guess in game
                totalGuess = totalGuess + gameGuess;
                //check for good game if first game assign value for best game else compare to find min best game
                if (totalGames == 1) {
                    bestGame = gameGuess;
                }else if(gameGuess < bestGame){
                    bestGame = gameGuess;
                }

                //Do you want to play again
                System.out.print("Do you want to play again ?");//Match the number
                String s = sc.next();
                s = s.toLowerCase();
                if ((s.equals("y") || s.equals("yes") || s.equals("co")
                        ||s.equals("n") || s.equals("no") || s.equals("khong"))){
                    if (s.equals("y") || s.equals("yes") || s.equals("co")) {
                        gameGuess = 0;
                        totalGames += 1;
                        validNumberNotFound = true;
                    } else if (s.equals("n") || s.equals("no") || s.equals("khong")) {
                        guessAvg = (double) totalGuess / (double) totalGames;
                        //Print report
                        report(totalGames, totalGuess, guessAvg, bestGame);
                        totalGuess = 0;
                        totalGames = 0;
                        validNumberNotFound = false;
                    }
                }else{
                    //User in put again
                    while (!(s.equals("y") || s.equals("yes") || s.equals("co")
                            ||s.equals("n") || s.equals("no") || s.equals("khong"))) {
                        System.out.print("You need to key \"yes\" or \"no\" ");
                        System.out.print("Do you want to play again ?");//Match the number
                        s = sc.next();
                        s = s.toLowerCase();
                        if (s.equals("y") || s.equals("yes") || s.equals("co")) {
                            gameGuess = 0;
                            totalGames += 1;
                            validNumberNotFound = true;
                            break;
                        } else if (s.equals("n") || s.equals("no") || s.equals("khong")) {
                            guessAvg = (double) totalGuess / (double) totalGames;
                            //Print report
                            report(totalGames, totalGuess, guessAvg, bestGame);
                            totalGuess = 0;
                            totalGames = 0;
                            validNumberNotFound = false;
                            break;
                        }
                    }
                }

            }
        }while (validNumberNotFound);
    }


    public static void report(int totalGames,int totalGuess, double guessAvg, int bestGame){
        System.out.println("Overall results: ");
        System.out.println("Total games =  " + totalGames);
        System.out.println("Total guesses =  " + totalGuess);
        System.out.println("Guesses/game =  " + guessAvg);
        System.out.println("Best game =  " + bestGame);
    }
}