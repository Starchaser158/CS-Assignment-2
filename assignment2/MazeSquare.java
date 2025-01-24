/**
 * MazeSquare.java
 * A helper class for maze solving assignment.
 * Represents a single square within a rectangular maze.
 *
 * @author Nicholas Theus and John Yu
 */
public class MazeSquare{
    // Instance variables of your choosing
    private int row;
    private int col;
    private String lilGuy;
    private String squadGoals;
    private String design;
    
    // A constructor, taking whatever parameters you decide:
    public MazeSquare(int row, int col, String squareType) {
        // YOUR CODE HERE
        this.row = row;
        this.col = col;
        lilGuy = squareType;
        design = "";
        if(lilGuy.equals("L")){
            
        }
        else if(lilGuy.equals("|")){

        }
        else if(lilGuy.equals("_")){

        }
        else if(lilGuy.equals("-")){

        }
    }

    public MazeSquare(int row, int col, String squareType, String staFinish){
        this.row = row;
        this.col = col;
        lilGuy = squareType;
        squadGoals = staFinish;
        design = "";
        if(lilGuy.equals("L")){
            
        }
        else if(lilGuy.equals("|")){

        }
        else if(lilGuy.equals("_")){

        }
        else if(lilGuy.equals("-")){

        }
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public String getSquareType(){
        return lilGuy;
    }

    public String getSquadGoals(){
        return squadGoals;
    }
    
}
