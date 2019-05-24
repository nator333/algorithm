//
//  main.swift
//  MiniProject2
//
//  Created by Masahiro on 2019-03-18.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation


var board = Board.init(size: 8)
var count = 0
QueensSolver.solveQueens(board: &board)
print(count)
