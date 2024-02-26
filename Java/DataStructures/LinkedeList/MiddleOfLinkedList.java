package DataStructures.LinkedeList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

public class MiddleOfLinkedList {

    public static Node<Integer> takeInput(Scanner sc) {
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }

            data = sc.nextInt();
        }

        return head;
    }

    public static Node<Integer> middleNode(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            Node<Integer> slowNode = head;
            Node<Integer> fastNode = head;
            while (fastNode.next != null && fastNode.next.next != null) {
                slowNode = slowNode.next;
                fastNode = fastNode.next.next;
            }

            return slowNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        Node<Integer> middleNodeVal = middleNode(head);
        System.out.println(middleNodeVal.data);
        sc.close();
    }
}
