package testQueue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.addObj("Ahah");
        q.addObj("Homorjoba");
        q.whoIsAfrontOfYou("Homorjoba");

    }
}

class Queue<T> {
    ArrayList<T> queue = new ArrayList<>();

    //Чекаем, пуста ли очередь.
    public void checkIsEmpty(ArrayList<T> queue) {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
        }
    }

    public void addObj(T obj) {
        queue.add(obj);
    }

    public void showQueue() {
        checkIsEmpty(queue);
        for (T man: queue) {
            System.out.println(man);
        }
    }

    public void showFirst() {
        checkIsEmpty(queue);
        System.out.println(queue.get(0));
    }

    public void remove() {
        checkIsEmpty(queue);
        queue.remove(0);
    }

    public int getSize() {
        checkIsEmpty(queue);
        return queue.size();
    }

    //Извините, а вы за кем?
    public void whoIsAfrontOfYou(String man) {
        checkIsEmpty(queue);
        int index = queue.indexOf(man);
        if (index == 0) {
            System.out.println("Ни закем. Я следующий.");
        } else if (!queue.contains(man)) {
            System.out.println("Меня не так зовут!");
        } else {
            System.out.println("Вот за ним -> " + queue.get(index-1));
          }
    }
}