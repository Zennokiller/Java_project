import java.util.*;
public class Notebook {
    public String model; // модель ноутбука
    public int ram; // объём оперативной памяти
    public int storage; // объём жесткого диска
    public String os; // операционная система
    public String color; // цвет
    // Дополнительные поля и методы, если необходимо

    // Конструктор для создания нового экземпляра класса
    public Notebook(String model, int ram, int storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    

    // Геттеры и сеттеры для доступа к полям класса
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    


}