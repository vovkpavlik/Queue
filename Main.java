package testQueue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.addObj("Ahah");
        q.addObj("Homorjoba");
        q.showQueue();
        q.whoIsAfrontOfYou("Homorjoba");
        System.out.println(q.getSize());
        q.remove();
        q.whoIsAfrontOfYou("Ahah");
        q.showQueue();
        System.out.println(q.getSize());
        q.showFirst();

    }
}

class Queue<T> {
    ArrayList<T> queue = new ArrayList<>();

    public void addObj(T obj) {
        queue.add(obj);
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            for (T man : queue) {
                System.out.println(man);
            }
        }
    }

    public void showFirst() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            System.out.println(queue.get(0));
        }
    }

    public void remove() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            queue.remove(0);
        }
    }

    public int getSize() {
            if (!queue.isEmpty()) {
                return queue.size();
            } else {
                System.out.println("Очередь пуста");
            }
        return 0;
    }

    //Извините, а вы за кем?
    public void whoIsAfrontOfYou(String man) {
        int index = queue.indexOf(man);
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
        }
        else if (index == 0) {
            System.out.println("Ни закем. Я следующий.");
        } else if (!queue.contains(man)) {
            System.out.println("Меня не так зовут!");
        } else {
            System.out.println("Вот за ним -> " + queue.get(index-1));
          }
    }
}