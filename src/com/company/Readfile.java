package com.company;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner; //to read the text in file
import java.util.*;
//import java.util.Arrays;

public class Readfile {
    ArrayList<String> result;



    public ArrayList<ArrayList<String>> readText() throws FileNotFoundException {

        ArrayList<ArrayList<String>> listItem = new ArrayList<ArrayList<String>>();
        //ArrayList<String> title = new ArrayList<String>();
        //var file = new File;
        Scanner read = new Scanner(new File("C:\\Users\\maian\\Assign2\\src\\inputText.txt"));
        while (read.hasNext()) {

            String data = read.nextLine();
            listItem.add(new ArrayList<String>(Arrays.asList(data)));
            //print the element
        }


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
        return listItem;
    }
}











