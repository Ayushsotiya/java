import java.util.*;

// linkedlist structure
class node {
    int data;
    node next;

    node(int el, node next) {
        this.data = el;
        this.next = next;
    }

    node(int el) {
        this.data = el;
        this.next = null;
    }
}

public class linkedlist {
    // convet array into LL;
    public static node creatLL(int arr[]) {
        node head = new node(arr[0]);
        node mover = head;
        for (int i = 1; i < arr.length; i++) {
            node temp = new node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // print LL
    public static void printLL(node head) {
        node mover = head;
        while (mover != null) {
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }

    // count element of LL
    public static void lengthofLL(node head) {
        node mover = head;
        int cnt = 0;
        for (; mover != null; mover = mover.next) {
            cnt++;
        }
        System.out.println("\n");
        System.out.print("count = " + cnt);
        System.out.println("\n");
    }

    // search in linkedlist
    public static boolean searchLL(node head, int k) {
        node mover = head;
        while (mover != null) {
            if (mover.data == k) {
                return true;
            }
            mover = mover.next;
        }
        return false;
    }

    // delete in ll from the start
    public static node deletNodell(node head) {
        if (head == null)
            return head;
        node temp = head;
        head = head.next;
        return head;
    }

    // delete form the tail
    public static node deleteTail(node head) {
        if (head == null || head.next == null)
            return null;
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return temp;
    }

    // delete from the given place;
    public static node deleteAt(node head, int k) {
        if (head == null)
            return null;
        if (k == 1) {
            node temp = head;
            head = head.next;
            return head;
        }
        int cnt = 0;
        node mover = head;
        node prevNode = head;
        while (mover != null) {
            cnt++;
            if (cnt == k) {
                prevNode.next = prevNode.next.next;
                mover.next = null;
                break;
            }
            prevNode = mover;
            mover = mover.next;
        }
        return head;
    }

    // delete by the value;
    public static node deletethe_value(node head, int k) {
        if (head == null)
            return null;
        if (head.data == k) {
            head = head.next;
            return head;
        }
        node mover = head;
        node prevNode = head;
        while (mover != null) {
            if (mover.data == k) {
                prevNode.next = mover.next;
                mover.next = null;
                break;
            }
            prevNode = mover;
            mover = mover.next;
        }
        return head;
    }

    // inserting the linkedlist
    public static node insertAthead(node head, int n) {
        node temp = new node(n, head);
        return temp;
    }

    public static node insetAttail(node head, int n) {
        if (head == null) {
            node newNode = new node(n);
            return newNode;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node newNode = new node(n);
        temp.next = newNode;
        return head;
    }

    // insert at the position;
    public static node insertAtPlace(node head, int k, int n) {
        if (k == 0) {
            return head;
        }
        if (head == null) {
            if (k == 1) {
                node newNode = new node(k);
                return newNode;
            } else
                return null;
        }
        if (k == 1) {
            node newNode = new node(n);
            newNode.next = head;
            return newNode;
        }
        node mover = head;
        int cnt = 0;
        while (mover.next != null) {
            cnt++;
            if (cnt == k - 1) {
                node newNode = new node(n, mover.next);
                mover.next = newNode;
                break;
            }
            mover = mover.next;
        }
        return head;
    }

    // insert at before value
    public static node insetBeforeValue(node head, int value, int n) {
        if (head == null) {
            return head;
        }
        if (head.data == value) {
            node newNode = new node(n, head);
            return newNode;
        }
        node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                node newNode = new node(n, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 7, 5, 0, 1 };
        node head = creatLL(arr);
        head = insetBeforeValue(head, 0, 2);
        printLL(head);
    }
}