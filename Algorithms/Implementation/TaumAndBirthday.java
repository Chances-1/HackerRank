import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for(int cases = 0; cases < nCases; cases++){
            // self explanatory.
            long lNumWhites = sc.nextInt(), 
                    lNumBlacks = sc.nextInt(),
                    lCostWhites = sc.nextInt(),
                    lCostBlacks = sc.nextInt(),
                    lCostSwaps = sc.nextInt();
            
            long lTemp = lCostWhites;
            lCostWhites = (lCostBlacks+lCostSwaps<lCostWhites)?lCostBlacks+lCostSwaps:lCostWhites;
            lCostBlacks = (lTemp+lCostSwaps<lCostBlacks)?lTemp+lCostSwaps:lCostBlacks;
            
            System.out.println((lNumBlacks*lCostBlacks)+(lNumWhites*lCostWhites));
            
        }
    }
}