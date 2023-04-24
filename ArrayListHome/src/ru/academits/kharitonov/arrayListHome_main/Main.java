package ru.academits.kharitonov.arrayListHome_main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("TestList.txt"))) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(scanner.nextInt());

            System.out.println(list);
        }
    }
}