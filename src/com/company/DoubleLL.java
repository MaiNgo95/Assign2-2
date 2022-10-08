package com.company;

public class DoubleLL {
    Node head;

    class Nodehead {
        int countCourse, countStudent;

        Node prev;
        Node next;

        Nodehead(int countCourse, int countStudent) {
            this.countCourse = countCourse;
            this.countStudent = countStudent;

        }

    }


    //create node for MS@2
    class Node {
        String courseName, courseNumber;
        //int studentCount;
        Node prev;
        Node next;

        Node(String courseName, String courseNumber) {
            this.courseName = courseName;
            this.courseNumber = courseNumber;
            //this.studentCount = studentCount;
        }

    }

    class singleNode {

        String data;
        Node prev;
        Node next;

        singleNode(String data) {

            this.data = data;
        }

    }

    //    //BEHAVIOR/METHODS OF CLASS NODE DOUBLE
//*********NODE HEAD DATA ***********************
    void push(int totalCourse, int totalStudent) {
        Nodehead headdata = new Nodehead(totalCourse, totalStudent);
        headdata.prev = null;
        headdata.next = null;
    }

    //    //************INSERTION *********************************
    //void add(String coName, String coNumber, int stuCount)
    void add(String coName, String coNumber) {
        Node last = head;

        Node new_node = new Node(coName, coNumber);
        if (head == null) {
            new_node.prev = null; //change
            head = new_node; // change
            return;
        }

        while (last.next != null) {
            last.next = last;

            last.next = new_node;
            new_node.prev = last;
        }
    }
//    void addCourse(String courseNo){
//        singleNode new_course = new singleNode(courseNo);
//
//
//    }

    void delete(String course) {
        singleNode deleteCourse = new singleNode(course);


    }




    //*************** PRINT LIST ******************
    public void printDList(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.println(node.courseName
                    + node.courseNumber+ " ");
            last = node;
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Nodehead header = new Nodehead( countCourse, countStudent);
    }
}
//        System.out.println("Traversal in reverse direction");
//        while(last!= null){
//            System.out.println(last.data + " ");
//            last = last.prev;
//        }

//}
//}
//********************DELETE A NODE*********************