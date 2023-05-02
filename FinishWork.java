import java.util.*;
public class FinishWork {
    // Метод для фильтрации списка ноутбуков по заданным критериям
    private static List<Notebook> filterNotebooks(List<Notebook> notebooks, Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            boolean match = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();
                switch (fieldName) {
                    case "ram":
                        if (notebook.getRam() < (int) fieldValue) {
                            match = false;
                        }
                        break;
                    case "storage":
                        if (notebook.getStorage() < (int) fieldValue) {
                            match = false;
                        }
                        break;
                    case "os":
                        if (!notebook.getOs().equalsIgnoreCase((String) fieldValue)) {
                            match = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equalsIgnoreCase((String) fieldValue)) {
                            match = false;
                        }
                        break;
                }
            }
            if (match) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
    public static void main(String[] args) {
    
        // Создаем множество ноутбуков
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Acer Aspire", 8, 256, "Windows 10", "Черный"));
        notebooks.add(new Notebook("Apple MacBook Air", 16, 512, "macOS Big Sur", "Серебристый"));
        notebooks.add(new Notebook("Dell Inspiron", 12, 512, "Windows 11", "Белый"));
    
        // Запрашиваем у пользователя критерии фильтрации
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объём ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int filterCriteria = scanner.nextInt();

        // Запрашиваем минимальные значения для указанных критериев
        Map<String, Object> filters = Map.of();
        switch (filterCriteria) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                int minRam = scanner.nextInt();
                filters = Map.of("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объём жесткого диска:");
                int minStorage = scanner.nextInt();
                filters = Map.of("storage", minStorage);
                break;
            case 3:
                System.out.println("Введите название операционной системы:");
                String os = scanner.next();
                filters = Map.of("os", os);
                break;
            case 4:
                System.out.println("Введите цвет ноутбука:");
                String color = scanner.next();
                filters = Map.of("color", color);
                break;
            default:
                System.out.println("Некорректный ввод.");
                return;
        }
        
        
        
        
        // Фильтруем ноутбуки по заданным критериям
        List<Notebook> filteredNotebooks = filterNotebooks(notebooks, filters);

        // Выводим результаты
        if (filteredNotebooks.isEmpty()) {
            System.out.println("Ноутбуки, отвечающие критериям фильтрации, не найдены.");
        } else {
            System.out.println("Найдены ноутбуки, отвечающие критериям фильтрации:");
            for (Notebook notebook : filteredNotebooks) {
                System.out.println(notebook.getModel() + " - ОЗУ: " + notebook.getRam() +
                        ", ЖД: " + notebook.getStorage() + ", ОС: " + notebook.getOs() +
                        ", Цвет: " + notebook.getColor());
            }
        }


        


 

    
    }

    
}
