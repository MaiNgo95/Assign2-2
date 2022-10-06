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

        for (int i = 0; i < stringarr.length; i++) {
            // columns
            for (int j = 0; j < stringarr[i].length; j++) {
               //String[] a = stringarr[i].split(",");
               // if keyString is found
              System.out.println(i + "," + j + ": " + stringarr[i][j]);
               }
            }

//        }
    }
}
        //ArrayList<ArrayList<String>> x = contain.readText();
        //System.out.println(x);
        //String[][] arr = new String[x.size()][];

        //change the ARRAYLIST TO ARRAY
//        for (int i = 0; i < x.size(); i++) {
//            arr[i] = new String[x.get(i).size()];
//        }
//
//        for (int i = 0; i < x.size(); i++) {
//        //[] arrInner = x.get(i).split(",");
//            for (int j = 0; j < x.get(i).size(); j++) {
//                arr[i][j] = x.get(i).get(j);
//            }
//
//
//
//        }
        //System.out.println(arr);
        //covert from Arraylist into Array[][]
        //String[][] stringarr = x.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        //System.out.println(Arrays.toString(stringarr));

        //print out the element in the inner array
//        for (int k = 0; k < stringarr.length; k++) {
//            System.out.println("course:" + k+ Arrays.toString(stringarr[k]));
//        }
//

        //String keyString = " tagoode@okstate.edu";
        // calling the method which returns an array of
        // indices
//        int[] result = findIndex(stringarr, keyString);
//        // printing the indices returned
//
//        System.out.println("The indices are:- ");
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }

//        for (int i = 0; i < stringarr.length; i++) {
//            // columns
//            for (int j = 0; j < stringarr[i].length; j++) {
//                //String[] a = stringarr[i].split(",");
//                // if keyString is found
//                System.out.println(i + "," + j + ": " + stringarr[i][j]);
//                }
//            }
//        }




    //}
//find element in array[][]
//public class Main {
////    // method to return an array of indices of keyString
//    public static int[] findIndex(String stringArr[][],
//                                  String keyString) {
//        // initialising result array to -1 in case keyString
//        // is not found
//        int result[] = {-1, -1};
//        // iteration over all the elements of the 2-D array
//        // rows
//        for (int i = 0; i < stringArr.length; i++) {
//
//            // columns
//            for (int j = 0; j < stringArr[i].length; j++) {
//
//
//                // if keyString is found
//                if (stringArr[i][j].split(",").equals(keyString)) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        // if keyString is not found then -1 is returned
//        return result;
//    }
//










