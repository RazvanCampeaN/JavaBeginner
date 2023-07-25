import java.util.ArrayList;
public class Startup {
   // we use an ArrayList to keep the position of the target cells
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locations){
        locationCells = locations;
    }

    public String checkPlayerGuess(String userGuess){
        // make a variable to hold the result , initialize with "miss"
        String result = "miss";

        // we find if the user guess is in our target ArrayList
        // .indexOf(user guess) return -1 if user guess is not in the target ArrayList
        int index = locationCells.indexOf(userGuess);

         //if index >= 0  then user guess is in the target list, and we remove that value from the list
        if(index >= 0) {
            locationCells.remove(index);
            // next we will verify if the list is empty(if the target is dead) or is only a "hit"
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }
}

















