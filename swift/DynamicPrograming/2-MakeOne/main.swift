//
//  main.swift
//  MakeOne
//

ns-272.awsdns-34.com.
ns-1191.awsdns-20.org.
ns-970.awsdns-57.net.
ns-1880.awsdns-43.co.uk.
//  Created by Masahiro on 2019-04-08.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func MakeOne(_ num: Int) -> Int {
    if num == 1 {
        return 0
    } else if num <= 3 {
        return 1
    }

    var memo = [Int](repeating: 0, count: num)
    memo[0] = 0
    memo[1] = 1
    memo[2] = 1

    for i in 3..<num {
        memo[i] = memo[i - 1] + 1
        if i % 2 == 0 && memo[i] > memo[i / 2] + 1 {
            memo[i] = memo[i / 2] + 1
        }
        if i % 3 == 0 && memo[i] > memo[i / 3] + 1 {
            memo[i] = memo[i / 3] + 1
        }
    }

    print(memo)
    return memo[num - 1]
}

print("Step of 10 is \(MakeOne(10))")

