import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeStudent {
    private static class GradeComponent {
        int weight;
        int score;
        int scoreShifted;
        int totalScore;

        public GradeComponent(int weight) {
            this.weight = weight;
        }

        public void inputScore(Scanner inp) {
            System.out.println("Score earned? ");
            score = inp.nextInt();
            System.out.println("Were scores shifted (1=yes, 2=no)");
            scoreShifted = inp.nextInt();
            if (scoreShifted == 1) {
                System.out.println("Shift amount? ");
                scoreShifted = inp.nextInt();
            } else {
                scoreShifted = 0;
            }
            totalScore = Math.min(score + scoreShifted, 100);
            System.out.println("Total points = " + totalScore + " / 100");
        }

        public double calculateWeightedScore() {
            return ((double) totalScore / 100) * weight;
        }
    }

    public static void main(String[] args) {
        GradeStudent mainProgram = new GradeStudent();
        mainProgram.run();
    }

    public void run() {
        Scanner inp = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        GradeComponent midterm = new GradeComponent(0);
        GradeComponent finalterm = new GradeComponent(0);
        GradeComponent homework = new GradeComponent(0);

        begin();
        midterm.inputScore(inp);
        finalterm.inputScore(inp);
        inputHomework(inp, homework);
        report(df, midterm.calculateWeightedScore(), finalterm.calculateWeightedScore(), homework.calculateWeightedScore());
    }

    public void begin() {
        System.out.println("This program reads exam/homework scores\nand reports your overall course grade.\nMidterm:\nWeight (0-100)? ");
    }

    public void inputHomework(Scanner inp, GradeComponent homework) {
        System.out.println("\nHomework:\nWeight (0-100)? ");
        homework.weight = inp.nextInt();
        System.out.println("Number of assignments? ");
        int numOfAssignment = inp.nextInt();
        int totalAssignmentPoint = 0;
        int totalAssignmentMax = numOfAssignment * 30;
        for (int i = 1; i <= numOfAssignment; i++) {
            System.out.println("Assignment " + i + " score and max: ");
            int curScore = inp.nextInt();
            int curMax = inp.nextInt();
            totalAssignmentPoint += curScore;
        }
        System.out.println("How many sections did you attend? ");
        int sectionAmount = inp.nextInt();
        int sectionPoints = Math.min(sectionAmount * 5, 30);
        totalAssignmentPoint = Math.min(totalAssignmentPoint + sectionPoints, 150);
        System.out.println("Section points = " + sectionPoints + " / " + "30");
        System.out.println("Total points = " + totalAssignmentPoint + " / " + totalAssignmentMax);
    }

    public void report(DecimalFormat df, double midtermScore, double finaltermScore, double homeworkScore) {
        double grade = midtermScore + finaltermScore + homeworkScore;
        System.out.println("\nOverall percentage = " + df.format(grade) + '\n' + "Your grade will be at least: ");
        if (grade >= 85)
            System.out.print("3.0");
        else if (grade >= 75)
            System.out.print("2.0");
        else if (grade >= 60)
            System.out.print("1.0");
        else
            System.out.print("0.0");
    }
}
