//
//  main.swift
//  IsBipartite
//
//  Created by Masahiro on 2019-04-12.
//  Copyright © 2019 nator333. All rights reserved.
//

import Foundation

class Solution {
    func dfs(start: Int, color: Int, check: inout [Int], adjList: [[Int]], _ notBipartite: inout Bool) {
        check[start] = color
        for next in adjList[start] {
            if check[next] == 0 {
                dfs(start: next, color: 3 - color, check: &check, adjList: adjList, &notBipartite)
            } else if check[next] != 3 - color {
                notBipartite = true
            }
        }
    }

    func isBipartite(_ graph: [[Int]]) -> Bool {
        var notBipartite = false
        var check: [Int] = Array<Int>(repeating: 0, count: graph.count)
        for v in 0..<graph.count {
            if notBipartite {
                return false
            }
            if check[v] == 0 {
                dfs(start: v, color: 1, check: &check, adjList: graph, &notBipartite)
            }
        }

        return !notBipartite
    }
}


var ary = [[1,3], [0,2], [1,3], [0,2]]
//var ary = [[1,2,3],[0,2],[0,1,3],[0,2]]
print(Solution().isBipartite(ary))
