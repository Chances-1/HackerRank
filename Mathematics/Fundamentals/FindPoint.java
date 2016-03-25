import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for(int cases = 0; cases < nCases; cases++){
            // symmetric point is midpoint-origin, added to midpoint.
            int nX = sc.nextInt(), nY = sc.nextInt();
            
            int nXOut = sc.nextInt()*2-nX, nYOut = sc.nextInt()*2-nY;
            
            System.out.println(nXOut + " " + nYOut);
        }
    }
}