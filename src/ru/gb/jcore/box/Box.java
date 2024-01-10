package ru.gb.jcore.box;

/** комментирование документации
 * Это очень простой класс описывающий объект - "Коробка"
 * Каждая коробка имеет размер -  size.
 * */
public class Box {

    /** Поле отвечающее за размер коробки */
    private double size;


    /**
     * Конструктор - создание нового объекта
     * @see Box#Box(double)
     */
    public Box(double size) {
        this.size = size;
    }

    public String toString() {
        return "Box have size " + size;
    }
}
