import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for (int cases = 0; cases < nCases; cases++) {
            boolean bCheck = false;
            int[] nArray = new int[sc.nextInt()];
            
            for(int i = 0; i < nArray.length; i++){
                nArray[i] = sc.nextInt();
            }
            // initialize
            int nSumLeft = nArray[0], nSumRight = 0;
            
            for(int i = 2; i < nArray.length; i++){
                nSumRight+=nArray[i];
            }
            // is the first element the correct one OR is there only one element in the array?
            if(nSumLeft == nSumRight || nArray.length == 1){
                bCheck = true;
            }else{
                // search all but the fringes
                for(int i = 2; i < nArray.length-1; i++){
                    // start from left
                    nSumLeft+= nArray[i-1];
                    nSumRight-= nArray[i];
                    
                    // equals?
                    if(nSumLeft == nSumRight){
                        bCheck = true;
                        break;
                    }
                }
            }
            
            System.out.println((bCheck)?"YES":"NO");
            
        }
    }
}