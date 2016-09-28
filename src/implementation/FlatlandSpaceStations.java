package implementation;

import java.util.*;

/**
 * Created by edwinlyu on 9/28/16.
 * https://www.hackerrank.com/challenges/flatland-space-stations
 */
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCities = scanner.nextInt();
        int numStations = scanner.nextInt();
        int[] stations = new int[numStations];
        for (int i = 0; i < numStations; i++) {
            stations[i] = scanner.nextInt();
        }
        Arrays.sort(stations);
        int disToFirstStation = stations[0];
        int disToLastStation = numCities - 1 - stations[stations.length - 1];
        ArrayList<Integer> distances = new ArrayList<>();
        distances.add(disToFirstStation);
        distances.add(disToLastStation);
        for (int i = 0; i < stations.length-1; i++) {
            int disBetweenStations = stations[i+1] - stations[i];
            int curMaxDis = disBetweenStations / 2;
            distances.add(curMaxDis);
        }
        int maxDis = Collections.max(distances);
        System.out.println(maxDis);
    }
}
