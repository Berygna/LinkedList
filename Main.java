public class Main {
    public static void main(String[] args) {
        // MyLinkedList 테스트
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("Testing MyLinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        // MyQueue 테스트
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("\nTesting MyQueue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        // MyStack 테스트
        MyStack<Double> stack = new MyStack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);

        System.out.println("\nTesting MyStack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}