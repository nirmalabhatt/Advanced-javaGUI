
package guipactice;

import java.util.ArrayList;
import java.util.Collections;


public class QuizSystem {
     public static void main(String[] args) {
        // Sample pool of questions
        ArrayList<String> questions = new ArrayList<>();
        questions.add("What is the capital of France?");
        questions.add("What is the highest mountain in the world?");
        questions.add("Who invented the telephone?");
        questions.add("What is the chemical symbol for gold?");
        questions.add("What is the smallest country in the world?");
        
        // Select a random subset of questions from the pool
        int numQuestions = 3;
        Collections.shuffle(questions);
        ArrayList<String> selectedQuestions = new ArrayList<>(questions.subList(0, numQuestions));
        
        // Present the selected questions to the user
        for (int i = 0; i < selectedQuestions.size(); i++) {
            String question = selectedQuestions.get(i);
            System.out.println("Question " + (i+1) + ": " + question);
            // Prompt user for answer and process answer
        }
    }
    
    
}
