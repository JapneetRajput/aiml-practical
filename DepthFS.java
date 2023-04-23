import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DepthFS {

    public static void dfs(Set<String> visited, Map<String, List<String>> graph, String node) {
        if (!visited.contains(node)) {
            System.out.println(node);
            visited.add(node);
            for (String neighbor : graph.get(node)) {
                dfs(visited, graph, neighbor);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("5", List.of("3", "7"));
        graph.put("3", List.of("2", "4"));
        graph.put("7", List.of("8"));
        graph.put("2", List.of());
        graph.put("4", List.of("8"));
        graph.put("8", List.of());

        Set<String> visited = new HashSet<>();

        System.out.println("Following is the Depth-First Search");
        dfs(visited, graph, "5");
    }
}