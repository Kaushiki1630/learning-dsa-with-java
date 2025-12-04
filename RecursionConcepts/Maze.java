package RecursionConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    
//  MAZE PROBLEMS 

public static void main(String[] args) {
    // System.out.println(countPaths(3, 3));

    // printingpaths("", 3, 3);
    // System.out.println(printingpaths2("", 3, 3));
    // System.out.println(printingpathsDiag("", 3, 3));

    boolean[][] board={
        {true, true, true},
        {true, true, true},
        {true, true, true}
    };
    // System.out.println(mazeWithObs("", board, 0, 0));

    // printingAllpaths("", board, 0, 0);

    int[][] path= new int[board.length][board[0].length];
    printingAllpaths1("", board, 0, 0, path, 1);
}

//COUNTING PATHS
static int countPaths(int row, int col){
    if(row==1 || col==1){
        return 1;
    }

    int left=countPaths(row, col-1);
    int right=countPaths(row-1, col);

    return left+right;
}

//PRINTING PATHS
static void printingpaths(String p, int row, int col){
    if(row==1 && col==1){
        System.out.println(p);
        return;
    }

    if(row>1){
        printingpaths(p+'D', row-1, col);
    }

    if(col>1){
        printingpaths(p+'R', row, col-1);
    }
}

//PRINTING PATHS USING ARRAYLIST
static ArrayList<String> printingpaths2(String p, int row, int col){
    if(row==1 && col==1){
        ArrayList<String> list= new ArrayList<>();
        list.add(p);
        return list;
    }

    ArrayList<String> l= new ArrayList<>();

    if(row>1){
        l.addAll(printingpaths2(p+'D', row-1, col));
    }

    if(col>1){
        l.addAll(printingpaths2(p+'R', row, col-1));
    }

    return l;
}

static ArrayList<String> printingpathsDiag(String p, int row, int col){
    if(row==1 && col==1){
        ArrayList<String> list= new ArrayList<>();
        list.add(p);
        return list;
    }

    ArrayList<String> l= new ArrayList<>();

    if(row>1 && col>1){
        l.addAll(printingpathsDiag(p+'D', row-1, col-1));
    }

    if(row>1){
        l.addAll(printingpathsDiag(p+'V', row-1, col));
    }

    if(col>1){
        l.addAll(printingpathsDiag(p+'H', row, col-1));
    }

    return l;
}

//PRINTING ALL PATHS WHEN THERE IS OBSTRACLE IN THE MAZE

static ArrayList<String> mazeWithObs(String p, boolean[][] maze, int row, int col){
    if(row==maze.length-1 && col==maze[0].length-1){
        ArrayList<String> list= new ArrayList<>();
        list.add(p);
        return list;
    }

    ArrayList<String> l= new ArrayList<>();

    if(maze[row][col]==false){
        return l;
    }

    if(row<maze.length-1){
        l.addAll(mazeWithObs(p+'D', maze, row+1, col));
    }

    if(col<maze[0].length-1){
        l.addAll(mazeWithObs(p+'R', maze, row, col+1));
    }

    return l;
}

//PRINTING ALL PATHS WHEN THE PERSON CAN MOVE IN ALL DIRECTIONS

static void printingAllpaths(String p, boolean[][] maze, int row, int col){
    if(row==maze.length-1 && col==maze[0].length-1){
        System.out.println(p);
        return;
    }

    if(maze[row][col]==false){
        return;
    }

    maze[row][col]=false;

    if(row>0){
        printingAllpaths(p+'U', maze, row-1, col);
    }

    if(row<maze.length-1){
        printingAllpaths(p+'D', maze, row+1, col);
    }

    if(col>0){
        printingAllpaths(p+'L', maze, row, col-1);
    }

    if(col<maze[0].length-1){
        printingAllpaths(p+'R', maze, row, col+1);
    }

    maze[row][col]=true;
}

//Printing all paths with the steps they followed

static void printingAllpaths1(String p, boolean[][] maze, int row, int col,int[][] path, int level){
    if(row==maze.length-1 && col==maze[0].length-1){
        path[row][col]=level;
        for(int[] arr: path){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(p);
        System.out.println("----------");
        return;
    }

    if(maze[row][col]==false){
        return;
    }

    maze[row][col]=false;
    path[row][col]=level;

    if(row>0){
        printingAllpaths1(p+'U', maze, row-1, col,path, level+1);
    }

    if(row<maze.length-1){
        printingAllpaths1(p+'D', maze, row+1, col,path, level+1);
    }

    if(col>0){
        printingAllpaths1(p+'L', maze, row, col-1,path, level+1);
    }

    if(col<maze[0].length-1){
        printingAllpaths1(p+'R', maze, row, col+1,path, level+1);
    }

    maze[row][col]=true;
    path[row][col]=0;

}

}
