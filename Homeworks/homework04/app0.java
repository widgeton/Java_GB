//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class app0 {
    public static void main(String[] args) {
        LinkedList<Integer> linkl = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkl.add(i);
        }
        System.out.println(linkl);
        System.out.println(rversLinkedList(linkl));
    }
    public static LinkedList<Integer> rversLinkedList(LinkedList<Integer> list){
        Deque<Integer> dq = new ArrayDeque<>(list);
        LinkedList<Integer> reversedLinkl = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            reversedLinkl.addLast(dq.pollLast());
        }
        return reversedLinkl;
    }
}
