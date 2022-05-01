package com.leetcode.problem.solution.medium;

public class SurroundedRegions {


    public static int[][] DIR = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
    public static char NON_CAPTURED = '#';

    public void solve(char[][] board) {
        if(board == null || board.length ==0 || board[0].length == 0 ){
            return;
        }

        int m = board.length;
        int n = board[0].length;


        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfsHelper(board, i, 0);
            }

            if (board[i][n - 1] == 'O') {
                dfsHelper(board, i, n - 1);
            }
        }
        for (int j = 1; j < n - 1; j++) {
            if (board[0][j] == 'O') {
                dfsHelper(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {
                dfsHelper(board, m - 1, j);
            }
        }

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){

                if(board[i][j] == 'X'){
                    continue;
                }

                if(board[i][j] == NON_CAPTURED){
                    board[i][j]= 'O';
                }
                else{
                    board[i][j]= 'X';
                }

            }
        }

    }

    public void dfsHelper(char[][] board, int x, int y){

        if(x<0 || x >= board.length || y<0 || y>= board[0].length || board[x][y] != 'O'){
            return;
        }

        board[x][y]=NON_CAPTURED;

        for(int d[] : DIR){
            dfsHelper(board,x+d[0],y+d[1] );
        }

    }


}
