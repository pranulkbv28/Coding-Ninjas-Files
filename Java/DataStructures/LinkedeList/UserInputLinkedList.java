package DataStructures.LinkedeList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null; // You can omit this line as it is not necessary
    }
}

public class UserInputLinkedList {

    public static void print(Node<Integer> head){
        // Node<Integer> temp = head;

        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static Node<Integer> getLL(int n) {
        Scanner sc = new Scanner(System.in);

        Node<Integer> head = null; // Initialize head as null

        for (int i = 0; i < n; i++) {
            Node<Integer> temp = new Node<Integer>(sc.nextInt()); // Create a new node with user input

            if (head == null) {
                // If the list is empty, set the new node as the head
                head = temp;
            } else {
                // Otherwise, traverse the list and append the new node at the end
                Node<Integer> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = temp;
            }

        }

        sc.close();

        return head; // Return the head of the linked list
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the linked list:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node<Integer> head = getLL(n);

        print(head);

        // You can now use the 'head' variable to perform operations on the linked list

        sc.close();
    }
}

