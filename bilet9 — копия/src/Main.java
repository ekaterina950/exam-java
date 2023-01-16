class LinkedIntList
{
    ListNode head;
    class ListNode
    {
        int data;
        ListNode next;
        ListNode(int d) {data = d; next = null; }
    }

    void remove_Duplicates()
    {
        ListNode current = head;
        ListNode next_next;
        if (head == null)
            return;
        while (current.next != null) {
            if (current.data == current.next.data) {
                next_next = current.next.next;

                current.next = next_next;
            }
            else
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
        LinkedIntList l_list = new LinkedIntList();
        l_list.push(17);
        l_list.push(17);
        l_list.push(16);
        l_list.push(14);
        l_list.push(13);
        l_list.push(12);
        l_list.push(12);
        l_list.push(15);
        l_list.push(15);

        System.out.println("Original List with duplicate elements:");
        l_list.printList();
        l_list.remove_Duplicates();

        System.out.println("After removing duplicates from the said list:");
        l_list.printList();
    }
} 