public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T data) {
        list.add(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = list.get(0);
        list.delete(0);
        return data;
    }

    public boolean isEmpty() {
        try {
            list.get(0);
            return false;
        } catch (IndexOutOfBoundsException e) {
            return true;
        }
    }
}