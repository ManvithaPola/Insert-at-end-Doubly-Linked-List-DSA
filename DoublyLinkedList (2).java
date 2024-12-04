import java.util.*;
public class DoublyLinkedList
{
    Node head;
    class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            prev=null;
            next=null;
        }
    }
    public void dllcreation(int num) 
    {
        Node newNode = new Node(num);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insert_At_End(int num)
    {
        Node newNode=new Node(num);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    public void display() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("Enter the items to insert:");
        while (true) 
        {
            int num = s.nextInt();
            if (num == -1) 
            {
                break;
            }
            dll.dllcreation(num); 
        }
        System.out.println("Enter the item to insert at end:");
        int n=s.nextInt();
        dll.insert_At_End(n);
        dll.display();
    }
}