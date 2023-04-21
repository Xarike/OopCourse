package ru.academits.kharitonov.list_main;
import ru.academits.kharitonov.list.SingleList;

public class ListMain {
    public static void main(String[] args) {
        SingleList<Integer> list = new SingleList<>();
        list.insertFirst(12);
        list.insertFirst(15);
        list.insertFirst(1);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertFirst(13);
        list.insertFirst(19);

        System.out.println("Изначальный список : " + list);
        System.out.println("Размер списка : " + list.getSize());
        System.out.println("Первый элемент : " + list.getFirst());
        System.out.println("Получение узла по индексу : " + list.getItemByIndex(5));
        System.out.println("Изменение по индексу : " + list.setByIndex(4,22));
        System.out.println("Получение элемента по индексу : " + list.getByIndex(4));

        list.insertByIndex(17,3);

        System.out.println("Список после вставки узла : " + list);
        System.out.println("Удаление по индексу : " + list.removeByIndex(0));
        System.out.println("Список после удаления по индексу : " + list);

        if(list.removeItem(6)){
            System.out.println("Элемент удален!");
        } else {
            System.out.println("Элемент не удален!");
        }

        System.out.println("Список после удаления узла по элементу : " + list);

        list.revers();

        System.out.println("Список после разворота : " + list);

        System.out.println("Список после копирования : " + list.copy());
    }
}
