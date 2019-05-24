//
//  main.swift
//  RemoteController
//
//  Created by Masahiro on 2019-03-15.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func remoteController() {
    var input = getInput("Input first line:")
    if Int(input) == .none {
        return
    }
    let firstInt = Int(input)!

    input = getInput("Input second line:")
    if Int(input) == .none {
        return
    }
    let secondInt = Int(input)!

    input = getInput("Input third line:")
    let thirdIntAry = input.split(separator: " ").map {
        Int($0)!
    }
    if secondInt != thirdIntAry.count {
        print("Wrong number input!")
        return
    }

    if 100 == firstInt {
        print(0)
        return
    }

    // Steps when only using +- button
    let maxStep = abs(Int32(100 - firstInt))

    // 1. Try to use direct number button
    // make brute force ary and get distance.
    // try to get minimum distance num.
    var storeAry = [Int]()
    for item in 1...firstInt.description.count {
        chooseAndStorePatterns(thirdIntAry, item, &storeAry, firstInt)
    }

    let minDistance = combiedNumMap.keys.sorted().min()!

    let minDistanceChannel = combiedNumMap[minDistance]![0]
    let step = minDistanceChannel.description.count
    if minDistanceChannel == firstInt {
        print(step)
        return
    }

    if step > maxStep {
        print(maxStep)
        return
    }

    // 2. Try to use plus minus button
    let resalStep = step + Int(abs(Int32(minDistanceChannel - firstInt)))
    if maxStep < resalStep {
        print(maxStep)
    } else {
        print(resalStep)
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

func chooseAndStorePatterns(_ sss: [Int], _ diceNum: Int, _ storeAry: inout [Int], _ desiredNum: Int) {
    if diceNum == 0 {
        let combinedInt = Int(storeAry.map {$0.description}.joined())!
        let absVal = Int(abs(Int32(desiredNum - combinedInt)))
        if let _ = combiedNumMap[absVal] {
            combiedNumMap[absVal]!.append(combinedInt)
        } else {
            combiedNumMap[absVal] = [combinedInt]
        }
    } else {
        for item: Int in 0...9 {
            if sss.contains(item) {
                continue
            }
            storeAry.append(item)
            chooseAndStorePatterns(sss, diceNum - 1, &storeAry, desiredNum)
            storeAry.removeLast()
        }
    }
}

var combiedNumMap = [Int: [Int]]()
remoteController()

