package com.anjali.day1.java;

import java.util.Arrays;

public class StringExamples {
  public static String stringLastChar(String s)
  {
      return (s==null|| s.length()==0)?null:s.substring(0,s.length()-1);
  }
  public  static void arrayManipulation()
  {
      //int arr[]={1,2,3,4,4,5};
      //for(int i=0;i<arr.length;i++){
          //System.out.println(arr[i]);
      //}
      int arr[]=new int[10];
      Arrays.fill(arr,10);
      for(int j:arr)
      {
          System.out.println(j);
      }
  }

}
