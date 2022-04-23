package ru.skypro.advancedtask;

public class AdvancedTasks {
    public static void main(String[] args) {
        // write your code here

        // задача 6

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        int negativeResult = result * (-1);
        System.out.println(negativeResult);

        // задача 7

        int A = 5;
        int B = 7;
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println(A);

        // задача 8

        int _a = 256;
        int _b = (_a % 100) / 10;
        System.out.println(_b);
    }
}
