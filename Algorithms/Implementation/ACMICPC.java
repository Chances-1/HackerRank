import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nNumberPeople = sc.nextInt();
        int nNumberTopics = sc.nextInt();
        
        int nNumberPerms = 0;
        BigInteger[] biPeople = new BigInteger[nNumberPeople];
        
        for(int i = 1; i <= nNumberPeople; i++){
            nNumberPerms+=i;
        }
        
        sc.nextLine();
        int[] nMaxes = new int[nNumberPerms];
        int nMaximum = 0;
        for(int i = 0; i < nNumberPeople; i++){
            biPeople[i] = new BigInteger(sc.nextLine(), 2);
        }
        
        int nTracker = 0;
        for(int i = 0; i < nNumberPeople ; i++){
            for(int j = i+1; j < nNumberPeople; j++){
                
                BigInteger bi = biPeople[i];
                bi = bi.or(biPeople[j]);
                int nBitCount = bi.bitCount();
                
                nMaximum = (nBitCount > nMaximum)?nBitCount:nMaximum;
                
                nMaxes[nTracker++] = nBitCount;
            }
        }
        
        int nOutput = 0;
        for (int i = 0; i < nNumberPerms; i++) {
            if(nMaxes[i] == nMaximum){
                nOutput++;
            }
        }
        
        System.out.println(nMaximum);
        System.out.println(nOutput);
    }
}