/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02;

/**
 *
 * @author david
 */
public class StudentList {
    
    public static void main(String[] args) {
        
        Week02 s1 = new Week02("s1", "David");
        Week02[] studentList = new Week02[3];
        studentList[0] = new Week02("s1", "David");
        studentList[1] = new Week02("s2", "Cam");
        studentList[2] = new Week02("s3", "Brown");
        
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getStudentName());
        }
        
    }//end of main
}//end of class
