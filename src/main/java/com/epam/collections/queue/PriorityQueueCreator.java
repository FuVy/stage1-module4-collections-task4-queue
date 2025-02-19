package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (var item : firstList) {
            queue.add(item);
        }
        for (var item : secondList) {
            queue.add(item);
        }
        return queue;
    }

    void process(PriorityQueue<String> queue, String item) {
        queue.offer(item);
    }
}
