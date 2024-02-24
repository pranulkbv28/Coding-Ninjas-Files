package DataStructures.LinkedeList.RecursionLinkedList;

import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}

public class InsertUsingRecursion {
    public static Node<Integer> getLinkedList(Scanner sc){
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data!=-1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null) {
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

    public static Node<Integer> insertDataRecursive(Node<Integer> head, int data, int pos) {
        if(head == null && pos>0){
            return head;
        }
        
        if (pos == 0) {
            Node<Integer> newHead = new Node<Integer>(data);
            newHead.next = head;
            return newHead;
        } else {
            head.next = insertDataRecursive(head.next, data, pos-1);
            return head;
        }
    }

    public static void printLinkedList(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the LinkedList, to terminate input sequence, type -1: ");
        Node<Integer> head = getLinkedList(sc);
        System.out.println("Enter the new data and the position to be inputed at: ");
        int newData = sc.nextInt();
        int pos = sc.nextInt();
        head = insertDataRecursive(head, newData, pos);
        System.out.println("New Linked List is: ");
        printLinkedList(head);
        sc.close();
    }
}
