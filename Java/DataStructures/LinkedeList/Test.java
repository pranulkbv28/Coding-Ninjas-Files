package DataStructures.LinkedeList;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class Test {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        Node<Integer> temp = head;
        Node<Integer> tail = null;
        while(temp.next!=null) {
            tail = temp.next;
            temp = temp.next;
        }
        System.out.println(tail.data+" "+head.data);

        sc.close();
    }
}
