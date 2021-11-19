import java.util.Scanner;

public class UserInterface {
    private Statistics statistics;
    private Scanner scanner;

    public UserInterface(Statistics statistics, Scanner scanner) {
        this.statistics = statistics;
        this.scanner = scanner;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            if (number >= 0 && number <= 100) {
                statistics.calculateStats(number);
                statistics.addScore(number);
                if (number >= 50) {
                    statistics.calculatePassed(number);
                }
            }
        }
        statistics.calculateAverageAll();
        statistics.calculateAverageOfPassed();
        statistics.calculatePercentageOfPassed();
        System.out.println("Grade distribution:");
        statistics.gradeDistribution();
    }
}
