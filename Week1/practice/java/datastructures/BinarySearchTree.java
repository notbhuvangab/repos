package practice.java.datastructures;

public class BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	BinarySearchTree() {
		root = null;
	}

	BinarySearchTree(int data) {
		root = new Node(data);
	}

	public void insert(int data) {
		root = insertRecursive(root, data);
	}

	public Node insertRecursive(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data) {
			root.left = insertRecursive(root.left, data);
		} else {
			root.right = insertRecursive(root.right, data);
		}

		return root;
	}

	public void delete(int data) {
		root = deleteRecursive(root, data);
	}

	public Node deleteRecursive(Node root, int data) {
		if (root == null)
			return root;

		if (data < root.data) {
			root.left = deleteRecursive(root.left, data);
		} else if (data > root.data) {
			root.right = deleteRecursive(root.right, data);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			root.data = minValue(root.right).data;

			root.right = deleteRecursive(root.right, root.data);
		}
		return root;
	}

	public Node minValue(Node node) {
		Node temp = node;

		while (temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}
	
	public Node maxValue(Node node) {
		Node temp = node;

		while (temp.right != null) {
			temp = temp.right;
		}
		return temp;
	}

	void traversal(String val) {
		switch (val) {
		case "inorder":
			inOrderRecursive(root);
			break;
		case "preorder":
			preOrderRecursive(root);
			break;
		case "postorder":
			postOrderRecursive(root);
			break;
		default:
			System.out.println("Invalid travelsal chosen");
			break;
		}
	}

	void inOrderRecursive(Node root) {
		if (root != null) {
			inOrderRecursive(root.left);
			System.out.print(root.data + " ");
			inOrderRecursive(root.right);
		}
	}

	void preOrderRecursive(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			inOrderRecursive(root.left);
			inOrderRecursive(root.right);
		}
	}

	void postOrderRecursive(Node root) {
		if (root != null) {
			inOrderRecursive(root.left);
			inOrderRecursive(root.right);
			System.out.print(root.data + " ");
		}
	}

}
