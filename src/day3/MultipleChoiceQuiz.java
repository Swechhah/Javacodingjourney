package day3;

import java.util.Scanner;

/**
 * The program below presents a quiz with 5 questions. The program accepts the answers from the user
 * and calculates the total number of correct and incorrect answers.
 * The program follows basic procedural paradigms and requires modifications to reduce redundancy.
 */
public class MultipleChoiceQuiz{

    /**
     * The main method in the class is used to accept user data amd compute the total number of correct and incorrect answers.
     * @param args
     */

    public static void main(String[] args){
        // variables to track total number of correct and incorrect answers
        int totalCorrectAnswers = 0;
        int totalIncorrectAnswers =0;
        //object of scanner class to accept user input
        Scanner scanner = new Scanner(System.in);
        //question 1 along with options
        System.out.println(" Please be ready to take the quiz below. To answer the questions type the letter for the corresponding options below.");
        System.out.println("1. What is the capital of England ?");
        System.out.println("A. London B. Paris C. Rome D. Berlin");
        //store the user input into a variable for later procedures
        String firstAnswerGiven = scanner.nextLine().toUpperCase();
        //condition to count the correct and incorrect answers
        if(firstAnswerGiven.equals("A")){
            totalCorrectAnswers++;
        }
        else {
            totalIncorrectAnswers++;
        }
        //question 2 along with options
        System.out.println("2. What is the sum of 2 + 2 ?");
        System.out.println("A. 6 B. 22 C. 4 D. 3");
        String secondAnswerGiven = scanner.nextLine().toUpperCase();
        //condition to count the correct and incorrect answers
        if(secondAnswerGiven.equals("C")){
            totalCorrectAnswers++;
        }
        else {
            totalIncorrectAnswers++;
        }
        //question 3 along with options
        System.out.println("3. What is the process used to by plants to produce food?");
        System.out.println("A. Osmosis B. Respiration C.Photosynthesis D. Digestion");
        String thirdAnswerGiven = scanner.nextLine().toUpperCase();
        //condition to count the correct and incorrect answers
        if(thirdAnswerGiven.equals("C")){
            totalCorrectAnswers++;
        }
        else {
            totalIncorrectAnswers++;
        }
        //question 4 along with options
        System.out.println("4. What is the author of 'The lord of the rings'?");
        System.out.println("A. George R.R. Martin B. J.K. Rowling C. Arthur Conan Doyle D. J.R.R. Tolkien");
        String fourthAnswerGiven = scanner.nextLine().toUpperCase();
        //condition to count the correct and incorrect answers
        if(fourthAnswerGiven.equals("D")){
            totalCorrectAnswers++;
        }
        else {
            totalIncorrectAnswers++;
        }
        //question 5 along with options
        System.out.println("5. What is the largest land animal in the world ?");
        System.out.println("A. Hippo B. Elephant C. Whale D. Rhino");
        String fifthAnswerGiven = scanner.nextLine().toUpperCase();
        //condition to count the correct and incorrect answers
        if(fifthAnswerGiven.equals("B")){
            totalCorrectAnswers++;
        }
        else {
            totalIncorrectAnswers++;
        }
        // print statement to display the correct and incorrect answers count
        System.out.println(" You have got "+ totalCorrectAnswers + " correct");
        System.out.println(" You have got "+ totalIncorrectAnswers + " wrong");

    }
}
