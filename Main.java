package testQueue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.addObj("Ahah");
        q.showQueue();

    }
}

class Queue<T> {
    ArrayList<T> queue = new ArrayList<>();

    public void addObj(T obj) {
        queue.add(obj);
    }

    public void showQueue() {
        if (queue.isEmpty()){
            System.out.println("Очередь пуста");
        }
        for (T man: queue) {
            System.out.println(man);
        }
    }

    public void showFirst() {
        if (queue.isEmpty()){
            System.out.println("Очередь пуста");
        }
        System.out.println(queue.get(0));
    }

    public void remove() {
        if (queue.isEmpty()){
            System.out.println("Очередь пуста");
        }
        queue.remove(0);
    }

    public int getSize() {
        if (queue.isEmpty()){
            System.out.println("Очередь пуста");
        }
        return queue.size();
    }
}