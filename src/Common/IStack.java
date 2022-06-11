package Common;

public interface IStack<E> extends ICommon<E>{
    E pop();
    void push(E data);
    Node peek();
}
