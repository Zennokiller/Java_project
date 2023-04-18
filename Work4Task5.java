import java.util.*;
public class Work4Task5 {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ввведите строку: ");
    String str = scanner.nextLine();
    if (isValid(str)) System.out.println("Строка логически правильная");
    else System.out.println("Строка логически НЕправильная");
    }
}
