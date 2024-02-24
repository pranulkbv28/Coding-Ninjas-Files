package DataStructures.LinkedeList.RecursionLinkedList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

public class DeleteUsingRecursion {
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

    public static Node<Integer> toDelNode(Node<Integer> head, int pos) {
        if(head.next == null && pos>0){
            return head;
        }
        
        if (pos == 0) {
            return head.next;
        } else {
            head.next = toDelNode(head.next, pos-1);
            return head;
        }
    }

    public static void toPrint(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        toPrint(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        System.out.println("Position at which data should be deleted: ");
        int pos = sc.nextInt();
        head = toDelNode(head, pos);
        toPrint(head);

        sc.close();
    }
}
