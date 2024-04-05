package day4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The program below presents a quiz with 5 questions. The program accepts the answers from the user
 * and calculates the total number of correct and incorrect answers.
 * The program uses arrays and loops for a more concise and less redundant code.
 */
public class MultipleChoiceQuiz{

    /**
     * The main method in the class is used to accept user data amd compute the total number of correct and incorrect answers.
     * @param args
     */
        public static void main(String[] args){
            // variables to track total number of correct and incorrect answers
            int totalCorrectAnswers =0;
            int totalIncorrectAnswers =0;

            //object of scanner class to accept user input
            Scanner scanner = new Scanner(System.in);

            //declaration of array to store questions
            String[] questions = new String[5];

            //storing the questions into the array
            questions[0] = "1. What is the capital of England ?";
            questions[1] = "2. What is the sum of 2 + 2 ?";
            questions[2] = "3. What is the process used to by plants to produce food?";
            questions[3] = "4. What is the author of 'The lord of the rings'?";
            questions[4] = "5. What is the largest land animal in the world ?" ;

            // creating an array with the correct answers to the questions
            String[] answerKey = {"A","C","C","D","B"};

            //creating an array with all the options listed
            String[] optionsList = new String[5];

            //defining all the options for all the questions
            optionsList[0] = "A. London B. Paris C. Rome D. Berlin" ;
            optionsList[1] = "A. 6 B. 22 C. 4 D. 3" ;
            optionsList[2] =  "A. Osmosis B. Respiration C.Photosynthesis D. Digestion" ;
            optionsList[3] = "A. George R.R. Martin B. J.K. Rowling C. Arthur Conan Doyle D. J.R.R. Tolkien";
            optionsList[4] = "A. Hippo B. Elephant C. Whale D. Rhino";

            //loop is used to iterate the questions and options, accepting user response and computing the accuracy of the answers
            for(int j =0; j<5; j++){//loops to the number of questions in the array
                System.out.println(questions[j]);//prints the question in a particular index of array
                System.out.println(optionsList[j]);//prints the options in a particular index of array
                String answerGiven = scanner.nextLine().toUpperCase();//accepts user input in both upper and lower case

                // if the user answer is equal to the answer key for the question
                if(answerGiven.equals(answerKey[j])){
                    totalCorrectAnswers++;//one mark is added to the total correct answers variable
                }
                else{
                    totalIncorrectAnswers++;//otherwise one mark is added to the total incorrect answers variable
                }

            }
            // print statement to display the correct and incorrect answers count
            System.out.println(" You have got "+ totalCorrectAnswers + " correct answers");
            System.out.println(" You have got "+ totalIncorrectAnswers + " wrong answers");
        }

    }
