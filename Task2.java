import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.print("n= ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        
        for (int i=0; i<arr.length; i++){
            System.out.print("arr["+i+"]= ");
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("m= ");
        int m = scanner.nextInt();

        System.out.println("Полученные данные");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]*m);
        }

        //t n = scanner.nextInt();
    }
}
