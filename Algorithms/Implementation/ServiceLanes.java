import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nLength = sc.nextInt();
        int nCases = sc.nextInt();
        
        int[] nHighway = new int[nLength];
        
        for(int length = 0; length < nLength; length++){
            nHighway[length] = sc.nextInt();
        }
        
        for (int cases = 0; cases < nCases; cases++) {

            int nEntry = sc.nextInt();
            int nExit = sc.nextInt();
            
            int nOutput = 9999;
            for(int i = nEntry; i <= nExit; i++){
                nOutput = (nHighway[i] < nOutput)?nHighway[i]:nOutput;
            }
            
            System.out.println(nOutput);
        }
    }
}