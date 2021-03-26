package com.anjali.day1.java;

public class Math {

    private int a;
    private int b;

    private String s;

    public Math(int a, int b) {
        this.a=a;
        this.b=b;
    }
    public Math(String str){
        this.s=str;
        System.out.println(str);
    }
    static void add(int a1,int b1){
        int sum=a1+b1;
        System.out.println(sum);
    }
    static void sub(int a1,int b1){
        int subtract=a1-b1;
        System.out.println(subtract);
    }
    static void mul(int a1,int b1){
        int multiply=a1*b1;
        System.out.println(multiply);
    }
    static void div(int a1,int b1){
        int division=a1/b1;
        System.out.println(division);
    }

    static void consitionalOperations(int a,int b)
    {
        if(a<b){
            add(a,b);
        }
        else if(a>b && b!=0){
            div(a,b);
        }
        else if(a==b){
            mul(a,b);
        }
        else if( a>b ){
            sub(a,b);
        }
        else{
            System.out.println("Invalid Number");
        }
    }
    static void consitionalOperationSwitch(int a,int b)
    {
        switch((a<b)?0:(a>b && b!=0)?1:(a==b)?2:(a>b )?3:4){
            case 0:
                add(a,b);
                break;
            case 1:
                div(a,b);
                break;
            case 2:
                mul(a,b);
                break;
            case 3:
                sub(a,b);
                break;
            case 4:
                System.out.println("Invalid Number");
            default:
    }
    }
    static  void sumOfAllIntFor(int a,int b){
        int forSum = 0;
        for(int i=a;i<=b;i++){
            forSum+=i;
        }
        System.out.println(forSum);
    }
    static  void sumOfAllIntWhile(int a,int b){
        int forSum = 0;
        int i=a;
        while(i<=b)
        {
            forSum+=i;
            i++;
        }
        System.out.println(forSum);
    }


    public static void main(String ...args){
        Math sumInt = new Math(5,4);
        Math subInt=new Math(7,3);
        Math mulInt=new Math(7,3);
        Math divInt=new Math(9,3);
        Math string=new Math("hello world");
        System.out.println(string);
        add(sumInt.a,sumInt.b);
        sub(subInt.a,subInt.b);
        mul(mulInt.a,mulInt.b);
        div(divInt.a,divInt.b);
        consitionalOperations(9,0);
        consitionalOperationSwitch(9,0);
        sumOfAllIntFor(1,4);
        sumOfAllIntWhile(1,4);
    }
}
