package chap04;

public class IntAryQueue {

    public class EmptyIntAryQueueException extends RuntimeException {
        public EmptyIntAryQueueException() {
        }
    }

    public class OverflowIntAryQueueException extends RuntimeException {
        public OverflowIntAryQueueException() {
        }
    }

    private int max;
    private int num;

    public IntAryQueue(int capacity) {
        num = 0;
        max = capacity;

    }

    public void clear() {
        num = 0;
    }

    //큐 용량 반환
    public int capacity() {
        return max;
    }
}
