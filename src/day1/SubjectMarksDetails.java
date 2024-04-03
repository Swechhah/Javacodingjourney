package day1;

/**
 * The following class initializes the variables and methods to be used.
 * In its current state the program can calculate the percentage and determine if passed or failed for pre-established objects.
 * However, with newer iterations, it will use user-input to perform calculations.
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
     * The following method is used to calculate the percentage of individual subjects that can be calculated to determine the
     * total percentage of the student in all subjects
     * @param s
     * @return percentage
     */
    public  double calculatePercentage(SubjectMarksDetails s){
        //calculate the percentage of individual subjects
        double percentage = ((double)s.subjectObtainedMarks/s.subjectFullmarks)*100;
        return percentage;
    }

}
