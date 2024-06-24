//
//  main.swift
//  SumOfSquare2
//
//  Created by Masahiro on 2019-04-10.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func SumOfSquare2(_ n: Int) -> Int {
    let N = n
    var memo = [Int](repeating: 0, count: N + 1)

    // Max
    for i in 1...N {
        memo[i] = i
        let sqrt = Int(Double(i).squareRoot())
        for j in stride(from: 1, through: sqrt, by: 1) {
            if memo[i] > memo[i - j * j] {
                // get min
                memo[i] = memo[i - j * j] + 1
            }
        }
    }

    print(memo)

    return memo[N]

}


print(SumOfSquare2(7))
print(SumOfSquare2(11))

