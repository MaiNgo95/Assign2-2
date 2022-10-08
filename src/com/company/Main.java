package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Readfile contain = new Readfile();
        String[][] stringarr = contain.readText();
        String keyString = "Organization of Programming Languages";
        // calling the method which returns an array of
        // indices
        Readfile getItem = new Readfile();
        int[] result = getItem.findIndex(stringarr, keyString);
        // printing the indices returned

        System.out.println("The indices are:- ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        //print index value for each item
        for (int i = 0; i < stringarr.length; i++) {
            // columns
            for (int j = 0; j < stringarr[i].length; j++) {
               //String[] a = stringarr[i].split(",");
               // if keyString is found
              System.out.println(i + "," + j + ": " + stringarr[i][j]);
               }
            }

        //Display request switch case.
        Option_input greeting = new Option_input();
        greeting.optionsIn();







    }























}









