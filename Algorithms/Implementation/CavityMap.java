import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nSize = sc.nextInt();sc.nextLine();
        
        sc.useDelimiter(""); // change delimiter to ""
        
        String[][] sGrid = new String[nSize][nSize];
        String[][] sOut = new String[nSize][nSize];
        
        // populate
        for(int row = 0; row < nSize; row++){
            for(int col = 0; col < nSize; col++){
                sGrid[row][col] = sc.next();
                sOut[row][col] = sGrid[row][col];
            }
            if(row != nSize-1)sc.next();
        }
        
        // check the non-border elements
        for(int row = 1; row < nSize-1; row++){
            for(int col = 1; col < nSize-1; col++){
                
                // check above, below, left and right. strict highs only.
                
                int n = Integer.parseInt(sGrid[row][col]);
                
                if(n>Integer.parseInt(sGrid[row-1][col]) // up
                        &&
                       n>Integer.parseInt(sGrid[row+1][col]) // down
                        &&
                       n>Integer.parseInt(sGrid[row][col-1]) // left
                        &&
                       n>Integer.parseInt(sGrid[row][col+1]) // right
                        ){
                    sOut[row][col] = "X";
                }
                
            }
        }
        
        // output.
        for(int row = 0; row < nSize; row++){
            for(int col = 0; col < nSize; col++){
                System.out.print(sOut[row][col]);
            }
            System.out.println();
        }
    }
}