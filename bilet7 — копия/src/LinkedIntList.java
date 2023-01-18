import java.util.LinkedList;
import java.util.List;



public class LinkedIntList {
    private ListNode head;
    public class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void removeAll(LinkedIntList list) {
        ListNode current = head;
        ListNode prev = null;
        ListNode listCurrent = list.head;

        while (current != null && listCurrent != null) {
            if (current.data == listCurrent.data) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                listCurrent = listCurrent.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    public void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList()
    {
        ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.data);
            if (temp.next != null)
            {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        LinkedIntList list1 = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();
        list1.push(17);
        list1.push(18);
        list1.push(19);
        list1.push(10);

        list2.push(11);
        list2.push(17);
        list2.push(10);

        list1.removeAll(list2);
        list1.printList();
        list2.printList();


    }
}
