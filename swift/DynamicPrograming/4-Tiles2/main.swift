//
//  main.swift
//  Tiles2
//
//  Created by Masahiro on 2019-04-09.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func Tiles2(_ n: Int) -> Int {
    if n < 4 {
        return n
    }
    var memo = [Int](repeating: 0, count: n)
    memo[0] = 1
    memo[1] = 3
    memo[2] = 5

    // [1, 2, 3, 5, 8, 13, 21, 34, 55]
    // 4 | 1,1,1,1 / 1, 2, 2, 1 / 2, 2, 1, 1/ 1,1, 2,2 /
    // 4 | ------- / 1, 4, 1 / 4, 1, 1/ 1,1, 4 /
    // 4 | 4,4 / 2, 2, 4 / 4, 2, 2

    // 1. Define sub problem (how to end)
    // 2. Options (guessing)
    // 3. Recurrence


    for i in 3..<n {
        //
        //memo[i] = memo[i - 1] + memo[i - 2]
        memo[i] = memo[i - 1] + 2 * (memo[i - 2])
    }

    return memo[n - 1]
}

print(Tiles2(2))
print(Tiles2(8))
print(Tiles2(12))



