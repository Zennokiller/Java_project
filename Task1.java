import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        
        // Создаем массив для хранения кубов чисел от 1 до 1000
        int[] cubes = new int[1000];
        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = (i+1) * (i+1) * (i+1);
        }

        // Вводим два числа
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        // Ищем кубы введенных чисел в массиве и выводим результаты
        int cube1 = cubes[num1 - 1];
        int cube2 = cubes[num2 - 1];
        System.out.println("Куб числа " + num1 + ": " + cube1);
        System.out.println("Куб числа " + num2 + ": " + cube2);
    }
}