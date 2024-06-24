//
//  main.swift
//  Repeating Sequence
//
//  Created by Masahiro on 2019-03-20.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func getIntAry(_ prompt: String) -> [Int] {
    return getInput(prompt).split(separator: " ").map {
        Int($0)!
    }
}

func getInput(_ prompt: String) -> String {
    print(prompt)
    var input: String = readLine()!
    while input.isEmpty {
        print("Input something:")
        input = readLine()!
    }
    return input
}

func getPowerOfNum(_ num: Int, _ power: Int) -> Int {
    if power == 1 {
        return num
    }
    return num * getPowerOfNum(num, power - 1)
}

func solveRecursively(_ base: Int, _ power: Int, _ sum: inout Int) -> Int {
    if base == 0 {
        return sum
    }

    sum += getPowerOfNum(base % 10, power)
    return solveRecursively(base / 10, power, &sum)
}

let intAry = getIntAry("Input 2 nums")
if intAry.count < 2 {
    print("Invalid input")
    exit(1)
}

let base = intAry[0]
let power = intAry[1]

var varBase = base
var answerAry = [Int]()
while true {
    var sum = 0
    let answer = solveRecursively(varBase, power, &sum)
    if answerAry.contains(answer) {
        answerAry.append(answer)
        break
    } else {
        answerAry.append(answer)
        varBase = answer
    }
}

print("Answer: \(answerAry.firstIndex(of: answerAry.last!)! + 1)")


