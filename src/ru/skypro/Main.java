package ru.skypro;

public class Main {

    public static void main(String[] args) {
         //№6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = -1*(a*(b + (c - d*e)));
        System.out.println("Ответ: " +result);
        //№7
        int a = 5, b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = : " +a+ " b = " +b);
        //№8
        int a = 256;
        int b = a / 10 % 10;
        System.out.println(b);


    }
}