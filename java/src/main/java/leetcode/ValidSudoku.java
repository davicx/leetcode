package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {

        //char[][] board = {{'a'},{'b'}};
        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        char[][] board2 =
                {{'1','2','3','4','5','6','7','8','9'}
                ,{'a','b','c','d','e','f','g','h','i'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        char[][] board3 =
                {{'1','2','3','4'},
                {'1','2','3','4'},
                {'1','2','3','4'},
                {'1','2','3','4'}};


        char[][] board4 =
                {{'a','a','b','b'},
                {'a','a','b','b'},
                {'c','c','d','d'},
                {'c','c','d','d'}};

        isValidSudoku(board4);
    }

    public static boolean isValidSudoku(char[][] board) {

        /*
        //Check Across
        System.out.println("Across");
        checkAcross(board);
        System.out.println(" ");

        //Check Down
        System.out.println("Down");
        checkDown(board);
        System.out.println(" ");
         */

        //Check Squares
        System.out.println("Down");
        checkSquare(board,2,2);
        System.out.println(" ");


        return true;
    }

    public static boolean checkSquare(char[][] board, int width, int height) {

        for (int i = 0; i < board.length; i = i + width) {
            for (int j = 0; j < board.length; j = j + height) {
                int startWidth = i;
                int endWidth = i + width;
                int startHeight = j;
                int endHeight = j + height;

                System.out.println("width " + startWidth + "-" +  endWidth +  " height " + startHeight + "-" +  endHeight);
                checkSmallBoard(board, startWidth, endWidth, startHeight, endHeight);
                System.out.println(" ");
            }
        }

        return true;

    }

    public static boolean checkSmallBoard(char[][] board, int startWidth, int endWidth, int startHeight, int endHeight) {

        return true;


    }



    public static boolean checkAcross(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> acrossSet = new HashSet<Character>();

            for (int j = 0; j < board[i].length; j++) {

                Character currentChar = board[i][j];
                System.out.print(currentChar + " ");

                if (acrossSet.contains(currentChar)) {
                    //System.out.println("Duplicate!");
                }
                acrossSet.add(currentChar);

            };
            System.out.println(" ");
        }
        return true;
    }

    public static boolean checkDown(char[][] board) {
        Set<Character> downSet = new HashSet<Character>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //System.out.print("[" + j + "," + i + "]");
                Character currentChar = board[j][i];
                System.out.print(currentChar + " ");
                if (downSet.contains(currentChar)) {
                    //System.out.println("Duplicate!");
                }
                downSet.add(currentChar);
            };
            System.out.println(" ");
        }

        return true;

    }


}


/*


 */