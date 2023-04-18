import java.util.*;
public class Work4Task4 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));

        Deque<Integer> result = new ArrayDeque<>();

        int carry = 0;
        while (!d1.isEmpty() || !d2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!d1.isEmpty()) {
                sum += d1.removeLast();
            }
            if (!d2.isEmpty()) {
                sum += d2.removeLast();
            }
            result.addFirst(sum % 10);
            carry = sum / 10;
        }

        System.out.println("Sum: " + result);
    
}
}
