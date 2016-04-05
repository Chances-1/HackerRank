import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt(); sc.nextLine();
        
        for(int cases = 0; cases < nCases; cases++){
            String sInput = sc.nextLine();
            
            // is the string divisible by 2?
            if(sInput.length()%2!=0){ // no
                
                System.out.println(-1);
                
            }else{// yes
                // rest of code follows
                // split in half, convert to bytes
                byte[] byS1 = sInput.substring(0, sInput.length()/2).getBytes(), byS2 = sInput.substring(sInput.length()/2).getBytes();
                
                int nOutput = sInput.length()/2;
                for(int i = 0; i < sInput.length()/2; i++){
                    // byS1[i] == byS2[j], decrement output
                    for(int j = 0; j < sInput.length()/2; j++){
                        if(byS1[i] == byS2[j]){
                            byS2[j] = -1;
                            nOutput--;
                            break;
                        }
                    }
                }
                System.out.println(nOutput);
            }
        }
    }
}