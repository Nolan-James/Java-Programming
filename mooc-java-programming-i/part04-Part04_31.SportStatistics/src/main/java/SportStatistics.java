
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Match> matches = new ArrayList<>();

        System.out.println("File:");
        String fileName = scan.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                Match match = new Match(homeTeam, visitingTeam, homePoints, visitingPoints);
                matches.add(match);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Team:");
        String team = scan.nextLine();
        int matchCount = 0;
        int wins = 0;
        int losses = 0;

        for (Match match : matches) {
            if (match.getHomeTeam().equals(team) || match.getVisitingTeam().equals(team)) {
                matchCount++;
            }
            if (match.getHomeTeam().equals(team)) {
                if (match.getHomePoints() > match.getVisitingPoints()) {
                    wins++;
                } else {
                    losses++;
                }
            }
            if (match.getVisitingTeam().equals(team)) {
                if (match.getVisitingPoints() > match.getHomePoints()) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + matchCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);


    }

}
