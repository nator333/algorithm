//
//  main.swift
//  Tiles
//
//  Created by Masahiro on 2019-04-09.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func Tiles(_ n: Int) -> Int {
    if n < 4 {
        return n
    }
    var memo = [Int](repeating: 0, count: n)
    memo[0] = 1
    memo[1] = 2
    memo[2] = 3
    
    for i in 3..<n {
        memo[i] = memo[i - 1] + memo[i - 2]
    }
    
    print(memo)

    return memo[n - 1]
}

print(Tiles(9))

