//
//  BackTracking.swift
//  BackTracking
//
//  Created by Masahiro on 2019-03-14.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

/*struct Modifier {
    open var a = 10
    public var b = 10
    internal var c = 10
    fileprivate var d = 10
    private var e  = 10
}*/

var count = 0

class BackTracking: NSObject {
    static func execute() {
        print("Hello, World!")
        var storeAry = [Int]()
        rollDice(3, &storeAry)
        print(count)
        count = 0
        storeAry = [Int]()
        rollDice(7, &storeAry, 7)
        print(count)
    }

    static func rollDice(_ diceNum: Int, _ storeAry: inout [Int]) {
        count += 1
        if diceNum == 0 {
            print(storeAry)
        } else {
            for item in 1...6 {
                storeAry.append(item)
                rollDice(diceNum - 1, &storeAry)
                storeAry.removeLast()
            }
        }
    }

    static func rollDice(_ diceNum: Int, _ storeAry: inout [Int], _ desiredSum: Int, _ soFar: Int = 0) {
        count += 1
        if diceNum == 0 {
            if (storeAry.reduce(0) {
                $0 + $1
            } == desiredSum) {
                print(storeAry)
            }
        } else {
            for item in 1...6 {
                if soFar + item + 1 * (diceNum - 1) >= desiredSum
                           || soFar + item + 6 * (diceNum - 1) <= desiredSum {
                    continue
                }
                storeAry.append(item)
                rollDice(diceNum - 1, &storeAry, desiredSum)
                storeAry.removeLast()
            }
        }
    }
}