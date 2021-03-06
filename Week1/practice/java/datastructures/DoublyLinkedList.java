package practice.java.datastructures;

import practice.java.datastructures.LinkedList.Node;

public class DoublyLinkedList {

	Node head = null, tail = null;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) {
			this.data = d;
			this.next = null;
			this.prev = null;
		}
	}

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("DLL is empty");
		}
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				if (temp.next == null) {
					temp.prev.next = null;
					return;
				}
				else if(temp.prev==null){
					head = temp.next;
					head.prev = null;
					temp.next=null;
					return;
				}
				else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					return;
				}
			}
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
					System.out.print(temp.data + " <-> ");
				temp = temp.next;
			}
		}
	}

}
