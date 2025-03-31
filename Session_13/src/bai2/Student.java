package bai2;

public class Student {
    public static void main(String[] args) {
        double [] marks = {7.5,8.0,6.5};
        double avgMark = calculateAvgMark(marks);
        if (avgMark >= 5) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    private static double calculateAvgMark(double[] marks) {
        double avgMark = 0;
        for (double mark : marks) {
            avgMark += mark;
        }
        avgMark /= marks.length;
        return avgMark;
    }
}
