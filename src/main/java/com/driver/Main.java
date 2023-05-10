package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly a = new RWOnly();
        // a.name = "Naveen";
        // name has private access in RWOnly
        a.setName("Naveen");
        System.out.println(a.getName());
    }
  
}