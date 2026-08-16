package Object_creation;

public class exam {
    public static void main(String[] args) {
        grade myGrade = new grade();
        myGrade.score = 95;
        myGrade.letter = "A";

        System.out.println("Your raw mark is " + myGrade.score +"/100");
        System.out.println("Congratulations!!!, you have passed this course with an " + myGrade.letter);
    }
}
