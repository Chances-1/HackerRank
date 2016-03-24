import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for (int cases = 0; cases < nCases; cases++) {
            int nCash = sc.nextInt();
            int nPer = sc.nextInt();
            int nOffer = sc.nextInt();
            
            int nTotal = (nCash/nPer), nCurrentWrapper = nTotal;
            
            while(nCurrentWrapper/nOffer != 0){
                nTotal += nCurrentWrapper/nOffer;
                nCurrentWrapper = nCurrentWrapper/nOffer + nCurrentWrapper%nOffer;
            }
            
            System.out.println(nTotal);
        }
    }
}