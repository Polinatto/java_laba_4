package org.example;

import org.example.test.JUnit;

public class Main {
    public static void main(String[] args) {
       boolean testJson = JUnit.jsonTest();
       if(testJson){
           System.out.println("testJson completed");
       }
       else{
           System.out.println("testJson failed");
       }
    }
}