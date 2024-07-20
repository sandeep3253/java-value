import java.util.*;

class binary{
   class Node{
      int data;
      Node next;
      
      Node( int data){
        this.data= data;
        this.next = null;
        }
       }
       Node head;
     public void add(int data){  
       Node NewNode = new Node();
      if(head == null){
          head =NewNode;
         }
      
        else{
           Node currentNode = head;
        while(currentNode.next != null){
          currentNode = currentNode.next;
           //NewNode.next = currentNode;
           }
           current.next =NewNode;
           }
          } 
        public void swappairs(){
           head = swappairs(head);
           }
           
          private Node swappairs(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node first = node;
        Node second = node.next;

        first.next = swapPairs(second.next);
        second.next = first;

        return second;
    }
          
           }
         public void print(){
         Node currentNode = head;
         while (currentNode!= null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
            }
            System.out.println();
            }
         public static void main (String args[]){
             binary list = new binary();
             list.add(34);
             list.add (435);
             list.add(66);
             list.print();
             list.swappairs();
             list.print();
             }
            
            
            
            
