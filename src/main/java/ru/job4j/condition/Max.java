package ru.job4j.condition;

public class Max {

    public static int max(int left, int right)  {
        boolean rsl  =  left > right;
        return rsl ? left : right;
    }

    public  static  void main(String[] args) {
        int maximum = Max.max(7, 5);
        System.out.println(maximum);
    }
}