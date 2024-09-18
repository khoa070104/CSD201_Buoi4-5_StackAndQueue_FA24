package Queue;

import Stack.MyStack;

public class MyQueue {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;
    private int length;

    public MyQueue(){
        front = null;
        rear = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        // TH1 : Queue Null => front noi node dau tien
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
          rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public Integer dequeue(){ //9 8 7 6
        if(isEmpty()){
            //throw new RuntimeException("Stack is empty");
            return null;
        }
        int result = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        return result;
    }
    // dequeue(): remove front element and return data of removed element
// BTVN 1: 2 , 19 -> LeetCode
// BTVN 2: Implement Stack and Queue
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();
         queue.dequeue();
        queue.dequeue();
        int res = queue.dequeue();
        System.out.println(res);
    }

}
