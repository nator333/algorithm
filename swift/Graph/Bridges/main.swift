//
//  main.swift
//  Tomate Farm
//
//  Created by Masahiro on 2019-03-21.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

struct Queue<T> {
    var array = [T]()

    var count: Int {
        return array.count
    }

    var isEmpty: Bool {
        return array.isEmpty
    }

    var peek: T? {
        return array.first
    }

    mutating func enqueue(_ e: T) {
        array.append(e)
    }

    mutating func dequeue() -> T? {
        if isEmpty {
            return nil
        } else {
            return array.removeFirst()
        }
    }
}

struct Pair {
    let row: Int
    let col: Int
}

func simpleBFS(_ farmMap: inout [[Int]], _ row: Int, _ col: Int, _ dayNum: inout Int) {
    // down, up, right, left
    let dRow = [0, 0, 1, -1]
    let dCol = [1, -1, 0, 0]

    let first = Pair(row: row, col: col)
    // check directions
    for i in 0..<dRow.count {
        let forthRow = first.row + dRow[i]
        let forthCol = first.col + dCol[i]
        if (forthRow >= 0 && forthRow < farmMap.count)
                   && (forthCol >= 0 && forthCol < farmMap.count) {
            if farmMap[forthRow][forthCol] != 0 {
                continue
            }

            farmMap[forthRow][forthCol] = dayNum + 1
        }
    }
}

func Bridges() {
    // Make townMap
    var farmMap = [[Int]]()
    let size = Int(readLine()!)!

    for _ in 0..<size {
        farmMap.append(readLine()!.split(separator: " ").map {
            Int($0)!
        })
    }

    var dayNum = 0
    var notRiped = true
    while notRiped {
        dayNum += 1
        notRiped = false
        for row in 0..<size {
            for col in 0..<size {
                if farmMap[row][col] != dayNum {
                    continue
                }
                notRiped = true
                simpleBFS(&farmMap, row, col, &dayNum)
            }
        }
    }

    printGroupMap(farmMap)
    for rowAry in farmMap {
        if rowAry.contains(0) {
            dayNum = 1
            break
        }
    }
    print("day: \(dayNum - 2)")
}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    groupMap.forEach {
        print($0)
    }
    print("=====")
}

Bridges()