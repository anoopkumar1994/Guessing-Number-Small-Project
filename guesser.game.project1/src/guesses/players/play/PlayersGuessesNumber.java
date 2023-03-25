package guesses.players.play;

import java.util.Scanner;

public class PlayersGuessesNumber {
   static int player;

   public static int playersGuessNum(){
       Scanner s = new Scanner(System.in);
       System.out.print("Player please Enter the right guessing number ");
       player = s.nextInt();
       return player;
   }
}
