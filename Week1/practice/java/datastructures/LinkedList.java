package practice.java.datastructures;

import practice.java.datastructures.DoublyLinkedList.Node;

public class LinkedList {

	Node head = null, tail = null;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("LL is empty");
			return;
		}
		if (head.data == data && head.next!=null) {
			head = head.next;
			return;
		}
		Node temp = head, prev = head;
		while (temp != null) {
			if (temp.data == data) {
				if (temp.next == tail && tail.data == data) {
					temp.next = null;
					tail = temp;
					return;
				} else {
					prev.next = temp.next;
					return;
				}
			}
			prev = temp;
			temp = temp.next;
		}
		System.out.println("Key not found");
	}

	public void displayList() {
		Node temp = head;

		if (temp == null) {
			System.out.println("List is Empty!");
		} else {
			while (temp != null) {
				if (temp.next == null)
					System.out.print(temp.data);
				else
					System.out.print(temp.data + " -> ");
				temp = temp.next;
			}

		}
	}

}
