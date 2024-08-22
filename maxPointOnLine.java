// import java.util.HashMap;

// public class maxPointOnLine {
//     public static int maxPoint(int[][] points){
//         HashMap<Double,Integer> map = new HashMap<>();

//         int maxPoint = 0;
//         double slope;
//         int verticalPoint,samePoint;
//         for(int i = 0; i < points.length; i++){
//              verticalPoint = samePoint = 0;

//             for(int j = i+1; j < points.length; j++){
//                 if(points[i][0] == points[j][0] && points[i][1] == points[j][i]){
//                     samePoint++;
//                 }
//                 else if(points[i][0] == points[i][1]){
//                     verticalPoint++;
//                 }
//                 else{
//                     slope = (double)()/(double)();
//                 }
//         }
//         if(!map.containsKey(slope)){
//             map.put(slope,0);
//         }else{
//             map.put(slope,map.get(slope)+1);
//         }
//     }
// }
//     public static int gcd(int x, int y){
//         if(y == 0){
//             return x;
//         }
//         else{
//             int r = x%y;
//             gcd(y,r);
//         }
//     }
// }

// Iterate over each point and treat it as the starting point.
// For each starting point, calculate the slope of the line it forms with every other point.
// Use a hashmap (or dictionary) to count the number of points that have the same slope with respect to the starting point.
// Track the maximum number of points that share the same slope for each starting point.
// Consider edge cases such as vertical lines, overlapping points, and horizontal lines.
import java.util.HashMap;

class Solution {
    public int maxPoints(int[][] points) {
        if (points == null) {
            return 0;
        }
        if (points.length <= 2) {
            return points.length;
        }

        int maxPoints = 1;

        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> slopeMap = new HashMap<>();
            int duplicate = 0;
            int curMax = 0;

            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }

                int deltaX = points[j][0] - points[i][0];
                int deltaY = points[j][1] - points[i][1];

                if (deltaX == 0 && deltaY == 0) {
                    duplicate++;
                    continue;
                }

                int gcd = generateGCD(deltaX, deltaY);
                deltaX /= gcd;
                deltaY /= gcd;

                // To avoid the issue with the representation of negative slopes
                String slope = deltaX + "/" + deltaY;
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                curMax = Math.max(curMax, slopeMap.get(slope));
            }

            maxPoints = Math.max(maxPoints, curMax + duplicate + 1);
        }

        return maxPoints;
    }

    private int generateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return generateGCD(b, a % b);
    }
}
