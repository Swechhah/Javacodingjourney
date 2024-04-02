/**
 * The following class contains the main method for the project that initializes the objects and displays the output.
 * The program works with pre-input values in its current state but will have GUI functionalities and output when complete
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * The main method is used to initialize  the objects and display the output which is done below
     * @param args
     */
    public static void main(String[] args) {
        //creating a new object
        SubjectMarksDetails subject1 = new SubjectMarksDetails("Science", 100, 89);
        SubjectMarksDetails subject2 = new SubjectMarksDetails("Maths", 100, 95);
        SubjectMarksDetails subject3 = new SubjectMarksDetails("Computer", 100, 80);

        //adding the percentage of individual subjects
        double totalPercentage = (subject1.calculatePercentage(subject1) + subject2.calculatePercentage(subject2) + subject3.calculatePercentage(subject3)) / 3;

        //prints the total percentage
        System.out.println("Your percentage is: " + totalPercentage);
        //prints whether the student has passed or failed
        if (totalPercentage >= 40) {
            System.out.println(" Congratulations! You have passed");
        } else {
            System.out.println(" Sorry! You have failed. Please try again ");
        }
    }
}
