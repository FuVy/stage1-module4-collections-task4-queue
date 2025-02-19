package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.add(firstQueue.poll());
        queue.add(firstQueue.poll());
        queue.add(secondQueue.poll());
        queue.add(secondQueue.poll());

        while (firstQueue.size() > 0 || secondQueue.size() > 0) {
            firstQueue.add(queue.pollLast());
            for (int i = 0 ; i < 2; i++) {
                if (firstQueue.size() == 0) {
                    break;
                }
                queue.add(firstQueue.poll());
            }
            secondQueue.add(queue.pollLast());
            for (int i = 0 ; i < 2; i++) {
                if (secondQueue.size() == 0) {
                    break;
                }
                queue.add(secondQueue.poll());
            }
        }
        return queue;
    }
}
