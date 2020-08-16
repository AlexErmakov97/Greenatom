package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseList {

    static LinkedList reverseList(LinkedList list) {
        int size = list.size();
        LinkedList revList = new LinkedList();
        for (int i = list.size() - 1; i >= list.indexOf(list.getFirst()); i--) {
            revList.add(list.get(i));
        }
        return revList;
    }

    public static void reverse(LinkedList l) {
        ListIterator i1 = l.listIterator();
        int pos1 = 1;
        int pos2 = l.size();
        ListIterator i2 = l.listIterator(pos2);
        while (pos1 < pos2) {
            Object o1 = i1.next();
            Object o2 = i2.previous();
            i1.set(o2);
            i2.set(o1);
            ++pos1;
            --pos2;
        }
    }
}



