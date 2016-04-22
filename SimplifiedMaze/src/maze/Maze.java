package maze;/* Finding the solution of escaping from a maze.

   This will be illustrating using:
   - using stacks (depth-first search)
   - using queues (breadth-first search)
   - using recursion
*/


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class Maze {

    final static char C = ' ', X = 'x', S = 's', E = 'e', V = '.';
    // S = starting point
    // E = exit point

    final static int START_I = 1, START_J = 1;
    final static int END_I = 2, END_J = 9;
    private static char[][] maze = {
            {X, X, X, X, X, X, X, X, X, X},
            {X, S, C, C, C, C, C, C, C, X},
            {X, C, C, C, X, C, X, X, C, E},
            {X, C, X, X, X, C, X, X, C, X},
            {X, C, C, C, C, X, X, X, C, X},
            {X, X, X, X, C, X, X, X, C, X},
            {X, X, X, X, C, X, C, C, C, X},
            {X, X, C, X, C, X, X, C, C, X},
            {X, X, C, C, C, C, C, C, C, X},
            {X, X, X, X, X, X, X, X, X, X}
    };

    // where you have been
    Set<MazePos> seen = new LinkedHashSet<>();


    public static void main(String[] args) {

        Maze maze = new Maze();
        maze.print();

        System.out.println("\n\nFind a path using a stack: ");
        maze.solveStack();
        maze.print();
        maze.seen.clear();

        System.out.println("\n\nFind a path using a queue: ");
        maze.solveQueue();
        maze.print();
        maze.seen.clear();

        System.out.println("\n\nFind a path recursively: ");
        maze.solveRec();
        maze.print();
    }

    public int size() {
        return maze.length;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size(); j++) {
                System.out.print(maze[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void mark(MazePos pos) {
        assert (isInMaze(pos));
        seen.add(pos);
    }

    public boolean isMarked(MazePos pos) {
        assert (isInMaze(pos));
        return seen.contains(pos);
    }

    public boolean isClear(MazePos pos) {
        assert (isInMaze(pos));
        return !seen.contains(pos);
    }

    //true if cell is within maze
    public boolean isInMaze(MazePos pos) {
        int i = pos.i;
        int j = pos.j;
        return (i >= 0 && i < size() && j >= 0 && j < size());
    }

    public boolean isFinal(MazePos pos) {
        int i = pos.i;
        int j = pos.j;
        return (i == Maze.END_I && j == Maze.END_J);
    }

    //THE GOAL IS TO FIND A PATH FROM START TO END

    //**************************************************
    //this solution uses a stack to keep track of possible
    //states/positions to explore; it marks the maze to remember the
    //positions that it's already explored.
    public void solveStack() {

        //declare the locations stack
        Stack<MazePos> candidates = new Stack<>();

        //insert the start
        MazePos start = new MazePos(START_I, START_J);
        candidates.push(start);

        MazePos crt = start;
        MazePos next;

        while (!candidates.empty()) {

            //get current position
            crt = candidates.pop();

            if (isFinal(crt)) {
                break;
            }

            //mark the current position
            seen.add(crt);

            //put its neighbors in the queue
            next = crt.north();
            if (isInMaze(next) && isClear(next)) candidates.push(next);
            next = crt.east();
            if (isInMaze(next) && isClear(next)) candidates.push(next);
            next = crt.west();
            if (isInMaze(next) && isClear(next)) candidates.push(next);
            next = crt.south();
            if (isInMaze(next) && isClear(next)) candidates.push(next);
        }


        if (isFinal(crt))
            System.out.println("You got it!");
        else
            System.out.println("You're stuck in the maze!");
    }

    //**************************************************
    //this solution uses a QUEUE to keep track of possible
    //states/positions to explore; it marks the maze to remember the
    //positions that it's already explored.
    public void solveQueue() {

        //declare the locations stack
        LinkedList<MazePos> candidates = new LinkedList<>();

        //insert the start
        MazePos start = new MazePos(START_I, START_J);
        candidates.add(start);

        MazePos crt = start;
        MazePos next;

        while (!candidates.isEmpty()) {

            //get current position
            crt = candidates.removeFirst();

            if (isFinal(crt)) {
                break;
            }

            //mark the current position
            mark(crt);

            //put its neighbors in the queue
            next = crt.north();
            if (isInMaze(next) && isClear(next)) candidates.add(next);
            next = crt.east();
            if (isInMaze(next) && isClear(next)) candidates.add(next);
            next = crt.west();
            if (isInMaze(next) && isClear(next)) candidates.add(next);
            next = crt.south();
            if (isInMaze(next) && isClear(next)) candidates.add(next);
        }

        if (isFinal(crt))
            System.out.println("You got it!");
        else
            System.out.println("You're stuck in the maze!");
    }


    //************************************************** solve using
    //recursion. Note: this solution unmarks the path upon reaching
    //dead ends, so in the end only the path is left marked. It is
    //possible to write a solution that does not un-mark its traces,
    //but instead it clones and restores the maze.
    public void solveRec() {

        if (solve(new MazePos(START_I, START_J)))
            System.out.println("Got it: ");
        else
            System.out.println("You're stuck in the maze.");
    }


    //find a path to exit the maze from this position. Works
    //recursively, by advancing to a neighbor and continuing from
    //there. If a path is found, return true. Otherwise return false.
    public boolean solve(MazePos pos) {

        //base case
        if (!isInMaze(pos)) return false;
        if (isFinal(pos)) return true;
        if (!isClear(pos)) return false;

        //current position must be clear
        assert (isClear(pos));

        //recurse

        //first mark this  location
        mark(pos);

        //try to go south
        if (solve(pos.south())) {
            //we found a solution going south: if we want to leave the
            //maze clean, then unmark current cell and return; if we
            //want to mark the path in the maze, then don't unmark
            //mark(pos, C);
            return true;
        }

        //else west
        if (solve(pos.west())) {
            //we found a solution going west: if we want to leave the
            //maze clean, then unmark current cell and return; if we
            //want to mark the path in the maze, then don't unmark
            //return
            //mark(pos, C);
            return true;
        }

        //else north
        if (solve(pos.north())) {
            //we found a solution going north: if we want to leave the
            //maze clean, then unmark current cell and return; if we
            //want to mark the path in the maze, then don't unmark
            //return
            // mark(pos, C);
            return true;
        }

        //else east
        if (solve(pos.east())) {
            //we found a solution going east: if we want to leave the
            //maze clean, then unmark current cell and return; if we
            //want to mark the path in the maze, then don't unmark
            //return
            //mark(pos, C);
            return true;
        }

        //unmark all dead ends; since it was marked, the position must
        //have been clear
        mark(pos);

        //if none of the above returned, then there is no solution
        return false;
    }
}


class MazePos {
    int i, j;

    public MazePos(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "(" + i + "," + j + ")";
    }

    public MazePos north() {
        return new MazePos(i - 1, j);
    }

    public MazePos south() {
        return new MazePos(i + 1, j);
    }

    public MazePos east() {
        return new MazePos(i, j + 1);
    }

    public MazePos west() {
        return new MazePos(i, j - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof MazePos)) return false;
        MazePos tmp = (MazePos) o;
        return (this.i == tmp.i && this.j == tmp.j);
    }

    @Override
    public int hashCode() {
        return i * 1000 + j * 10;
    }
}
