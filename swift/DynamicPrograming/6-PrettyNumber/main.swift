//
//  main.swift
//  PrettyNumber
//
//  Created by Masahiro on 2019-04-08.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func PrettyNumber(_ num: Int) -> Int {
    var memo = Array<Array<Int>>(repeating: Array<Int>(repeating: 0, count: 10), count: num)

    for i in 1...9 {
        memo[0][i] = 1
    }

    for i in 1..<num {
        for j in 0...9 {
            if j - 1 >= 0 {
                memo[i][j] += memo[i - 1][j - 1]
            }

            if j + 1 <= 9 {
                memo[i][j] += memo[i - 1][j + 1]
            }
        }
    }

    var answer = 0
    for i in 0...9 {
        answer += memo[num - 1][i]
    }

    printGroupMap(memo)

    return answer
}

func printGroupMap(_ groupMap: [[Int]]) {
    print("=====\ngroupMap:")
    groupMap.forEach {
        print($0)
    }
    print("=====")
}

print(PrettyNumber(1))
print(PrettyNumber(2))
print(PrettyNumber(3))
print(PrettyNumber(5))
print(PrettyNumber(10))

