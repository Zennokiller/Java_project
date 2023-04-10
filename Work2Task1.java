// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class Work2Task1 {
    public static String shuffleString(String s, int[] index) {
        char[] result = new char[s.length()];
        //String result="";
        for (int i = 0; i < s.length(); i++) {

            result[index[i]-1] = s.charAt(i);
        }
        return new String(result);
    }
    
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        String result = shuffleString(s, index);
        System.out.println(result); // выводит "abc"
    }
}
