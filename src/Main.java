import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Stack();
//        Queue();
//        priorityQueue();
//        linkedList();
//        arrayList();
    }

    private static void Stack() {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        String myFaveGame = stack.pop();

        System.out.println(myFaveGame);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("Borderlands"));
    }

    private static void Queue() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

//        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
//        queue.poll();

        System.out.println(queue);
    }

    private static void priorityQueue() {
        Queue<Double> prioQueue = new PriorityQueue<>(Collections.reverseOrder());


        prioQueue.offer(3.0);
        prioQueue.offer(2.5);
        prioQueue.offer(4.0);
        prioQueue.offer(1.5);
        prioQueue.offer(2.0);

        while (!prioQueue.isEmpty()) {
            System.out.println(prioQueue.poll());
        }
    }

    private static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }

    private static void arrayList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);

        }

        startTime = System.nanoTime();

//        arrayList.get(0);
//        arrayList.get(500000);
        arrayList.get(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}