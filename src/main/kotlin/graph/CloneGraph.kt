package graph

fun cloneGraph(node: GraphNode?, visited: HashMap<GraphNode, GraphNode> = hashMapOf()): GraphNode? {
    if (node == null) {
        return null
    }

    if (node in visited) {
        return visited[node]
    }

    val clone = GraphNode(node.`val`)
    visited[node] = clone

    for (neighbor in node.neighbors) {
        clone.neighbors.add(cloneGraph(neighbor, visited))
    }

    return clone
}
