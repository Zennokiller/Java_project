import java.util.ArrayList;
import java.util.List;
public class Work3Task2 {
    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел, удалить из него чётные числа
        Integer count = 8;
        List<Integer> my_list = new ArrayList<>(count);
        //формируем список
        for (int i = 0; i < count; i++) {
            my_list.add(i);            
            //System.out.println(i);
        }
        System.out.println("Исходный список: "+my_list);
         for (int i = 0; i < count; i++) {
             if (my_list.get(i)%2!=0) {
                 my_list.remove(i);
                 count--;
             }                        
        }
        System.out.println("Исходный список с удаленными нечетными значениямиЖ "+my_list);
    }
}
