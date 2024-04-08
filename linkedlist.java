// linkedlist structure
class node {
int data;
node next;
node(int el){
    this.data =el;
    this.next = null;
}
}
public class linkedlist {
    // convet array into LL;
    public static node creatLL(int arr[]){
        node head = new node(arr[0]);
        node mover = head;
        for(int i=1;i<arr.length;i++){
            node temp  = new node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    // print LL
    public static void printLL(node head){
        node mover = head;
        for(;mover!=null;mover= mover.next){
            System.out.print(mover.data+" ");
        }
    }
    // count element of LL
    public static void lengthofLL(node head){
        node mover = head;
        int cnt = 0;
        for(;mover!=null;mover= mover.next){
            cnt++;
        }
        System.out.println("\n");
        System.out.print("count = "+cnt);
        System.out.println("\n");
    }
    public static boolean searchLL(node head,int k){
        node mover = head;
        while (mover!=null) {
            if(mover.data == k){
                return true;
            }
            mover = mover.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,7,5,0,1};
        node head = creatLL(arr);
        printLL(head);
        lengthofLL(head);
        System.out.println(searchLL(head, 6));
    }
}
