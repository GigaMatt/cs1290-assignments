/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 2.3
 * @author Matthew S Montoya
 * 
 */
public class Chapter2Problem3 {
	public static void main(String[] args) {
		/*Implement an algorithm to delete the a node in the middle of a singly linked list, given only access to the first node
		 */
		Node head = null;
		boolean canBeDeleted = deleteNode(head);
		if(canBeDeleted)
			System.out.println("Deletion sucessful");
		else
			System.out.println("Deletion failed.");	
	}	
	
	/*INITIAL QUESTIONS && Assumptions
	 * 
	 */

	private static boolean deleteNode(Node node) {
		if(node==null || node.next==null)
			return false;
		node.data=node.next.data;
		node.next=node.next.next;
		return true;
	}
}