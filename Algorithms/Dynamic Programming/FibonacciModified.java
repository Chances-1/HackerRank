import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger bi1 = sc.nextBigInteger(), bi2 = sc.nextBigInteger();
        int nTerms = sc.nextInt();
        
        BigInteger biOutput = new BigInteger("0");
        
        for(int i = 0; i < nTerms-2; i++){
            biOutput = bi2.pow(2).add(bi1); // formula
            bi1 = bi2;
            bi2 = biOutput;
        }
        
        System.out.println(biOutput);
    }
}
}