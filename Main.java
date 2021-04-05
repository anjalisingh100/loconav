package com.anjali.day1.java;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.HashMap;

public class Main {

    public static String stringConcatenation() {
        String newLine = System.getProperty("line.separator");
        return "Get busy living"
                .concat(newLine)
                .concat("or")
                .concat(newLine)
                .concat("get busy dying.")
                .concat(newLine)
                .concat("--Stephen King");
    }
    public static String stringBuilder() {
        String newLine = System.getProperty("line.separator");
        return new StringBuilder()
                .append("Get busy living")
                .append(newLine)
                .append("or")
                .append(newLine)
                .append("get busy dying.")
                .append(newLine)
                .append("--Stephen King")
                .toString();
    }
    public class RethrowException {
        public  void test1() throws Exception {
            System.out.println("The Exception in test1() method");
            throw new Exception("thrown from test1() method");
        }
        public  void test2() throws Throwable {
            try {
                test1();
            } catch(Exception e) {
                System.out.println("Inside test2() method");
                throw e;
            }
        }
        public  void main(String[] args) throws Throwable {
            try {
                test2();
            } catch(Exception e) {
                System.out.println("Caught in main");
            }
        }
    }




    public static void main(String []args)
    {
        //System.out.println(stringConcatenation());
       // System.out.println(stringBuilder());
       // StringExamples s=new StringExamples();
        //System.out.println(s.stringLastChar("hello"));
        //String[] splitted="car,jeep,scooter".split(",");
        //String input = " car , jeep, scooter ";
        //String[] splittedtrim = input.trim().split("\\s*,\\s*");
        //StringBuilder si=new StringBuilder(100);
        //si.append("hi");
       // si.append(" am anjali");
        //System.out.println(si.toString());

        //for(String  a:splitted){
           // System.out.println(a);
        //}
        //for(String  a:splittedtrim){
            //System.out.println(a);
       // }
        //s.arrayManipulation();
           //GenericDemo<Double> d=new GenericDemo();
            //d.setValue1(3.0);
            //d.setValue2(5.7);
            //System.out.println(d.addNumber(d.getValue1(),d.getValue2()));

        Scanner s=new Scanner(System.in);

        /*try{
            String st=null;
            int len=st.length();
        }catch (NullPointerException e){
            System.out.println("Error"+e.getMessage());
        }
        System.out.println("continue programming");*/

       /* File file =new File("test.txt");
        try{
            FileOutputStream out =new FileOutputStream(file);
        }catch (FileNotFoundException f){
            f.printStackTrace();
            System.out.println(f.getMessage());
        }*/
       /* HashSet<String> h=new HashSet<String>();
        h.add("anjali");
        h.add("ana");
        System.out.println(h.contains("anjali"));

        Object[] c=h.toArray();
        System.out.println(c);
        Iterator<String> it=h.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        /*HashSet hs = new HashSet();

        // adding elements to hashset
        // using add() method
        boolean  b1 = hs.add("Geeks");
        boolean b2 = hs.add("GeeksforGeeks");

        // adding duplicate element
        boolean b3 = hs.add("Geeks");

        // printing b1, b2, b3
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);

        // printing all elements of hashset
        System.out.println(hs);*/

        /*HashMap<Integer,Integer> hy=new HashMap<>();
        hy.put(1,null);
        hy.put(2,null);
        hy.put(null,8);
        System.out.println(hy.keySet());
        System.out.println(hy.containsKey(0));
        System.out.println(hy.containsValue(0));
        //System.out.println(hy.remove(null));
        System.out.println(hy.replace(1,9));
        System.out.println(hy);*/


        /*Map<String, Product> productsByName = new HashMap<String,Product>();
        Product eBike = new Product("E-Bike", "a");
        Product roadBike = new Product("Road bike", "A bike for competition");
        //System.out.println(eBike.getDescription());
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);
        //System.out.println(productsByName.toString());
        //System.out.println(productsByName.containsKey("E-Bike"));
        //System.out.println(productsByName.containsValue("Road bike"));
        //System.out.println(nextPurchase);
        //Product nextPurchasew = productsByName.get("Car");
        //System.out.println(nextPurchasew);
        for(String key : productsByName.keySet()) {
            Product product = productsByName.get(key);
            System.out.println(product.getDescription());

        }
        productsByName.forEach( (key, product) -> {
            System.out.println("Key: " + key + " Product:" + product.getDescription());
            //do something with the key and value
        });

        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        System.out.println("Contents of list ::"+list);
        String[] myArray = new String[list.size()];
        list.toArray(myArray);

        for(int i=0; i<myArray.length; i++){
            System.out.println("Element at the index "+i+" is ::"+myArray[i]);
        }*/





    }

}
