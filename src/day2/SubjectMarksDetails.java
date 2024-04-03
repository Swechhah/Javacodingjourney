package day2;

import java.util.ArrayList;

/**
 * The following class initializes the variables and methods to be used.
 * The program allows user to specify the subjects, their full marks and marks obtained and calculate percentage along
 * with determining whether the student had failed or not
 */

public class SubjectMarksDetails {
    private String subjectName;// variable used to store name of the subject
    private int subjectFullmarks;// variable used to store full marks obtained in a subject
    private int subjectObtainedMarks; // variable used to store obtained marks obtained in a subject





    //constructor for subject marks details class to initialize  variables
    public SubjectMarksDetails( String subjectName,int subjectFullmarks, int subjectObtainedMarks){
        this.subjectName = subjectName;
        this.subjectFullmarks = subjectFullmarks;
        this.subjectObtainedMarks = subjectObtainedMarks;
    }

    /**
     * The following method is used to calculate the percentage of all the subjects that is displayed in the main method
     * the method has double return type that takes arraylist as parameter and returns the percentage as output
     * @param  sublist
     * @return ((double)obtainedmarks/fullmarks)*100
     */
      double calculatePercentage(ArrayList<SubjectMarksDetails> sublist){
         //calculate the percentage of all subjects
          int fullmarks = 0;
          int obtainedmarks = 0;
          //loop to traverse all the objects in the arraylist
         for(SubjectMarksDetails subjectMarksDetails : sublist){
             //add hte values present in the object to calculate the percentage
             fullmarks = fullmarks + subjectMarksDetails.subjectFullmarks;
             obtainedmarks = obtainedmarks + subjectMarksDetails.subjectObtainedMarks;
         }
          return ((double)obtainedmarks/fullmarks)*100;
     }

    /**
     * The following method is used to display the percentage obtained by the student in all the subjects combined
     *The method uses percentage as a parameter
     *  @param percentage
     */
        void displayPercentage(double percentage){
          System.out.println("Your percentage is " + percentage + "%");
        }

    /**
     * The following method is used to display whether the student has passed or failed in their exams
     * The method uses the percentage as an input parameter
     * @param percentage
     */
    void determinePassOrFail(double percentage){
    //condition to check whether the student has passed or failed
          if(percentage>=40){
              System.out.println("Congratulations! You have passed");
          }
          else{
              System.out.println("Sorry! You have failed");
          }

        }
}
