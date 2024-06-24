//
//  main.swift
//  Lotto
//
//  Created by Masahiro on 2019-03-15.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func combinationListRecursive(_ data: [Int], _ r: Int) {
    if r != 0 && r <= data.count {
        var result = [[Int]]()
        d_combinationListRecursive(data, r, 0, [Int](), &result)
        result.sort {
            for item in 0..<$0.count {
                if $0[item] < $1[item] {
                    return true
                } else if $0[item] == $1[item] {
                    continue
                } else {
                    return false
                }

            }
            return true
        }
        result.forEach {
            print($0)
        }
    }
}

func d_combinationListRecursive(_ data: [Int], _ r: Int, _ start: Int, _ progress: [Int], _ result: inout [[Int]]) {
    if r == 0 {
        result.append(progress.sorted())
        return
    }

    for i in start..<data.count {
        var mutableProgress = Array(progress)
        mutableProgress.append(data[i])
        d_combinationListRecursive(data, r - 1, i + 1, mutableProgress, &result)
    }
}

func lotto() {
    var inputAry = [[Int]]()

    while true {
        let input = getInput("Input nums:")
        if let num = Int(input), num == 0 {
            break
        }


        let intAry: [Int] = Array(Set(input.split(separator: " ").map {
            Int($0)!
        }))
        if intAry.count < 6 {
            print("Must choose different 6 numbers!")
            return
        }
        inputAry.append(intAry)

    }

    inputAry.forEach {
        combinationListRecursive($0, 6)
        print("")
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

lotto()

/*
// Python
def combinationListRecursive(data, r):
if r == 0 or r > len(data):
return []

result = []
_combinationListRecursive(data, r, 0, [], result)
return result


def _combinationListRecursive(data, r, start, progress, result):
if r == 0:
result.append(progress)
return

for i in range(start, len(data)):
_combinationListRecursive(data, r - 1, i + 1, progress + [data[i]], result)
*/
