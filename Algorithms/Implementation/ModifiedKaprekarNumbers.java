import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean bCheck = false;
        int nP = sc.nextInt(), nQ = sc.nextInt();
        
        for(int p = nP; p <= nQ; p++){
            int nLength = Integer.toString(p).length();
            
            String sSquare = Long.toString((long)Math.pow((double)p, 2));
            
            long lLeft  = (sSquare.substring(0, sSquare.length()-nLength).equals(""))
                    ?
                    0
                    :
                    Long.parseLong(sSquare.substring(0, sSquare.length()-nLength));
            
            long lRight = Long.parseLong(sSquare.substring(sSquare.length()-nLength));
            
            if(lLeft+lRight == p){
                System.out.print(p + " ");
                bCheck = true;
            }
        }
        if(!bCheck){
            System.out.print("INVALID RANGE");
        }
        System.out.println("");
    }
}