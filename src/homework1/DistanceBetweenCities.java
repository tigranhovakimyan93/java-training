package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DistanceBetweenCities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int R = 6371; // Radius of the earth
        double lat1, lat2, lon1, lon2;
        try {
            System.out.println("Please enter the latitude of the first city");
            lat1 = scanner.nextDouble();
            System.out.println("Please enter the latitude of the second city");
            lat2 = scanner.nextDouble();
            System.out.println("Please enter the longitude of the first city");
            lon1 = scanner.nextDouble();
            System.out.println("Please enter the longitude of the second city");
            lon2 = scanner.nextDouble();

            double latDistance = Math.toRadians(lat2 - lat1);
            double lonDistance = Math.toRadians(lon2 - lon1);

            double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                    + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                    * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            double distance = R * c;
            distance = Math.pow(distance, 2);

            double distanceInKm = Math.sqrt(distance);
            double distanceInM = Math.sqrt(distance) * 1000; //in meters
            double midpointLat = (lat1 + lat2) / 2;
            double midpointLon = (lon1 + lon2) / 2;

            System.out.println("The distance between two cities is " + Math.round(distanceInKm) + " kilometers or " + Math.round(distanceInM) + " meters");
            System.out.println("The coordinates of midpoint are " + midpointLat + "," + midpointLon);
        } catch (InputMismatchException e) {
            System.out.println("zibil qez");
        }
    }
}
