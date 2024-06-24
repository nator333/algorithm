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

func simpleBFS(_ farmMap: inout [[Int]], _ row: Int, _ col: Int, _ dayNum: inout Int, _ sizeAry: [Int]) {
    // down, up, right, left
    let dRow = [0, 0, 1, -1]
    let dCol = [1, -1, 0, 0]

    let first = Pair(row: row, col: col)
    // check directions
    for i in 0..<dRow.count {
        let forthRow = first.row + dRow[i]
        let forthCol = first.col + dCol[i]
        if (forthRow >= 0 && forthRow < sizeAry[1])
                   && (forthCol >= 0 && forthCol < sizeAry[0]) {
            if farmMap[forthRow][forthCol] != 0 {
                continue
            }

            farmMap[forthRow][forthCol] = dayNum + 1
        }
    }
}

func TomatoFarm() {
    // Make townMap
    var farmMap = [[Int]]()
    let sizeAry = readLine()!.split(separator: " ").map {
        Int(String($0))!
    }
    for _ in 0..<sizeAry[1] {
        farmMap.append(readLine()!.split(separator: " ").map {
            Int($0)!
        })
    }

    var dayNum = 0
    var notRiped = true
    while notRiped {
        dayNum += 1
        notRiped = false
        for row in 0..<sizeAry[1] {
            for col in 0..<sizeAry[0] {
                if farmMap[row][col] != dayNum {
                    continue
                }
                notRiped = true
                simpleBFS(&farmMap, row, col, &dayNum, sizeAry)
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

TomatoFarm()