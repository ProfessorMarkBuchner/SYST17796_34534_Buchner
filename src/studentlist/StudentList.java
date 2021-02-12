/*
 * This class is a simple example of creating an array of objects
 */
package studentlist;
import java.util.Scanner;


/**
 *
 * @author markb
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient[] students = new Patient[2];
    

        for (int i = 0; i < students.length; i++) {
       
            System.out.println("Enter the students name");
            String name = input.nextLine();
            Patient student = new Patient(name);
       
            students[i] = student;
        }
        System.out.println("Printing the students:");
        String format = "The student's name is %s\n";     
        for (Patient student: students) {
        System.out.printf(format, student.getName());   
        
        }
 

       }
    
}//End Class:___________________________

    