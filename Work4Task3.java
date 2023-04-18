import java.util.*;
public class Work4Task3 {
       
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println("Исходный список: "+deque);
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            int first = deque.removeFirst();
            int last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Список чисел является полиндромом.");
        }
        else System.out.println("Список чисел не является полиндромом.");
    }
    
}
