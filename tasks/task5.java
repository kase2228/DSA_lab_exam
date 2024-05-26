import java.util.Stack;

public class task5 {
    public static void main(String[] args) {
        String word = "hello";
        wordrev(word);
    }
    public static void wordrev(String r){
        Stack<Character> stack = new Stack<>();

        for (char c : r.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}

