package com.kodilla.sudoku.util;

import com.kodilla.sudoku.SudokuBoard;
import com.kodilla.sudoku.SudokuElement;
import com.kodilla.sudoku.SudokuRow;

public class Display {
    public static void board(SudokuBoard sudokuBoard) {
        System.out.println(sudokuBoard);
    }

    public static void allPossibleValues(SudokuBoard sudokuBoard) {
        for (SudokuRow row : sudokuBoard.getSudokuRows()) {
            for (SudokuElement element : row.getSudokuElements()) {
                element.printCoordinatePossibleValuesCurrentValue();
            }
        }
    }
}
