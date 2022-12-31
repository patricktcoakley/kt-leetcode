package questions.medium

import graph.Node

fun cloneGraph(node: Node?, visited: HashMap<Node, Node> = hashMapOf()): Node? {
    if (node == null) {
        return null
    }
    
    if (node in visited) {
        return visited[node]
    }

    val clone = Node(node.`val`)
    visited[node] = clone

    for (neighbor in node.neighbors) {
        clone.neighbors.add(cloneGraph(neighbor, visited))
    }

    return clone
}

