package com.company;

public class Main {

    public static void main(String[] args) {
    /*
    Массив имеет метод add и get
    В массиве 16 обьектов
    */
    MyArray<Integer> arr = new MyArray<>();
    arr.add(1);
    arr.add(5);
    arr.add(6);
    arr.add(52);
    arr.add(43);
    for (int i = 0; i < 5; i++) {
        System.out.println(arr.get(i));
    }
    }
}
