import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();sc.nextLine();
        boolean bCheck = false;
        
        for(int cases = 0; cases < nCases; cases++){
            bCheck = false;
            String sInput = sc.nextLine();
            // initialize first character.
            int nOutput = 0;
            
            String sCheck = sInput.substring(0, 1);
            
            for(int i = 1; i < sInput.length(); i++){
                if(!(sInput.substring(i,i+1).equals(sCheck))){
                    sCheck = sInput.substring(i,i+1);
                }else{
                    nOutput++;
                }
            }
            System.out.println(nOutput);
        }
    }
}