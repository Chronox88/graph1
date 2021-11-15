package graph1;

import java.util.LinkedList;

public class Queue {
	LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<Integer>();
    }

    public void insert(int v) {
        queue.add(v);
    }

    public int remove() {
        return queue.remove();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
