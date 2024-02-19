package DataStructures.LinkedeList;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        // next = null;
    }
}

public class IncrementEveryElementInLL {
    
    public static void increment(Node<Integer> head){
        head.data++;
    }
    
    public static void main(String[] args) {
        
    }
}
