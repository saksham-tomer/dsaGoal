
// public class validSquare {
//     public static double findValid(int[] p1, int[] p2, int[] p3, int[] p4) {

//         double l1 = Math.sqrt((Math.pow((p1[0] - p2[0]), 2) + (Math.pow((p1[1] - p2[1]), 2))));
//         double l2 = Math.sqrt((Math.pow((p2[0] - p3[0]), 2) + (Math.pow((p2[1] - p3[1]), 2))));
//         double l3 = Math.sqrt((Math.pow((p3[0] - p4[0]), 2) + (Math.pow((p3[1] - p4[1]), 2))));
//         double l4 = Math.sqrt((Math.pow((p4[0] - p1[0]), 2) + (Math.pow((p4[1] - p1[1]), 2))));

//         double angle = Math.atan2(l4, l1);
//         double angleInDegree = Math.toDegrees(angle);

//         if (l1 == l2 && l2 == l3 && l3 == l4) {
//             return -1;
//         }
//         return angleInDegree;
//     }

//     public static void main(String[] args) {
//         int[] p1 = { 0, 0 };
//         int[] p2 = { 1, 1 };
//         int[] p3 = { 1, 0 };
//         int[] p4 = { 0, 1 };

//         System.out.println("Running the algo \n" + findValid(p1, p2, p3, p4));
//     }
// }

import java.util.HashSet;
import java.util.Set;

public class ValidSquare {

    private static int dist(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> distances = new HashSet<>();
        distances.add(dist(p1, p2));
        distances.add(dist(p1, p3));
        distances.add(dist(p1, p4));
        distances.add(dist(p2, p3));
        distances.add(dist(p2, p4));
        distances.add(dist(p3, p4));

        return !distances.contains(0) && distances.size() == 2;
    }

    public static void main(String[] args) {
        int[] p1 = { 0, 0 };
        int[] p2 = { 1, 1 };
        int[] p3 = { 1, 0 };
        int[] p4 = { 0, 1 };

        System.out.println(validSquare(p1, p2, p3, p4)); // true

        int[] p1b = { 0, 0 };
        int[] p2b = { 1, 1 };
        int[] p3b = { 1, 0 };
        int[] p4b = { 2, 1 };

        System.out.println(validSquare(p1b, p2b, p3b, p4b)); // false
    }
}

// Distance Calculation: A helper function dist calculates the squared Euclidean
// distance between two points to avoid dealing with floating-point
// inaccuracies.
// Distance Set: A Set is used to store all unique distances between pairs of
// points.
// Validation:
// There should be exactly two unique distances: one for the sides and one for
// the diagonals of the square.
// The set should not contain 0 because it would indicate overlapping points.
// The correct configuration will have 2 unique distances: 4 equal sides and 2
// equal diagonals.