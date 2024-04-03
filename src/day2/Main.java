package day2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The following class contains the main method for the project that
 * asks the user to input the name of the subject along with the full marks and obtained marks and
 * displays the total percentage and determines whether you have passed or failed.
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * The main method is used to ask for user input which is then stored as objects into an array list
     * and displays the percentage and the pass or failed status of the user,
     * @param args
     */

    public static void main(String[] args) {
        //creating a new object for scanner class to read user input
        Scanner scanner = new Scanner(System.in);
        //system output and user input
        System.out.println("PLease enter the number of subjects: ");
        int noOfSubjects = scanner.nextInt();
        //creating an arraylist to store the objects  created
        ArrayList<SubjectMarksDetails> subjectList = new ArrayList<SubjectMarksDetails>();
        //creating an object for the SubjectMarksDetails class to initalize the methods
        SubjectMarksDetails subjectmarks = null;
        // creating a loop to store the number of subjects as specified by the user input
        for (int i = 1; i < noOfSubjects + 1; i++) {
            System.out.println("Please Enter your subject name");
            String subname = scanner.next();
            System.out.println("please enter the full marks: ");
            int subfullmarks = scanner.nextInt();
            System.out.println("Please enter the obtained marks: ");
            int subObtainedMarks = scanner.nextInt();
            //creating an object to store the variables
            subjectmarks = new SubjectMarksDetails(subname, subfullmarks, subObtainedMarks);
            //Adding the object to the arraylist
            subjectList.add(subjectmarks);
        }
        //calling the method to determine the total percentage
        double totalactualPercentage = subjectmarks.calculatePercentage(subjectList);
        //displaying the percentage that was acquired
        subjectmarks.displayPercentage(totalactualPercentage);
        //displaying whether the student has passed or fail
        subjectmarks.determinePassOrFail(totalactualPercentage);

        //prints the total percentage

    }
}
