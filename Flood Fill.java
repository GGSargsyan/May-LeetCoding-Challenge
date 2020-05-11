class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int currColor = image[sr][sc];
        if(newColor == currColor)
            return image;
        
        fill(image, sr, sc, newColor, currColor);
        return image;
    }
    
    private void fill(int[][] image, int sr, int sc, int newColor, int currColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length 
           || image[sr][sc] == newColor || image[sr][sc] != currColor)
            return;
        
        image[sr][sc] = newColor;
        fill(image, sr+1, sc, newColor, currColor);
        fill(image, sr-1, sc, newColor, currColor);
        fill(image, sr, sc+1, newColor, currColor);
        fill(image, sr, sc-1, newColor, currColor);
        return;
    }
}