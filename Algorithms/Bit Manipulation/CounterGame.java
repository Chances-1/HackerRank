import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();sc.nextLine();
        
        for(int cases = 0; cases < nCases; cases++){
            BigInteger biTarget = new BigInteger(sc.nextLine());
            boolean bWinner = true; // Richard = true, Louise = false
            
            while(!biTarget.equals(BigInteger.ONE)){
                // is the target a power of 2 or not?
                if((biTarget.and(biTarget.subtract(BigInteger.ONE))).equals(BigInteger.ZERO)){ // yes
                    
                    biTarget = biTarget.divide(new BigInteger("2"));
                    
                }else{ // no
                    // subtract the biggest power of 2.
                    biTarget = biTarget.subtract(new BigInteger("2").pow((biTarget.bitLength()-1)));
                }    
                bWinner = !bWinner;
            }
            
            System.out.println((bWinner)?"Richard":"Louise");
        }
    }
}