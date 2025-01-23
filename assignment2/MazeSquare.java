/**
 * MazeSquare.java
 * A helper class for maze solving assignment.
 * Represents a single square within a rectangular maze.
 *
 * @author YOUR NAME AND YOUR PARTNER'S NAME
 */
public class MazeSquare {
    // Instance variables of your choosing
    private int row;
    private int col;
    private int lilGuy;
    private int squadGoals;
    
    // A constructor, taking whatever parameters you decide:
    public MazeSquare(int row, int col, String squareType) {
        // YOUR CODE HERE
        this.row = row;
        this.col = col;
        lilGuy = squareType;
    }

    public MazeSquare(int row, int col, String squareType, String staFinish){
        this.row = row;
        this.col = col;
        lilGuy = squareType;
        squadGoals = staFinish
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

    // Whatever methods you want, such as:
    public boolean hasTopWall() {
        // YOUR CODE (and new return statement) HERE
        if(getRow() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasSideWall(){
        if(getCol() == w - 1){
            return true;
        }
        else{
            return false;
        }
    }
}
