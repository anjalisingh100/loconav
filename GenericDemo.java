package com.anjali.day1.java;

public class GenericDemo<T extends Number> {
    T value1;
    T value2;

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
    public  T addNumber(T value1,T value2){
        Double sum;
        sum=value1.doubleValue()+value2.doubleValue();
        return (T)sum;
    }
}
