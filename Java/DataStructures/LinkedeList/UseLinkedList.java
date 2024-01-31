package DataStructures.LinkedeList;


class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data  = data;
    }
}

public class UseLinkedList {
    public static void print(Node<Integer> head){
        // Node<Integer> temp = head;

        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node2.next = node1;
        print(node2);
    }
}