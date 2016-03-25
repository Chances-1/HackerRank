import java.io.*;
import java.util.*;
import java.nio.charset.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nLength = sc.nextInt();sc.nextLine();
        String sInput = sc.nextLine();
        int nKey = sc.nextInt();
        
        nKey %= 26; // prevent loops.
        byte[] b = sInput.getBytes(StandardCharsets.US_ASCII);
        
        for (int i = 0; i < nLength; i++) {
            // between 65 to 90
            if(b[i] >= 65 && b[i] <= 90){
                b[i]+=nKey;
                if(b[i] > 90){
                    b[i] = (byte)(65 + ((b[i]-90-1)));
                }
            }
            // between 97 to 122
            else if(b[i] >= 97 && b[i] <= 122){
                int nTemp = (int)b[i]+nKey;
                if(nTemp > 122){
                    b[i] = (byte)(97 + ((nTemp-122-1)));
                }else{
                    b[i] = (byte)nTemp;
                }
            }
        }
        
        try {
            System.out.println(new String(b, "UTF-8"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}