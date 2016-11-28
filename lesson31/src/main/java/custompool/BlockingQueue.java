package custompool;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Runnable> queue;
    private final int maxSize = 10;

    public BlockingQueue() {
        queue = new LinkedList<>();
    }

    public synchronized void addTask(Runnable runnable) {
        if (queue.size() == maxSize) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        queue.offer(runnable);

        this.notifyAll();
    }

    public synchronized Runnable getTask() {
        if (queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Runnable task = queue.poll();

        notifyAll();

        return task;
    }
}
