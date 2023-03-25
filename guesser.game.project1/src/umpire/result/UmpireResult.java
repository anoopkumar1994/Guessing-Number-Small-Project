package umpire.result;
import set.guesseing.number.SetGuessingNumber;
import guesses.players.play.PlayersGuessesNumber;

public class UmpireResult {
   static int p1;
    static int p2;
    static int p3;
    static int p4;
    static int p5;

    static int numFromPlayer;


         public static void collectNumFromGuesser(){
             numFromPlayer = SetGuessingNumber.getSetGuessingNum();
        }

        public static void collectNumFromPlayers(){

            p1 = PlayersGuessesNumber.playersGuessNum();
            p2 = PlayersGuessesNumber.playersGuessNum();
            p3 = PlayersGuessesNumber.playersGuessNum();
            p4 = PlayersGuessesNumber.playersGuessNum();
            p5 = PlayersGuessesNumber.playersGuessNum();

        }

         public static void compare(){

            if(numFromPlayer == p1){
                System.out.println("Player 1 won the game");
            } else if (numFromPlayer == p2) {
                System.out.println("Player 2 won the game ");
            } else if (numFromPlayer == p3) {
                System.out.println("Player 3 won the game ");
            } else if (numFromPlayer == p4) {
                System.out.println("Player 4 won the game ");
            } else if (numFromPlayer == p5) {
                System.out.println("Player 5 won the game ");
            }else{
                System.out.println("You Lost the game ");
            }

        }
    }
