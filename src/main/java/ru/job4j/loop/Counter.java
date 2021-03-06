package ru.job4j.loop;

public class Counter {
    public static int sum(int first, int finish) {
        int totalSum = 0;
        for (int sum = first; sum <= finish; sum++) {
            totalSum += sum;
        }
        return totalSum;
    }

    public static int sumByEven(int first, int finish) {
        int totalSum = 0;
        for (int sum = first; sum <= finish; sum++) {
            if (sum % 2 == 0) {
                totalSum += sum;
            }
        }
        return totalSum;
    }

    public  static void main(String[] args)  {
        System.out.println("Сумма всех чисел в цикле = " + sum(0, 10));
        System.out.println("Сумма всех чисел в цикле = " + sum(3, 8));
        System.out.println("Сумма всех чисел в цикле = " + sum(1, 1));

        System.out.println("Сумма всех четных чисел в цикле = " + sumByEven(0, 10));
        System.out.println("Сумма всех четных чисел в цикле = " + sumByEven(3, 8));
        System.out.println("Сумма всех четных чисел в цикле = " + sumByEven(1, 1));
    }
}
