package practice.java.datastructures;

public class MainRunner {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.addNode(5);
		ll.addNode(10);
		ll.addNode(15);
		ll.addNode(20);
		ll.addNode(25);

		ll.displayList();
		System.out.println();
		ll.delete(11);
		ll.displayList();

		System.out.println();

		DoublyLinkedList dll = new DoublyLinkedList();

		dll.addNode(5);
		dll.addNode(10);
		dll.addNode(15);
		dll.addNode(20);
		dll.addNode(25);

		dll.displayList();
		System.out.println();
		dll.delete(17);
		dll.displayList();

		System.out.println();
		BinarySearchTree bt = new BinarySearchTree();

		bt.insert(8);
		bt.insert(3);
		bt.insert(10);
		bt.insert(1);
		bt.insert(6);
		bt.insert(14);
		bt.insert(4);
		bt.insert(7);
		bt.insert(13);

		bt.traversal("inorder");

		bt.delete(10);
		System.out.println();
		bt.traversal("preorder");

		
	}

}