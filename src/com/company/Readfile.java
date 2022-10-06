package com.company;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner; //to read the text in file
import java.util.*;
//import java.util.Arrays;

public class Readfile {
    //ArrayList<String> result;



    public String[][] readText() throws FileNotFoundException {

        ArrayList<ArrayList<String>> listItem = new ArrayList<>();

        //var file = new File;
        Scanner read = new Scanner(new File("C:\\Users\\maian\\Assign2\\src\\inputText.txt"));
        while (read.hasNext()) {

            String data = read.nextLine();
            //listItem.add(new ArrayList<String>(Arrays.asList(data.split("(?=,)"))));
            listItem.add(new ArrayList<>(Arrays.asList(data.split("[,]"))));
            //print the element
        }
            String[][] stringarr = listItem.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);


//        for (int i = 0; i < listItem.size(); i++) {
//            //for(String innerItem : item){
//            //ArrayList Infor = new ArrayList( listItem.get(i) ); //list array course name inside the big list
//
//
//            for (int j = 0; j < listItem.get(i).size(); j++) {
//                System.out.println("Course " + i + ":");
//                result = listItem.get(i).get(j);
//
//                System.out.println("CourseNumber " + result);
//
//
//            }
//
//        }
        return stringarr;
    }

    public static int[] findIndex(String stringArr[][],
                                  String keyString) {
        // initialising result array to -1 in case keyString
        // is not found

       int result[] = new int[2];
        // iteration over all the elements of the 2-D array
        // rows
        for (int i = 0; i < stringArr.length; i++) {

            // columns
            for (int j = 0; j < stringArr[i].length; j++) {


                // if keyString is found
                if (stringArr[i][j].equals(keyString)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        // if keyString is not found then -1 is returned
        return result;
    }
}











