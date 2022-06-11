package Common;

public class Stack<E> extends Common<E> implements IStack<E>{
    @Override
    public E pop() {
        Node<E> temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        E ans = temp.data;
        temp.next = null;
        return ans;
    }

    @Override
    public void push(E data) {
      Node<E> node = new Node<E>(data);
      node.next = head;
      head = node;
    }

    @Override
    public Node<E> peek() {

        Node<E> temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        return temp;
    }
}
