package Common;

public interface ILinkedList<E> extends ICommon<E>{
    void insertData(E data);
    <E extends Comparable<E>> void sort();
}
