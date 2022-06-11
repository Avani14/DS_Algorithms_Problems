package Common;

public class LinkedList<E> extends Common<E> implements ILinkedList<E>{
    @Override
    public void insertData(E data) {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next!= null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }

    @Override
    public <E extends Comparable<E>> void sort()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        int data;
        Node temp = head,index = null;
        while(temp != null)
        {
            index = temp.next;
            E tempVal = (E) temp.data;
            while (index!= null) {
                E indexVal = (E) index.data;
                int ans = tempVal.compareTo(indexVal);
                E x;
                if (ans>0) {
                    x = (E) temp.data;
                    temp.data = index.data;
                    index.data = x;
                }
                index = index.next;
            }
            temp = temp.next;
        }
    }
}
