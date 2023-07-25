public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locations){
        locationCells = locations;
    }
    public String checkPlayerGuess(int guess){
        // make a variable to hold the result , initialize with "miss"
        String result = "miss";

        // repeat with each cell in the location and compare with the guess
        for(int cell:locationCells) {
            if(guess == cell) {

                result = "hit";
                numOfHits++;
                break;
            }
        }
        // we verify if all cells from the target are hit, if true return "kill"
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

















