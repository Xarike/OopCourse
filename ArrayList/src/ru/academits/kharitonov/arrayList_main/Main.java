package ru.academits.kharitonov.arrayList_main;
import ru.academits.kharitonov.arrayList.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(22);
        list.add(17);
        list.add(26);
        list.add(3);
        list.add(11);
        list.add(4);
        list.add(19);
        list.add(28);
        System.out.println(list.size());
        System.out.println(list);

        list.add(60);
        System.out.println(list.size());
        System.out.println(list);

        list.add(6, 78);
        System.out.println(list.size());
        System.out.println(list);

    }
}