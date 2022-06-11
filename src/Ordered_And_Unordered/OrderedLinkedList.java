package Ordered_And_Unordered;

import Common.LinkedList;

public class OrderedLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insertData(12);
        linkedList.insertData(22);
        linkedList.insertData(14);
        linkedList.insertData(13);
        linkedList.sort();
        linkedList.printData();
    }
}
