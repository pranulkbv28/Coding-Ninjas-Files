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

public class InserNodeInLinkedList {
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

    public static Node<Integer> getNode(Node<Integer> head, int pos) {
        int index = 0;
        Node<Integer> temp = head;
        while (temp != null && index < pos) {
            temp = temp.next;
            index++;
        }
        return temp;
    }

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        if (pos == 0) {
            Node<Integer> newNode = new Node<Integer>(data);
            newNode.next = head;

            return newNode;
        } else {
            Node<Integer> prevNode = getNode(head, pos - 1);
            if (prevNode != null) {
                Node<Integer> nextNode = prevNode.next;
                Node<Integer> newNode = new Node<Integer>(data);
                prevNode.next = newNode;
                newNode.next = nextNode;
            } else {
                return head;
            }
        }

        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        System.out.println("Enter the position of insertion and the data to be inserted:");
        int pos = sc.nextInt();
        int data = sc.nextInt();
        head = insert(head, pos, data);
        print(head);

        sc.close();
    }
}
