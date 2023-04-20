import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Work5Task2 {

    public static void addContact(Map<String, ArrayList<String>> book, String name, String familia) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<String>());
        }
        book.get(name).add(familia);
    }

   

    public static void main(String[] args) {
        Map<String, ArrayList<String>> List_worker = new HashMap<String, ArrayList<String>>();
    
        addContact(List_worker,"Иван", "Иванов");
        addContact(List_worker,"Светлана", "Петрова");
        addContact(List_worker,"Кристина", "Белова");
        addContact(List_worker,"Анна", "Масутина");
        addContact(List_worker,"Анна", "Крутова");
        addContact(List_worker,"Иван", "Юрин");
        addContact(List_worker,"Петр", "Лыков");
        addContact(List_worker,"Павел", "Чернов");
        addContact(List_worker,"Петр", "Чернышов");
        addContact(List_worker,"Мария", "Федорова");
        addContact(List_worker,"Марина", "Светлова");
        addContact(List_worker,"Мария", "Савина");
        addContact(List_worker,"Мария", "Рыкова");
        addContact(List_worker,"Марина", "Лугова");
        addContact(List_worker,"Анна", "Владимирова");
        addContact(List_worker,"Иван", "Мечников");
        addContact(List_worker,"Петр", "Петин");
        addContact(List_worker,"Иван", "Ежов");

        // вывод сортированного ответа
        for (int j = 0; j < List_worker.size()+1; j++) {
            int max = 0;
            String key = null;
            for (Map.Entry<String, ArrayList<String>> worker : List_worker.entrySet()) {
                if (worker.getValue().size()>1) {
                    if (max< worker.getValue().size()) {
                        max = worker.getValue().size();
                        key = worker.getKey();
                    }
                }
            }        
            System.out.println(key+" "+max);
            List_worker.remove(key);
        }
    }
}
