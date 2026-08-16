import java.util.Scanner;

/**
 * @author nadaabdelazem
 * @author Hussain
 */
public class Questions {
    private String question;
    private String[] answers;
    private String correctAnswer;

    /**
     * A constructor that initializes three fields (question, answers, correctAnswer) and takes three parameters
     * @param question of String
     * @param answers of String[]
     * @param correctAnswer of String
     */
    public Questions(String question, String[] answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    // Getters and Setters

    /**
     * Used to get Question
     * @return question of String
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Used to set Question
     * @param question of String
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Used to return Answers
     * @return answers of String[]
     */
    public String[] getAnswers() {
        return answers;
    }

    /**
     * Used to set Answers
     * @param answers of String[]
     */
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    /**
     * Used to return the Correct Answer
     * @return correctAnswer of String
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Used to set the Correct Answer
     * @param correctAnswer of String
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    // Method to check the answers

    /**
     * Used to check an answer and prints out whether it's right or wrong
     * @param selectedAnswer of String
     */
    public void check(String selectedAnswer) {
        if (correctAnswer.equalsIgnoreCase(selectedAnswer)) {
            System.out.println("YAY you're right!!");
        } else {
            System.out.println("Sorry, that's wrong.");
        }
    }

    /**
     * Used to return the details about the class
     * @return result of String
     */
    @Override
    public String toString() {
        String result = "Question: " + question + "\n";
        result += "Answers: " + java.util.Arrays.toString(answers);
        return result;
    }

    /**
     * Used to take inputs using Scanner, create MCQQuestion objects, and print out the results
     * @param args of String[]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating separate question objects
        Questions q1 = new Questions(
                "What is Java?",
                new String[]{"A. A woman probably", "B. An easy programming language",
                        "C. Purple", "D. My great Aunt"},
                "B"
        );


        Questions q2 = new Questions(
                "Who is faster? A cat or a dog?",
                new String[]{"A. Kitty cat", "B. Doggy", "C. Stop shaming animals", "D. Both are special"} ,
                "C"
        );

        Questions q3 = new Questions(
                "What's 2 + 2?",
                new String[]{"A. 21", "B. 7", "C. 22", "D. 4"},
                "D"
        );

        // Array of questions
        Questions[] questions = {q1, q2, q3};

        // Ask each question
        for (Questions question : questions) {
            System.out.println(question);
            System.out.print("Enter your answer (e.g., A, B, C, D): ");
            String userAnswer = scanner.nextLine().trim().toUpperCase(); // Ensure input is trimmed and uppercase
            question.check(userAnswer);
        }

        scanner.close();
    }
}