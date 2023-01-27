/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02;

/**
 *
 * @author david
 */
public class PartTimeStudent extends Week02 {
    private int numOfCourse;

    public PartTimeStudent(int numOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfCourse = numOfCourse;
    }

    
    
    public int getNumOfCourse() {
        return numOfCourse;
    }
 
    
    
}
