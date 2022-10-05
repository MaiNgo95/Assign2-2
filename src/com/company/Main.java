package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Readfile contain = new Readfile();
        ArrayList<ArrayList<String>> x = contain.readText();
        String[][] arr = new String[x.size()][];

      //change the ARRAYLIST TO ARRAY
        for (int i = 0; i < x.size(); i++) {
            arr[i] = new String[x.get(i).size()];
        }
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < x.get(i).size(); j++) {
                arr[i][j] = x.get(i).get(j);
            }



////            }
        }
        System.out.println(arr);
        //covert from Arraylist into Array[][]
        String[][] stringarr = x.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        System.out.println(Arrays.toString(stringarr));

        //print out the element in the inner array
        for (int k=0 ; k< stringarr.length; k++) {
               //System.out.println());

              for(int kk=0 ; kk< stringarr[k].length; kk++){
                  if(stringarr[k][kk].equals( "Machine Learning")){
                      //System.out.println(k);
                      System.out.println(stringarr[kk]);
                  }

              }
          }

    }
}





