//
//  main.swift
//  OneTwoThree
//
//  Created by Masahiro on 2019-04-10.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func OneTwoThree(_ n : Int) -> Int {
    if n < 4 {
        return n
    }

    var memo = Array<Int>(repeating: 0, count: n)
    memo[0] = 1  // 1
    memo[1] = 2  // 11 / 2
    memo[2] = 4  // 111 / 12 / 21 / 3
    //memo[3] = 7
    //memo[4] = 13 // 1 / 1112 / 2111 / 1211 / 1121 / 122 / 212 / 221 / 113 / 131 / 311 / 23 / 32 /

    for i in 3..<n {
        memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3]
    }

    print(memo)

    return memo[n - 1]
}

print(OneTwoThree(4))
print(OneTwoThree(7))
print(OneTwoThree(10))