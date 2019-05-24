//
//  main.swift
//  OrangesRotting
//
//  Created by Masahiro on 2019-04-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation


func orangesRotting(_ grid: [[Int]]) -> Int {
    var allZeroOrTwo = true
    for i in grid {
        for j in i {
            if j == 1 {
                allZeroOrTwo = false
            }
        }
    }
    if allZeroOrTwo {
        return 0
    }
    var grid = grid
    var notRotten = false
    var dayNum = 1
    while !notRotten {
        dayNum += 1
        notRotten = true
        for i in 0..<grid.count {
            for j in 0..<grid[0].count {
                if grid[i][j] == 0 {
                    continue
                }
                if grid[i][j] != dayNum {
                    continue
                }
                notRotten = false

                // check under & side
                if (i + 1 < grid.count && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = dayNum + 1
                }
                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j] = dayNum + 1
                }
                if (j + 1 < grid[0].count && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = dayNum + 1
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1] = dayNum + 1
                }

            }
        }
    }

    for i in grid {
        if i.contains(1) {
            return -1
        }
    }

    return dayNum - 3
}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    groupMap.forEach {
        print($0)
    }
    print("=====")
}

var map = [[1, 2]]
print(orangesRotting(map))