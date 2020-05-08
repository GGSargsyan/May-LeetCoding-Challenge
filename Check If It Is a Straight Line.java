class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int[] p1 = coordinates[0];
        int[] p2 = coordinates[1];
        
        int xdiff = p2[0] - p1[0];
        int ydiff = p2[1] - p1[1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] curr = coordinates[i];
            
            if( ydiff*(curr[0] - p1[0]) != xdiff*(curr[1] - p1[1])) 
                return false;
        }
    return true;
    }
}