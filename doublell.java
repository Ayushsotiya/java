class Node {

    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class doublell {
    // it make ll
    public static Node makeLL(int a[]) {
        Node head = new Node(a[0]);
        Node prevNode = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null, prevNode);
            prevNode.next = temp;
            prevNode = temp;
        }
        return head;
    }
    // it print ll
    public static void printLL(Node head) {
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
        System.out.println("\n");
    }
    // delete the head
    public static Node deleteNodeFromFront(Node head){
        if(head==null||(head.next==null&& head.prev==null)){
            return null;
        }
        Node prev =head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }
    // delete from the tail
    public static Node deletetaiL(Node head){
        Node mover = head;
        while(mover.next!=null){
            mover = mover.next;
        }
        mover.prev.next =null;
        mover.prev = null;
        return head;
    }
    // deleting at positon
    public static Node deleteAtposition(Node head,int k){
        if(head==null){
            return null;
        }
        if((head.next==null&& head.prev==null)){
            if(k==1){
                return null;
            }
            else return head;
        }
        if(k==1){
            Node prev =head;
            head = head.next;
            head.prev = null;
            prev.next = null;
            return head;
        }
        Node temp = head;
        int cnt = 0;
        while (temp!=null) {
          cnt++;
          if(cnt==k) break;
          temp = temp.next;
        }
        if(temp.prev == null){
            return deleteNodeFromFront(head);
        }
        else if(temp.next == null){
            temp.prev.next = null;
            temp.prev = null;
        }
        else{
        temp.prev.next = temp.next;
        temp.next.prev =temp.prev;
        temp.next =null;
        temp.prev = null;
        }
        return head;
    }
    // inserting at start
    public static Node insertAtstart(Node head,int n){
        if(head==null ){
            Node newNode = new Node(n);
            return head;
        }
        if(head.next==null && head.prev==null){
            Node newNode = new Node(n);
            head.prev =newNode;
            newNode.next = head;
            return newNode;
        }
        Node newNode = new Node(n);
         head.prev = newNode;
         newNode.next =head;
        return newNode;
    }
    // inserting at the end
    public static Node insertAtend(Node head,int n){
        if(head == null){
            Node newNode = new Node(n);
            return newNode;
        }
        Node mover =head;
        while (mover.next!=null) {
            mover = mover.next;
        }
        Node newNode = new Node(n,null,mover);
        mover.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 1, 2 };
        Node head = makeLL(arr);
        head = deleteAtposition(head,5);
        printLL(head);
    }
}
