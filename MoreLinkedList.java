package day24_morelinkedlists;
// https://www.hackerrank.com/challenges/30-linked-list-deletion

import java.util.*;

class Node{
	int data;
	Node next;
	Node (int d){
		data = d;
		next = null;
	}
}

public class MoreLinkedList {

	public static Node removeDuplicates(Node head) {
		// Code here
		if (head == null) {
			return null;
		} else if (head.next == null) {
			return head;
		} else {
			Node node = head;
			while (node.next != null) {
				if (node.data == node.next.data) {
					// Remove duplicate (= Reset next) 
					node.next = node.next.next;	
				} else {
				// Move index
				node = node.next;
				}
			}
		}		
		return head;
	}
	
	public static Node insert(Node head, int data) {
		Node p = new Node (data);
		if (head == null) {
			head = p;
		} else if (head.next == null) {
			head.next = p;
		} else {
			Node start = head;
			while (start.next != null) {
				start = start.next;
			}
			start.next = p;
		}
		return head;
	}
	
	public static void display(Node head) {
		Node start = head;
		while (start.next != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node head = null;
		int T = in.nextInt();
		while (T-- > 0) {
			int element = in.nextInt();
			head = insert(head, element);
		}
		head = removeDuplicates(head);
		display(head);
	}
}
