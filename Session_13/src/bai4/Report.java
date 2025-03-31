package bai4;

public class Report {

    public static void generateReport(String name, int age, double[] scores) {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        double avg = calculateAvgScore(scores);

        evaluateResults(avg);
    }


    private static double calculateAvgScore(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }

        double avg = total / scores.length;
        System.out.println("Average Score: " + avg);
        return avg;
    }

    private static void evaluateResults(double avg) {
        if (avg >= 8) {
            System.out.println("Grade: Excellent");
        } else if (avg >= 5) {
            System.out.println("Grade: Good");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
