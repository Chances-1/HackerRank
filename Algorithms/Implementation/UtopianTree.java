import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for (int cases = 0; cases < nCases; cases++) {
            int nH = 1;
            int nCycles = sc.nextInt();
            
            if(nCycles%2 != 0){
                for(int i = 0; i < nCycles; i++){
                    nH = (i%2 == 0)?nH*2:nH+1;
                }
                System.out.println(nH);
            }else{
                for(int i = 0; i < nCycles/2; i++){
                    nH = nH*2 + 1;
                }
                System.out.println(nH);
            }
        }
    }
}