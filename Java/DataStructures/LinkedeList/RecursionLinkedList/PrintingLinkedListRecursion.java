package DataStructures.LinkedeList.RecursionLinkedList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class PrintingLinkedListRecursion {
    public static Node<Integer> getLinkList(Scanner sc) {
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

    // public static void fun(Node<Integer> head) {
    //     if (head == null)
    //         return;

    //     fun(head.next);
    //     System.out.print(head.data);
    // }

    public static void printLinkedList(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }

    public static void printReverseLinkedList(Node<Integer> head) {
        if (head == null) {
            return;
        }
        printReverseLinkedList(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the LinkedList, to terminate input sequence, type -1: ");
        Node<Integer> head = getLinkList(sc);
        printLinkedList(head);
        System.out.println();
        printReverseLinkedList(head);
        System.out.println();
        // fun(head);
        sc.close();
    }
}
