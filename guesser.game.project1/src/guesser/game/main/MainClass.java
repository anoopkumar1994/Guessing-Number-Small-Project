package guesser.game.main;
import umpire.result.UmpireResult;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Game Start");

        UmpireResult.collectNumFromGuesser();
        UmpireResult.collectNumFromPlayers();
        UmpireResult.compare();
    }
}
