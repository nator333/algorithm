//
//  main.swift
//  Who's My Parent
//
//  Created by Masahiro on 2019-03-26.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

func whosMyParent() {
    let length = Int(readLine()!)!
    var tree = Array<Int>(repeating: 0, count: length + 1)
    tree[1] = -1
    for _ in 1..<length {
        let nodeInput = readLine()!.split(separator: " ").map {
            Int($0)!
        }
        if tree[nodeInput[0]] != 0 {
            tree[nodeInput[1]] = nodeInput[0]
        } else if tree[nodeInput[1]] != 0 {
            tree[nodeInput[0]] = nodeInput[1]
        }
    }

    for index in 2...length {
        print(tree[index])
    }

}

whosMyParent()



