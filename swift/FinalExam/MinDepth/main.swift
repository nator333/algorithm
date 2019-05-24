//
//  main.swift
//  MinDepth
//
//  Created by Masahiro on 2019-04-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public var val: Int
 *     public var left: TreeNode?
 *     public var right: TreeNode?
 *     public init(_ val: Int) {
 *         self.val = val
 *         self.left = nil
 *         self.right = nil
 *     }
 * }
 */

class TreeNode {
    var val: Int
    var left: TreeNode?
    var right: TreeNode?

    init(_ val: Int) {
        self.val = val
        self.left = nil
        self.right = nil
    }
}


class Solution {

    func dfs(_ root: TreeNode, _ depth: Int, _ depthSet: inout Set<Int>) {
        if root.left == nil && root.right == nil {
            depthSet.insert(depth)
            return
        }
        if let left = root.left {
            dfs(left, depth + 1, &depthSet)
        }

        if let right = root.right {
            dfs(right, depth + 1, &depthSet)
        }
    }

    func minDepth(_ root: TreeNode?) -> Int {
        guard let root = root else {
            return 0
        }
        if root.left == nil && root.right == nil {
            return 1
        }

        var depthSet = Set<Int>()

        dfs(root, 1, &depthSet)


        return depthSet.min()!
    }
}


/*func createNode(_ input : [[Int]?]) -> TreeNode {

}*/

var main = TreeNode(0)
main.left = TreeNode(1)
main.right = TreeNode(20)
//main.left!.left = TreeNode(15)
main.left!.right = TreeNode(7)
//main.right!.left = TreeNode(15)
main.right!.right = TreeNode(7)

print(Solution().minDepth(main))
