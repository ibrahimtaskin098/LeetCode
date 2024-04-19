package arrayAndHashing9;

import java.util.HashSet;
import java.util.Set;
//input
//  char[][] board = {
//    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//    }; 




//Approach 1
//The time complexity of the given code is O(n^2)
//The space complexity of the given code is also O(1)




class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Set<String> check = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {

                    if (!check.add(board[i][j] + "row" + i)
                            || !check.add(board[i][j] + "coloum" + j)
                            || !check.add(board[i][j] + "box" + i / 3 + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku obj = new ValidSudoku();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '5', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(obj.isValidSudoku(board));
    }
}

