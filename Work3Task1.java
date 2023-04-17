import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Work3Task1 {
    public static void mergeSort(List<Integer> list, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
    
            // рекурсивно сортируем левую и правую половины списка
            mergeSort(list, leftIndex, middleIndex);
            mergeSort(list, middleIndex + 1, rightIndex);
    
            // слияние двух отсортированных половинок в один отсортированный список
            merge(list, leftIndex, middleIndex, rightIndex);
        }
    }
    
    public static void merge(List<Integer> list, int leftIndex, int middleIndex, int rightIndex) {
        // вычисляем размеры двух временных списков
        int leftSize = middleIndex - leftIndex + 1;
        int rightSize = rightIndex - middleIndex;
    
        // создаем временные списки и копируем в них элементы из исходного списка
        int[] leftTemp = new int[leftSize];
        int[] rightTemp = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftTemp[i] = list.get(leftIndex + i);
        }
        for (int j = 0; j < rightSize; j++) {
            rightTemp[j] = list.get(middleIndex + 1 + j);
        }
    
        // слияние двух временных списков в один отсортированный список
        int i = 0, j = 0;
        int k = leftIndex;
        while (i < leftSize && j < rightSize) {
            if (leftTemp[i] <= rightTemp[j]) {
                list.set(k, leftTemp[i]);
                i++;
            } else {
                list.set(k, rightTemp[j]);
                j++;
            }
            k++;
        }
    
        // копируем оставшиеся элементы из левого или правого временного списка
        while (i < leftSize) {
            list.set(k, leftTemp[i]);
            i++;
            k++;
        }
        while (j < rightSize) {
            list.set(k, rightTemp[j]);
            j++;
            k++;
        }
    }

    public static void selectionSort(List<Integer> list) { //сортировка выборкой
        int n = list.size();

        // последовательно проходим по элементам списка
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // ищем минимальный элемент в оставшейся части списка
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            // меняем местами текущий элемент и минимальный элемент
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        // задаем массив из рандомных чисел
        Integer count = 8;
        List<Integer> my_list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) my_list.add(rand.nextInt(10));
        System.out.println("----------Сортировка слиянием-----------");
        System.out.println("Исходный список: "+ my_list);
        //mergeSort(my_list);
        // вызываем метод сортировки списка
        mergeSort(my_list, 0, my_list.size() - 1);
        System.out.println("Отсортированный список: "+ my_list);
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("----------Сортировка выборкой----------");
        for (int i = 0; i < count; i++) my_list.set(i,rand.nextInt(10));
        System.out.println("Исходный список: "+ my_list);
        selectionSort(my_list);
        System.out.println("Отсортированный список: "+ my_list);
        System.out.println("---------------------------------------");
        
    }

}
