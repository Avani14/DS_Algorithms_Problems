package Common;

public class Common<E> implements ICommon<E>{
    Node head;
    @Override
    public int size() {
        int count = 0;
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        else {
            Node temp = head;
            while(temp!= null)
            {
                temp = temp.next;
                count++;
            }
        }
        return count;

    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void printData() {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data+"-->");
            temp  =temp.next;
        }
    }

    @Override
    public Node searchNode(E data)
        {
            if(isEmpty())
            {
                System.out.println("List is empty");
                return null;
            }
            else {
                Node node = new Node(data);
                if (head.data == data) {
                    System.out.println("The node with data " + data + " is present at location 1");
                    return head;
                }
                Node temp = head;
                int count = 1;
                while (temp.data != data) {

                    temp = temp.next;
                    count++;
                }
                System.out.println("The node with data " + data + " is present at " + count + " location");
                return temp;
            }
        }
}
