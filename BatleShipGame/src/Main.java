public class Main {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();

        // make an array for the 3 consecutive int (the target)
        int[] target_locations = {2, 3, 4};
        // call the setter method
        dot.setLocationsCells(target_locations);
        // make a guess
        int userGuess = 2;
        // call checkPlayerGuess method on the Startup object and pass 2 as argument
        String result = dot.checkPlayerGuess(userGuess);
        // create a variable to hold if the test is passed or not , initialize var with "failed"
        String testResult = "failed";
        // if the player guess gives back "hit" the method is working
        if(result.equals("hit")){
            testResult = "Passed";
        }
        System.out.println(testResult);
    }
}





















