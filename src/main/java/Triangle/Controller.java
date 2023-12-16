package Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Controller {
    private static final ConsoleHelper io = new ConsoleHelper();

    /**
     * Runs the program through.
     * Displays a welcome message, runs the triangle loop
     * And prompts to play again.
     */
    public void run(){
        //a simple heading
        io.heading("Welcome to the Myer's Triangle Test");

        //the process loop
        triangleLoop();

        //ask to play again
        playAgain();
    }

    private void triangleLoop(){
        //array for holding the values of the sides
        ArrayList<Integer> sides = new ArrayList<>();

        //prompt for the sides
        for (int i = 0; i < 3; i++){
            sides.add(inputSide(i));
        }

        //check if it is a triangle and return if it is not a triangle
        if (!checkTriangle(sides)){
            System.out.println("The inputs do not generate a triangle.");
            return;
        }

        //check the triangle type
        TriangleTypes type = getType(sides);

        //print a message
        System.out.printf("The triangle with sides %s, %s, and %s is %s.%n", sides.get(0), sides.get(1), sides.get(2), type.label);

    }

    public Integer inputSide(int i) {
        return Integer.parseInt(io.prompt(1, Integer.MAX_VALUE, String.format("Please enter an integer value greater than 0 for side %s: ", i+1)));

    }

    public TriangleTypes getType(ArrayList<Integer> sides){
        if (Objects.equals(sides.get(0), sides.get(1))
                && Objects.equals(sides.get(1), sides.get(2))){
            return TriangleTypes.EQUILATERAL;

        } else if (Objects.equals(sides.get(0), sides.get(1))
                || Objects.equals(sides.get(1), sides.get(2))
                || Objects.equals(sides.get(0), sides.get(2))) {
            return TriangleTypes.ISOSCELES;

        } else {
            return TriangleTypes.SCALENE;
        }
    }



    public boolean checkTriangle(ArrayList<Integer> sides){
        //check to make sure the size is 3
        if (sides.size() != 3){
            return false;
        }

        //sort the sides to find the largest
        Collections.sort(sides);

        //the sum of the two smaller sides must be greater than the largest
        return sides.get(0) + sides.get(1) > sides.get(2);
    }

    private void playAgain(){
        String input;
        boolean cont = false;
        do {
            input = io.prompt("Play Again? [y/n]: ");
            if (input.equalsIgnoreCase("y")){
                cont = true;

            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing! Goodbye.");
                return;
            } else {
                System.out.println("Please enter 'y' or 'n'. ");
            }

        } while (!cont);
        System.out.println();
        run();


    }
}
