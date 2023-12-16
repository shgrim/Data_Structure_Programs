/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programs;

/**
 *
 * @author Adolf K Weismann
 */
public class Searchmatrix_rowsorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    static int[] search(int[][]matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            if(matrix[r][c]<target)
                r++;
            c--;
        }
        return new int[]{-1,-1 };
    }
    
}
