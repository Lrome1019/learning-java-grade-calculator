import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Author Laura Romero
        // Test Scores Calculator
        //Calculates the average of three test scores and assigns them a letter grade

        // Get three test scores from user
        System.out.println("Enter first test score: ");
        double score1 = scanner.nextDouble();

        System.out.println("Enter the second test score: ");
        double score2 = scanner.nextDouble();

        System.out.println("Enter the third test score: ");
        double score3 = scanner.nextDouble();

        //Calculate average
        double average = (score1 + score2 + score3) / 3;

        System.out.println("The three scores you entered:");

        //Assign a letter grade based on average
        String letterGrade;
        if (average > 90) {
            letterGrade = "A";
        } else if  (average > 80) {
        letterGrade = "B";
        } else if (average > 70) {
            letterGrade = "C";
        } else if (average > 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
}
//Display results
System.out.println("\n TEST SCORE RESULTS : ");
System.out.println("Score 1: "+score1);
System.out.println("Score 2: "+score2);
System.out.println("Score 3: "+score3);
System.out.printf("Average: %.2f%n",average);
System.out.println("Letter Grade: "+ letterGrade);
System.out.println("The letter grade you have been given:");

//close scanner
scanner.close();
}
        }