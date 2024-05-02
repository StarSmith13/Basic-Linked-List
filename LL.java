public class LinkedList{
    private Node head;

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void Display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
        }
        System.out.println();
    }
    public static main(String args[]){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(7);
        System.out.println("LinkedList elements");
        list.Display();

    }

}