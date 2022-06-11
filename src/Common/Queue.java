package Common;

public class Queue<E> extends Common<E> implements IQueue<E> {
    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<E>(data);
        if(head == null)
        {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    @Override
    public E dequeue() {
        E data = (E) head.data;
        head = head.next;
        return data;
    }
}
