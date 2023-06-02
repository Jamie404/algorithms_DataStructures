import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Stack();
        Queue();
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

    private static void Queue(){
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
}