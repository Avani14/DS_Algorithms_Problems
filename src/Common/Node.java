package Common;

public class Node <E>{
    E data;
    Node next;

    public Node(E data)
    {
        this.data = data;
        this.next = null;
    }
    @Override
    public String toString()
    {
        return "Data : "+data+" next : "+next+"-->";
    }
}
