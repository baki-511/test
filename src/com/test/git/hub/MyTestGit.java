package com.test.git.hub;

public class MyTestGit {
    public int addTwoNums(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        MyTestGit test = new MyTestGit();
        System.out.println("Sum of Two numbers = "+test.addTwoNums(10,20));
    }
}
