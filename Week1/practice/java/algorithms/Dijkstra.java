package practice.java.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import practice.java.datastructures.Edge;
import practice.java.datastructures.Graph;

public class Dijkstra {

	private static void getRoute(int[] prev,int i,List<Integer> route) {
		if(i>=1) {
			getRoute(prev,prev[i],route);
			route.add(i);
		}
	}
	public static void dijkstra(Graph g, int s) {

		int[] distance = new int[g.getVertices() + 1];
		boolean[] visited = new boolean[g.getVertices() + 1];
		int prev[] = new int[g.getVertices() + 1];
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[s] = 0;
		prev[s] = -1;
		visited[s] = true;
		

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.comparingInt(dis -> distance[s]));

		pq.add(s);

		while (!pq.isEmpty()) {
			int temp = pq.poll();

			for (Edge e : g.adj.get(temp)) {

				int v = e.getVertex();
				int w = e.getWeight();
				if (!visited[v]) {
					distance[v] = Math.min(distance[v], distance[temp] + w);
					prev[v] = temp;
					pq.add(v);
				}
			}
			visited[temp] = true;
		}

		List<Integer> route = new ArrayList<>();

		for (int i = 1; i < g.getVertices()+1; i++) {
			if (i != s && distance[i] != Integer.MAX_VALUE) {
				getRoute(prev, i, route);
				System.out.printf("Path (%d —> %d): Minimum cost = %d, Route = %s\n", s, i, distance[i], route);
				route.clear();
			}
		}
	}
}
