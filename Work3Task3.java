import java.util.ArrayList;
import java.util.List;
public class Work3Task3 {
    public static void main(String[] args) {
        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
        Integer count = 8;
        List<Integer> my_list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) my_list.add(i);            
        Integer min = my_list.get(0);
        Integer max = my_list.get(0);
        Double mean_value = my_list.get(0).doubleValue();
        System.out.println(my_list);
        for (int i = 0; i < count; i++) {
                if (my_list.get(i)>max) max=my_list.get(i);
                if (my_list.get(i)<min) min=my_list.get(i);
                mean_value+=my_list.get(i);
        }                        
        mean_value=mean_value/count;
        System.out.println("Минимальное значение: "+min);
        System.out.println("Максимальное значение: "+max);
        System.out.println("Среднее значение: "+mean_value);
    }
}
