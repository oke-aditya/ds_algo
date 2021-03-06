package collections;

import java.util.*;

public class queue_intro {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<Integer>();
        q1.add(5);
        q1.add(4);
        q1.add(3);
        q1.add(2);
        q1.add(1);

        System.out.println(q1);

        q1.remove(3);
        q1.remove(2);

        System.out.println(q1);

        q1.add(2);
        q1.add(3);

        while (!q1.isEmpty()) {
            System.out.println(q1.poll());
        }

        // Queue <Integer> q2 = new ArrayDeque<Integer>();

        ArrayDeque<Integer> aq1 = new ArrayDeque<Integer>();

        aq1.add(10);
        aq1.add(20);
        aq1.add(30);
        aq1.add(40);
        aq1.removeFirst();
        aq1.addFirst(20);
        aq1.addLast(32);
        aq1.removeLast();

        System.out.println(aq1);

        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue " + q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(q);

    }
}
