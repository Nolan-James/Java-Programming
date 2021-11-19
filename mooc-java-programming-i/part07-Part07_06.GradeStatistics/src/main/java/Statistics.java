import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Statistics {
    private int runningTotal;
    private int totalNumbersEntered;

    private int runningPassedTotal;
    private int totalPassed;

    private ArrayList<Integer> scores;
    private HashMap<Integer, String> grades;

    public Statistics() {
        this.scores = new ArrayList<>();
        this.grades = new HashMap<>();

        grades.put(5, "");
        grades.put(4, "");
        grades.put(3, "");
        grades.put(2, "");
        grades.put(1, "");
        grades.put(0, "");
    }

    public void addScore(int number) {
        scores.add(number);
    }

    public void calculateStats(int number) {
        runningTotal += number;
        totalNumbersEntered += 1;
    }

    public void calculatePassed(int number) {
        runningPassedTotal += number;
        totalPassed += 1;
    }

    public void calculateAverageAll() {
        System.out.println("Point average (all): " + 1.0 * runningTotal / totalNumbersEntered);
    }

    public void calculateAverageOfPassed() {
        if (totalPassed == 0) {
            System.out.println("Points average (passing):-");
        } else {
            System.out.println("Points average (passing): " + 1.0 * runningPassedTotal / totalPassed);
        }
    }

    public void calculatePercentageOfPassed() {
        double passPercentage = 0.0;
        if (totalPassed > 0) {
            passPercentage = (double) 100 * totalPassed / totalNumbersEntered;
        }
        System.out.println("Pass percentage: " + passPercentage);
    }

    public void gradeDistribution() {
        for (int score : scores) {
            if (score >= 90) {
                grades.put(5, grades.get(5) + "*");
            } else if (score >= 80 && score < 90) {
                grades.put(4, grades.get(4) + "*");
            } else if (score >= 70 && score < 80) {
                grades.put(3, grades.get(3) + "*");
            } else if (score >= 60 && score < 70) {
                grades.put(2, grades.get(2) + "*");
            } else if (score >= 50 && score < 60) {
                grades.put(1, grades.get(1) + "*");
            } else if (score < 50) {
                grades.put(0, grades.get(0) + "*");
            }
        }
        for (Map.Entry<Integer, String> entry : grades.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}
