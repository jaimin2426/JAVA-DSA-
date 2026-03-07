/*
Flood Fill Algorithm
Given a m x n integer grid image where image[i][j] represents the pixel value of the image.
You are also given three integers sr, sc, and color. 
You should perform a flood fill on the image starting from the pixel image[sr][sc].
To perform a flood fill, consider the starting pixel, 
plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
plus any pixels connected 4-directionally to those pixels (also with the same color), 
and so on. Replace the color of all of the aforementioned pixels with color.
*/

public class FloodFillAlgorithm{ //O(M*N)
    public static void helper(int image[][],int sr,int sc,int color,boolean vis[][], int originalcolor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc  >= image[0].length || vis[sr][sc] || image[sr][sc] != originalcolor){
            return;
        }

         // Mark visited
        vis[sr][sc] = true;

        // Change color
        image[sr][sc] = color;
        
        //left
        helper(image, sr, sc-1, color, vis, originalcolor);
        //right
        helper(image, sr, sc+1, color, vis, originalcolor);
        //up
        helper(image, sr-1, sc, color, vis, originalcolor);
        //down
        helper(image, sr+1, sc, color, vis, originalcolor);


    }
    public static int[][] floodfill(int image[][],int sr,int sc,int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public static void main(String args[]){
        int a[][] = {
            {1,1,1},
            {1,1,0},
            {1,0,0}
        };

        int result[][] = floodfill(a,1,1,2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}