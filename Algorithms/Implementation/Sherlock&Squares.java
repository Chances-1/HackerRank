import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for (int cases = 0; cases < nCases; cases++) {
            int nStart = sc.nextInt();
            int nEnd = sc.nextInt();
            int nOut = 0;
            
            int nComp = 1, nMod = 1;
            
            while(nComp < nEnd){
                nComp = nMod*nMod;
                if(nComp >= nStart && nComp <= nEnd){
                    nOut++;
                }
                nMod++;
            }
            
            System.out.println(nOut);
        }
    }
}