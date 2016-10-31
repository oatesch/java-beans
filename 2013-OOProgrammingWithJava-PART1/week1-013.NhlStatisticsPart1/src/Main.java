
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);     
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
