package pekan9_2511533012;
import java.util.*;

public class GraphTraversal_2511533012 {
    private Map<String, List<String>> graph_3012 = new HashMap<>();
    
    public void addEdge_2511533012(String node1_3012, String node2_3012) {
        graph_3012.putIfAbsent(node1_3012, new ArrayList<>());
        graph_3012.putIfAbsent(node2_3012, new ArrayList<>());
        graph_3012.get(node1_3012).add(node2_3012);
        graph_3012.get(node2_3012).add(node1_3012);
    }
    public void printGraph_2511533012() {
        System.out.println("Graf awal (adjacency list): ");
        for (String node_3012 : graph_3012.keySet()) {
            System.out.print(node_3012 + " -> ");
            List<String> neighbors_3012 = graph_3012.get(node_3012);
            System.out.println(String.join(", ", neighbors_3012));
        }
        System.out.println();
    }
    public void dfs_2511533012(String start_3012) {
        Set<String> visited_3012 = new HashSet<>();
        System.out.println("Penelusuran DFS: ");
        dfsHelper_2511533012(start_3012, visited_3012);
        System.out.println();
    }
    private  void dfsHelper_2511533012(String current_3012, Set<String> visited_3012) {
        if (visited_3012.contains(current_3012))
            return;
        visited_3012.add(current_3012);
        System.out.print(current_3012 + " ");
        for (String neighbor_3012 : graph_3012.getOrDefault(current_3012, new ArrayList<>())) {
            dfsHelper_2511533012(neighbor_3012, visited_3012);
        }
    }
    public void bfs_2511533012(String start_3012) {
        Set<String> visited_3012 = new HashSet<>();
        Queue<String> queue_3012 = new LinkedList<>();
        queue_3012.add(start_3012);
        visited_3012.add(start_3012);
        System.out.println("Penelusuran BFS: ");
        while (!queue_3012.isEmpty()) {
            String current_3012 = queue_3012.poll();
            System.out.print(current_3012 + " ");
            for (String neighbor_3012 : graph_3012.getOrDefault(current_3012, new ArrayList<>())) {
                if (!visited_3012.contains(neighbor_3012)) {
                    queue_3012.add(neighbor_3012);
                    visited_3012.add(neighbor_3012);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        GraphTraversal_2511533012 graph_3012 = new GraphTraversal_2511533012();

        graph_3012.addEdge_2511533012("A", "B");
        graph_3012.addEdge_2511533012("A", "C");
        graph_3012.addEdge_2511533012("B", "D");
        graph_3012.addEdge_2511533012("B", "E");

        System.out.println("Graf awal adalah: ");
        graph_3012.printGraph_2511533012();

        graph_3012.dfs_2511533012("A");
        graph_3012.bfs_2511533012("A");
    }
}

