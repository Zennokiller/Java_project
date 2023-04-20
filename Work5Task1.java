import java.util.ArrayList;
import java.util.HashMap;

public class Work5Task1 {
    
    

    public static void addContact(HashMap<String, ArrayList<String>> book, String name, String phone) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<String>());
        }
        book.get(name).add(phone);
    }

    public ArrayList<String> getPhonesByName(HashMap<String, ArrayList<String>> book,String name) {
        return book.getOrDefault(name, new ArrayList<String>());
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
          


        addContact(phoneBook,"Иванов", "123-45-67");
        addContact(phoneBook,"Иванов", "765-43-21");
        addContact(phoneBook,"Петров", "111-11-11");
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
    }
}



