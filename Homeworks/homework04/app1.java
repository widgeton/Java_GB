// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в
// конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class app1 {
    public static void main(String[] args) {
        LinkedList<Integer> intLinkl = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            intLinkl.add(i);
        }

        System.out.println("Добавление элемента в конец:\n"+intLinkl);
        enqueue(intLinkl, 25);
        System.out.println(intLinkl+"\n");

        System.out.println("Возвращает первый элемент и удаяет его из очереди:\n"+intLinkl);
        System.out.println(dequeue(intLinkl));
        System.out.println(intLinkl+"\n");

        System.out.println("Возвращает первый элемент из очереди, не удаляя:\n"+intLinkl);
        System.out.println(first(intLinkl));
        System.out.println(intLinkl+"\n");
    }

    public static void enqueue(LinkedList<Integer> list, int element){
        list.add(element);
    }
    public static int dequeue(LinkedList<Integer> list){
        return list.poll();
    }

    public static int first(LinkedList<Integer> list){
        return list.peekFirst();
    }
}
