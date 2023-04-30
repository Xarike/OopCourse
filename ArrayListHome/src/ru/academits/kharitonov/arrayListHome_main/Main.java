package ru.academits.kharitonov.arrayListHome_main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<String> getFileLinesList(String filePath) throws IOException {
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            ArrayList<String> list = new ArrayList<>();

            while ((filePath = bf.readLine()) != null) {
                list.add(filePath);
            }

            return list;
        }
    }

    public static void main(String[] args) {
        // 1.
        try {
            ArrayList<String> list1 = getFileLinesList("TestList.txt") ;
            System.out.println(list1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 2.
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(15, 24, 19, 41, 36, 41, 24));
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i) % 2 == 0){
                list2.remove(i);
                i--;
            }
        }

        System.out.println(list2);

        // 3.
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(34, 59, 6, 67, 13, 59, 6, 55, 1, 1, 7));
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();

        for (Integer number : list3) {
            if (!list4.contains(number)) {
                list4.add(number);
            }
        }

        System.out.println(list4);
    }
}