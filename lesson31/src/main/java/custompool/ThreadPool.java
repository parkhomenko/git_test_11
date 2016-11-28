package custompool;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {

    private BlockingQueue blockingQueue;
    private List<ThreadInThePool> pooledThreads = new ArrayList<>();

    public ThreadPool(int threads) {
        blockingQueue = new BlockingQueue();

        for (int i = 0; i < threads; i++) {
            ThreadInThePool th = new ThreadInThePool(blockingQueue);
            pooledThreads.add(th);
            Thread thread = new Thread(th);
            thread.start();
        }
    }

    public void execute(Runnable task) {
        blockingQueue.addTask(task);
    }

    public void stopAll() {
        for (ThreadInThePool thread : pooledThreads) {
            thread.stop();
        }
    }
}

class ThreadInThePool implements Runnable {

    private boolean finished = false;
    private BlockingQueue queue;

    public ThreadInThePool(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!finished) {
            Runnable task = queue.getTask();
            task.run();
        }
    }

    public void stop() {
        finished = true;
    }
}