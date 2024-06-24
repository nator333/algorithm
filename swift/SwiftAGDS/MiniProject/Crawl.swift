//
// Created by Masahiro on 2019-03-13.
// Copyright (c) 2019 nator333. All rights reserved.
//

import Foundation

class Crawl: NSObject {
    static let fm = FileManager.default

    static func execute() {
        printDirectoryContents(fm.currentDirectoryPath, 0)
    }

    static func printDirectoryContents(_ path: String, _ depth: Int) {
        do {
            let fileNameAry = try fm.contentsOfDirectory(atPath: path)
            for (index, fileName) in fileNameAry.enumerated() {
                let fullPath = "\(path)/\(fileName)"
                print("\(getDepthStr(depth, index == fileNameAry.count - 1))\(fileName)")
                if isDir(fullPath) {
                    printDirectoryContents(fullPath, depth + 1)
                }
            }
        } catch {
            print("Error!")
        }

    }

    static func isDir(_ fullPath: String) -> Bool{
        var isDir = ObjCBool.init(booleanLiteral: false)
        fm.fileExists(atPath: fullPath, isDirectory: &isDir)
        return isDir.boolValue
    }

    static func getDepthStr(_ depth : Int, _ isLastFile: Bool) -> String{
        var result : String = ""
        for _ in 0..<depth {
            result += "│    "
        }
        return result + (isLastFile ? "└─ ": "├─ ")
    }
}
