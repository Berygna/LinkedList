public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int lastIndex = size() - 1;
        T data = list.get(lastIndex);
        list.delete(lastIndex);
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

    private int size() {
        int size = 0;
        for (T data : list) {
            size++;
        }
        return size;
    }
}