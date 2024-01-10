package ru.gb.jcore.machine;
import ru.gb.jcore.box.Box;
/** комментирование документации
 * Это более сложный класс, в котором происходит создание объектов класса "Box" рандомного размера.
 * Назовем класс "BoxMachine"  - машиной по созданию коробок.
 * */
public class BoxMachine {
    /**
     * Метод - Main. В данном методе в цикле создаем необходимое количество коробок
     * рандомного размера, и выводим на печать коробки с каими размера были созданы.
     * */

    public static void main(String[] args) {
        for(int  i = 0; i < 5; i++) {
            System.out.println(new Box(Math.random()*10));
        }
    }
}
