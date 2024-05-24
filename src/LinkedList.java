public class LinkedList {
    Node head;
    int size;
    void add(int data){
        if (head == null){
            head = new Node(data);
            size++;
            return;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(data);
        size++;
    }

    void delete(int n){
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i<n; i++){
            p2 = p2.next;
        }
        while (p2.next != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        p1.next = p1.next.next;
    }
    void display(){
        Node cur = head;
        while (cur.next != null){
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.print(cur.data + " -> ");
        System.out.println("Null");
    }
}
