//
//  main.swift
//  ClimbingStairs
//
//  Created by Masahiro on 2019-04-08.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation


func climbStairs(_ n: Int) -> Int {
    if (n <= 3) {
        return n
    }
    var ary = Array<Int>(repeating: 0, count: n)
    ary[0] = 1
    ary[1] = 2

    for i in 2..<n {
        ary[i] = ary[i - 1] + ary[i - 2]
    }

    return ary[n - 1]
}

print(climbStairs(10))