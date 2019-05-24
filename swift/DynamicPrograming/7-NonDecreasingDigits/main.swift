//
//  main.swift
//  NonDecreasingDigits
//
//  Created by Masahiro on 2019-04-09.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func NonDecreasingDigits(_ digits: Int) -> Int {
    var map = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: 10), count: digits)
    for i in 0...9 {
        map[0][i] = 1
    }

    for j in 1..<digits {
        for i in 0...9 {
            for k in 0...i {
                map[j][i] += map[j - 1][k]
            }
        }
    }

    // d[L- 1] <= d[L]

    // d[N][L] = sum {d[N - 1][k]} // 0 <= K <= L
    printGroupMap(map)

    var sum = 0
    for i in 0...9 {
        sum += map[digits - 1][i]
    }

    return sum
}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    groupMap.forEach {
        print($0)
    }
    print("=====")
}

print(NonDecreasingDigits(1))
print(NonDecreasingDigits(2))
print(NonDecreasingDigits(3))

