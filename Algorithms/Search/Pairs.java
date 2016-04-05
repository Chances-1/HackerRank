import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nSize = sc.nextInt(), nDiff = sc.nextInt();
        int[] nArray = new int[nSize];
        
        for (int size = 0; size < nSize; size++) {
            nArray[size] = sc.nextInt();
        }
        
        Arrays.sort(nArray);
        int nOutput = 0;
        
        for(int i = 0; i < nSize; i++){
            int nTarget = nArray[i]+nDiff;
			// always check the next item, because the array is sorted
            for(int j = i+1; j < nSize; j++){
                if(nArray[j] == nTarget){
                    nOutput++;
                    break;
                }
            }
        }
        
        System.out.println(nOutput);
    }
}