import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        // we use this to get input from the user
        GameHelper helper = new GameHelper();
        // make the Startup object
        Startup theStartup = new Startup();
        // make a random number between 0-4 for the start of our target
        // random gives 0 - 0.9999 double --->>> 0.9999 * 5 < 5 --->>> (int)(0.9999 * 5) is 4
        int randomNum = (int) (Math.random()*5);
        // make an array for the 3 consecutive int (the target) ---> we start from the random number a
        ArrayList<String> locationTargetCells = new ArrayList<String>();

        String cellTarget = String.valueOf(randomNum);
        locationTargetCells.add(cellTarget);

        String cellTarget1 = String.valueOf(randomNum+1);
        locationTargetCells.add(cellTarget1);

        String cellTarget2 = String.valueOf(randomNum+2);
        locationTargetCells.add(cellTarget2);

        theStartup.setLocationCells(locationTargetCells);
       // we use a boolean var. to track if the game is over or not
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number(0-7) -> ");
            // call the checkPlayerGuess to verify the player choyce
            String result = theStartup.checkPlayerGuess(guess);

            // we verify if the target is destroyed
            if(result.equals("kill") ){
                isAlive = false;                        // if destroyed we set isAlive to0 false --- exit the while loop
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}





















