import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nNumber = sc.nextInt();
        int[] nSticks = new int[nNumber];
        
        for (int i = 0; i < nNumber; i++) {
            nSticks[i] = sc.nextInt();
        }
        
        boolean bCheck = true;
        
        while(bCheck){
            // check remainder
            int nNumberLeft = 0;
            for(int i = 0; i < nNumber; i++){
                if(nSticks[i] > 0){
                    nNumberLeft++;
                }
            }
            
            // print remainder
            System.out.println(nNumberLeft);
            
            
            // check minimum
            int nMinimum = 9999999;
            for(int i = 0; i < nNumber; i++){
                nMinimum = (nSticks[i] < nMinimum && nSticks[i] > 0)?nSticks[i]:nMinimum;
            }
            
            // minus by minimum
            for(int i = 0; i < nNumber; i++){
                nSticks[i] -= nMinimum;
            }
            
            bCheck = false;
            for(int i = 0; i < nNumber; i++){
                if(nSticks[i] > 0){
                    bCheck = true;
                    break;
                }
            }
        }
    }
}