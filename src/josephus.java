import java.util.LinkedList;

public class josephus {
    public static void main(String[] args) {
       // System.out.println(jp(7,3));
        //System.out.print(jp(8,2));

        System.out.println(jpCircularLinkedList(8,2));
        System.out.println(jpCircularLinkedList(7,3));
    }
    static int jp(int n , int k)
    {
        if(n==1)
            return 1;
        return ((jp(n-1,k)+(k-1))%n)+1;
    }
    static int jpCircularLinkedList(int n,int k)
    {
        Node head=null;
        Node tail=null;
        for (int i = 1; i <=n ; i++) {
            Node nn= new Node(i);
            if(head==null) {
                head = nn;
                tail=nn;
            }
            else
            {
                tail.next=nn;
                tail=nn;
            }
        }
        tail.next=head;
        Node trav=head;
        Node prev=null;
        while(trav.next!=null)
        {
            for (int i = 1; i <=k-1 &&trav.next!=null; i++) {
                prev=trav;
                trav=trav.next;
            }
            Node t=trav.next;
            prev.next=trav.next;
            trav.next=null;
            trav=t;

        }
        return trav.data;
    }
    static class Node
    {
        int data;
        Node next;
        Node(int a)
        {data=a;
        next=null;}

    }
}
