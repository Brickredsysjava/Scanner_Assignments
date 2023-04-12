package org.q8;

import java.util.Scanner;

public class TicTacToe {

    private final char[][] board;  // the game board
    private char currentPlayer;   // X or O

    public TicTacToe() {
        board = new char[3][3];    // initialize empty board
        currentPlayer = 'X';       // X goes first
    }

    // print the game board
    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // ask the current player for their move
    public void makeMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.print("Player " + currentPlayer + ", enter row (1-3): ");
            row = scanner.nextInt() - 1;
            System.out.print("Player " + currentPlayer + ", enter column (1-3): ");
            col = scanner.nextInt() - 1;
        } while (!isValidMove(row, col));
        board[row][col] = currentPlayer;
        switchPlayer();
    }

    // check if a move is valid (i.e., the cell is empty and the row and column are in bounds)
    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid row or column, try again.");
            return false;
        }
        if (board[row][col] != 0) {
            System.out.println("Cell is already occupied, try again.");
            return false;
        }
        return true;
    }

    // switch the current player
    private void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    // check if there is a winner
    public boolean hasWinner() {
        // check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        // check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != 0 && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true;
            }
        }
        // check diagonals
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != 0 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        return false;
    }

    // check if the game is a tie (i.e., the board is full)
    public boolean isTie() {
        for (int i = 0
             ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // play the game
    public void play() {
        System.out.println("Welcome to Tic Tac Toe!");
        while (!hasWinner() && !isTie()) {
            printBoard();
            makeMove();
        }
        printBoard();
        if (hasWinner()) {
            System.out.println("Congratulations, player " + currentPlayer + " has won!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}