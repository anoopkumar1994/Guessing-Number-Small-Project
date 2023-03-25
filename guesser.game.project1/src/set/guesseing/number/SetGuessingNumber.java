package set.guesseing.number;

import java.util.Scanner;

public class SetGuessingNumber {
   static int setGuessingNum;

    public static int getSetGuessingNum(){
        Scanner s = new Scanner(System.in);
        System.out.print("Guesser please set the guessing number ");
        setGuessingNum = s.nextInt();
        return setGuessingNum;
    }
}
