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

public class TakeInput {

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                // Node<Integer> tail = head;
                // while(tail.next != null){
                //     tail=tail.next;
                // }
                tail.next = currentNode;
                tail = currentNode;
            }

            data = sc.nextInt();
        }
        
        sc.close();

        return head;
    }


    public static void print(Node<Integer> head){
        // Node<Integer> temp = head;

        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Give the inputs for the LinkedList: ");
        
        Node<Integer> head = takeInput();
        print(head);
    }
}
