/**
 * Maze.java
 * A class for loading and printing mazes from files.
 *
 * @author Nicholas Theus and John Yu
 */
public class Maze {
    private ArrayList<ArrayList<MazeSquare>> rowList;
    private int w;
    private int h;
    private int startW;
    private int startH;
    private int finishW;
    private int finishH;

    // OTHER INSTANCE VARIABLES IF YOU NEED THE
    
    /*
     * Constructor for the Maze class
     */
    public Maze() {
        rowList = new ArrayList<ArrayList<MazeSquare>>();
    }

    /*
     * Load in a Maze from a given file
     *
     * @param fileName the name of the file containing the maze
     */
    public void load(String fileName) {
        // Create a scanner for the given file
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.exit(1);
        }

        // First line of file is "w h"
        String[] lineParams = scanner.nextLine().split(" ");
        w = Integer.parseInt(lineParams[0]);
        h = Integer.parseInt(lineParams[1]);
        
        // YOUR CODE TO FINISH LOADING FILE HERE
        lineParams = scanner.nextLine().split(" ");
        startW = Integer.parseInt(lineParams[0]);
        startH = Integer.parseInt(lineParams[1]);

        lineParams = scanner.nextLine().split(" ");
        finishW = Integer.parseInt(lineParams[0]);
        finishH = Integer.parseInt(lineParams[1]);

        for(int i = 0; i < h; i++){
            lineParams = scanner.nextLine(.split(" "));
            rowList.add(new ArrayList<MazeSquare>())

            for(int j = 0; j < w; j++){
                String lilGuy = (String) lineParams[j];
                if(i == startH && j == startW){

                    rowList.get(i).add(new MazeSquare(i, j, lilGuy, "start"));

                }
                
                else if(i == finishH && j == finishW){

                    rowList.get(i).add(new MazeSquare(i, j, lilGuy, "finish"));

                }

                else{
                    
                    rowList.get(i).add(new MazeSquare(i, j, lilGuy));
                }
                
            }
        }
    }

    /**
     * Print the Maze to System.out
     */
    public void print() {
        // YOUR CODE HERE
    }

    // MORE METHODS AS YOU NEED THEM

    // This main program acts as a simple unit test for the
    // load-from-file and print-to-System.out Maze capabilities.
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Maze mazeFile");
            System.exit(1);
        }

        Maze maze = new Maze();
        maze.load(args[0]);
        maze.print();
    }
}