package com.harman.calculator;

public class Calculator {
    public static void main(String[] args){
        Subtraction ob=new Subtraction();
        int a=5,b=6,c;
        c=a+b;
        System.out.println(c);
        int result=ob.sub(a,b);
        System.out.println(result);
    }
}
