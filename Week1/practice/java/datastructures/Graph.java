package practice.java.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.List;
import java.util.LinkedList;

public class Graph {

	int v;

	public int getVertices() {
		return v;
	}

	public List<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>(v + 1);

	public Graph() {
		for (int i = 0; i < v + 1; i++)
			adj.add(new ArrayList<Edge>());
	}

	public Graph(int vertices) {
		this.v = vertices+1;
		for (int i = 1; i < v+1; i++)
			adj.add(new ArrayList<Edge>());
	}

	public void addEdge(int vertex, int link, int weight) {
		adj.get(vertex).add(new Edge(link, weight));
		adj.get(link).add(new Edge(vertex, weight));
	}

	public void show() {
		for (int i = 1; i < v+1; i++) {
			System.out.println("The vertex " + (i) + " has edges to:");
			for (Edge idx : adj.get(i))
				System.out.print(idx.getVertex() + " ");

			System.out.println();
		}
	}

	public void method() {
		int idx = 0;

		while (idx < v) {
			System.out.println(adj.get(idx));
			idx++;
		}
	}

//	public void dfs(int index) {
//		Stack<Integer> stack = new Stack<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
//		boolean[] visited = new boolean[v];
//		Arrays.fill(visited, false);
//
//		list.add(index - 1);
//		visited[index - 1] = true;
//		for (int i : adj.get(index - 1)) {
//			stack.push(i);
//		}
//		System.out.print("Stack:");
//		System.out.println(stack);
//
//		while (list.size() < v) {
//			int temp = stack.pop();
//			list.add(temp);
//			visited[temp] = true;
//
//			for (int i : adj.get(temp)) {
//				if (visited[i] == false && stack.search(i) == -1) {
//					stack.push(i);
//				}
//			}
//			System.out.print("Stack:");
//			System.out.println(stack);
//		}
//		for (int i : list)
//			System.out.print(i + 1 + " -> ");
//	}
//
//	void bfs(int index) {
//
//		boolean visited[] = new boolean[v];
//
//		LinkedList<Integer> queue = new LinkedList<Integer>();
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		visited[index - 1] = true;
//		list.add(index - 1);
//		for (int i : adj.get(index - 1))
//			queue.add(i);
//
//		while (queue.size() != 0) {
//			index = queue.poll();
//			list.add(index);
//
//			Iterator<Integer> i = adj.get(index).listIterator();
//			while (i.hasNext()) {
//				int n = i.next();
//				if (!visited[n]) {
//					visited[n] = true;
//					queue.add(n);
//				}
//			}
//		}
//		System.out.println();
//		for (int i : list)
//			System.out.print((i + 1) + "->");
//	}

}