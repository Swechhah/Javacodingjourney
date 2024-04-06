package day5;

import java.util.*;

/**
 * The program below presents a quiz with 5 questions. The program accepts the answers from the user
 * and calculates the total number of correct and incorrect answers.
 * The program uses hashmap and collections to randomize the order of the questions.
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

        //declaration of hashmap to store the questions, answers and options
        Map<String,String> questionAnswerMap = new HashMap<>();//takes questions as keys and answers as values
        Map<String,String> questionOptionMap = new HashMap<>();//takes questions as keys and options as values

        //adding keys and values to hashmap
        questionAnswerMap.put("What is the capital of England ?","A");
        questionAnswerMap.put("What is the sum of 2 + 2 ?","C");
        questionAnswerMap.put("What is the process used to by plants to produce food?","C");
        questionAnswerMap.put("Who is the author of 'The lord of the rings?","D");
        questionAnswerMap.put("What is the largest land animal in the world ?","B");


        //adding keys and values to hashmap
        questionOptionMap.put("What is the capital of England ?","A. London B. Paris C. Rome D. Berlin");
        questionOptionMap.put("What is the sum of 2 + 2 ?","A. 6 B. 22 C. 4 D. 3" );
        questionOptionMap.put("What is the process used to by plants to produce food?","A. Osmosis B. Respiration C.Photosynthesis D. Digestion");
        questionOptionMap.put("Who is the author of 'The lord of the rings?","A. George R.R. Martin B. J.K. Rowling C. Arthur Conan Doyle D. J.R.R. Tolkien");
        questionOptionMap.put("What is the largest land animal in the world ?","A. Hippo B. Elephant C. Whale D. Rhino");


        //storing the questions into the arraylist to shuffle the questions
        ArrayList<String> questions = new ArrayList<>(questionAnswerMap.keySet());
        //shuffling the questions
        Collections.shuffle(questions);

        // for each loop is used to iterate through the questions arraylist
        for( String questionKey : questions){
            //correct input validation
            boolean validAnswer = false;
            // conditional loop to reiterate through the loop until the required answer is input
            while (!validAnswer) {
                //print the question and answer
                System.out.println(questionKey);
                System.out.println(questionOptionMap.get(questionKey));
                //read user input
                String userAnswer = scanner.nextLine().toUpperCase();
                //test for answer validation with different options than below
                if (userAnswer.equals("A") || userAnswer.equals("B") || userAnswer.equals("C") || userAnswer.equals("D")) {
                    validAnswer = true;// only allows the next question to be printed once previous question has an acceptable answer
                    if (userAnswer.equals(questionAnswerMap.get(questionKey))) {//compares user input to answers written
                        totalCorrectAnswers++;
                    } else {
                        totalIncorrectAnswers++;
                    }
                } else {//handling unwanted and invalid answers
                    System.out.println(" The option is not available. Please try again");
                }

            }

        }
        // print statement to display the correct and incorrect answers count
        System.out.println(" You have got "+ totalCorrectAnswers + " correct answers");
        System.out.println(" You have got "+ totalIncorrectAnswers + " wrong answers");
    }

}

