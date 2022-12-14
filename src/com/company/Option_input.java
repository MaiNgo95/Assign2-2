package com.company;

import java.util.Scanner;
import java.util.*;
public class Option_input {
    public void optionsIn() {
        Scanner enterInput = new Scanner(System.in);

        do {
            System.out.println("1.Read the input data\n" +
                    "2. Delete a course\n" +
                    "3. Insert a new course\n" +
                    "4. Delete a student\n" +
                    "5. Insert a new student\n" +
                    "6. Transfer a student from one course to another \n" +
                    "7. Display the course list\n" +
                    "8. Display the student list\n" +
                    "9. Exit");
            System.out.println("Enter options");
            int getInput = enterInput.nextInt();

            if (getInput == 1) {
                System.out.println("Read the input data");
                ;
            } else if (getInput == 2) {
                System.out.println("Delete a new course");
                System.out.println("Please enter a course name want to insert");
                Scanner enterCourse = new Scanner(System.in);
                String takeInput = enterCourse.nextLine();
                //Double insertCourse = new Double();
//                insertCourse.insertDouble(takeInput);
//                insertCourse.printDList(insertCourse.head);
            } else if (getInput == 3) {
                System.out.println("Insert a new course");
                Scanner enterNoCourse = new Scanner(System.in);
                String takeNoCourse = enterNoCourse.nextLine();
                System.out.println("Enter the new course name for" + takeNoCourse + ": ");
                Scanner enterNameCourse = new Scanner(System.in);
                String takeNameCourse = enterNameCourse.nextLine();

                DoubleLL insertCourse = new DoubleLL();
                insertCourse.add(takeNoCourse, takeNameCourse); //add new node new course


            } else if (getInput == 4) {
                System.out.println("Delete a student");
            } else if (getInput == 5) {
                System.out.println("Insert new student");
            } else if (getInput == 6) {
                System.out.println("Transfer a student from one course to another");
            } else if (getInput == 7) {
                System.out.println("Display the course list");
                DoubleLL printCourse = new DoubleLL();
                printCourse.printDList(printCourse.head.next);
            } else if (getInput == 8) {
                System.out.println("Display the student list");
            } else if (getInput == 9) {
                System.out.println("Exit");
                break;
            }

        } while (true);
    }
}
