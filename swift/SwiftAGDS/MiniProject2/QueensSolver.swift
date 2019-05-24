//
//  QueensSolver.swift
//  SwiftAGDS
//
//  Created by Derrick Park on 2019-03-13.
//  Copyright © 2019 Derrick Park. All rights reserved.
//

import Foundation

/// Write a function solveQueens that accepts a Board as a parameter
/// and tries to place 8 queens on it safely.
///
/// - Your method should stop exploring if it finds a solution
/// - You are allowed to change the function header (args or return type)
/// - Your total recursive calls should not exceed 120 times.

//var count = 0
struct QueensSolver {
    static func solveQueens(board: inout Board) {
        //	count += 1
        solveRecursively(8, &board, 0)
        print(board)
    }

    static func solveRecursively(_ rest: Int, _ board: inout Board, _ nextRow: Int) -> Bool {
        count += 1
        if rest == 0 {
            return true
        }

        for col in 0...8 {
            if !board.isSafe(row: nextRow, col: col){
                continue
            }

            board.place(row: nextRow, col: col)
            if !solveRecursively(rest - 1, &board, nextRow + 1) {
                board.remove(row: nextRow, col: col)
            } else {
                return true
            }
        }

        return false
    }
}

