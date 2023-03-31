package com.test.git.hub;

public class Subtraction {
    public int subTwoNums(int a, int b){
        if (a > b) {
            return a-b;
        }
        else {
            return b-a;
        }
    }

    public static void main(String[] args) {
        Subtraction s = new Subtraction();
        System.out.println("Subtraction fo two number = "+s.subTwoNums(30,20));
    }
}
