import java.io.*;
import java.nio.charset.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bCheck = true;
        
        int nCases = sc.nextInt();sc.nextLine();
        
        for(int cases = 0; cases < nCases; cases++){
            bCheck = true;
            String sInput = sc.nextLine();
            int nCheckerLength = sInput.length()/2;
            int nLimit = sInput.length()-1;

            byte[] bNorm = sInput.getBytes(StandardCharsets.US_ASCII);

            for(int i = 0; i < nCheckerLength; i++){
                if(!(Math.abs(bNorm[i]-bNorm[i+1]) == Math.abs(bNorm[nLimit - i]-bNorm[nLimit - i - 1]))){
                    bCheck = false;
                    break;
                }
            }
            System.out.println((bCheck)?"Funny":"Not Funny");
        }
    }
}