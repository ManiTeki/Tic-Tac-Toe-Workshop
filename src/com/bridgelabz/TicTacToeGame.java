package com.bridgelabz;

public class TicTacToeGame {
    public static final int ROWS = 10;
    public static final int COLS = 10;


    public Board() {
       int  board = new board[ROWS][COLS];
        for(int row = 0; row< ROWS;++row) {
            for(int col = o; col<COLS; ++col){
                board[row][col] = new board(row,col);
            }
        }
    }

    public static void main(String[] args) {
        for(int row=0;row<ROWS;++row){
            for(int col = 0; col<COLS; ++col){
                board[row][col].init();
            }
        }

    }
}
