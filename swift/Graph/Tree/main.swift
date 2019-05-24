//
//  main.swift
//  Tree
//
//  Created by Masahiro on 2019-03-22.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

struct Node {
    let parent: String
    let leftOpt: String!
    let rightOpt: String!

    func isSame(_ char: String) -> Bool {
        return parent == char
    }

}

func getChild(_ ary: [Node], _ char: String) -> Node! {
    return ary.first(where: { (node: Node) -> Bool in return node.isSame(char) })
}

extension Character {
    var isAscii: Bool {
        return unicodeScalars.allSatisfy {
            $0.isASCII
        }
    }
    var ascii: UInt32? {
        return isAscii ? unicodeScalars.first?.value : nil
    }

    var convertToInt: Int! {
        if !self.isAscii {
            return nil
        }

        if Int(self.ascii!.description)! < 65 {
            return nil
        } else {
            return Int(self.ascii!.description)! - 64
        }
    }
}

func convertIntToString(_ num: Int) -> String {
    return String(UnicodeScalar(UInt8(num + 64)))
}

func getAryTree() -> [Int] {
    let size = Int(readLine()!)!
    var treeAry = Array<Int>(repeating: -1, count: 50)
    treeAry[0] = 0
    treeAry[1] = 0
    for _ in 0..<size {
        let inputAry = readLine()!.split(separator: " ").map {
            String($0)
        }
        let parent = Character(inputAry[0]).convertToInt!

        if let left = Character(inputAry[1]).convertToInt {
            treeAry[left] = parent
        }

        if let right = Character(inputAry[2]).convertToInt {
            treeAry[right] = parent
        }
    }

    print(treeAry)

    return treeAry
}

func getNodeAryTree() -> [Node] {
    let size = Int(readLine()!)!
    var treeAry = [Node]()
    for _ in 0..<size {
        let inputAry = readLine()!.split(separator: " ").map {
            String($0)
        }
        treeAry.append(Node(parent: inputAry[0],
                leftOpt: inputAry[1] == "." ? nil : inputAry[1],
                rightOpt: inputAry[2] == "." ? nil : inputAry[2]))
    }

    treeAry.forEach {
        print($0)
    }

    return treeAry
}

func preOrderNode(_ treeAry: [Node], _ start: Node) {
    print(start.parent, terminator: "")

    if let left = start.leftOpt,
       let leftChild = getChild(treeAry, left) {
        preOrderNode(treeAry, leftChild)
    }

    if let right = start.rightOpt,
       let rightChild = getChild(treeAry, right) {
        preOrderNode(treeAry, rightChild)
    }
}

func inOrderNode(_ treeAry: [Node], _ start: Node) {
    if let left = start.leftOpt,
       let leftChild = getChild(treeAry, left) {
        inOrderNode(treeAry, leftChild)
    }

    print(start.parent, terminator: "")

    if let right = start.rightOpt,
       let rightChild = getChild(treeAry, right) {
        inOrderNode(treeAry, rightChild)
    }
}

func postOrderNode(_ treeAry: [Node], _ start: Node) {
    if let left = start.leftOpt,
       let leftChild = getChild(treeAry, left) {
        postOrderNode(treeAry, leftChild)
    }

    if let right = start.rightOpt,
       let rightChild = getChild(treeAry, right) {
        postOrderNode(treeAry, rightChild)
    }

    print(start.parent, terminator: "")
}

// =====================================================

func preOrderInt(_ treeAry: [Int], _ start: Int) {
    if treeAry[start] == -1 {
        return
    }

    print(convertIntToString(treeAry[start]), terminator: "")
    preOrderInt(treeAry, start * 2)
    preOrderInt(treeAry, start * 2 + 1)
}

func inOrderInt(_ treeAry: [Int], _ start: Int) {
    if treeAry[start] == -1 {
        return
    }

    preOrderInt(treeAry, start * 2)
    print(convertIntToString(treeAry[start]), terminator: "")
    preOrderInt(treeAry, start * 2 + 1)
}

func postOrderInt(_ treeAry: [Int], _ start: Int) {
    if treeAry[start] == -1 {
        return
    }

    preOrderInt(treeAry, start * 2)
    preOrderInt(treeAry, start * 2 + 1)
    print(convertIntToString(treeAry[start]), terminator: "")
}


func TreeByNodeAry() {
    let treeAry = getNodeAryTree()
    preOrderNode(treeAry, treeAry[0])
    print("")

    inOrderNode(treeAry, treeAry[0])
    print("")

    postOrderNode(treeAry, treeAry[0])
    print("")

}

func TreeByIntAry() {
    let treeAry = getAryTree()
    preOrderInt(treeAry, 1)
    print("")

    inOrderInt(treeAry, 1)
    print("")

    postOrderInt(treeAry, 1)
    print("")

}

//7
//A B C
//B D .
//C E F
//E . .
//F . G
//D . .
//G . .

//       A
//    B     C
//   D .   E  F
//  . .   . . . G

//ABDCEFG
//DBAECFG
//DBEGFCA


//Tree()

TreeByIntAry()