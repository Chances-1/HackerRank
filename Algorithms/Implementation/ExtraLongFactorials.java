import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nInput = sc.nextInt();
        BigInteger nOutput = BigInteger.valueOf(1);
        
        for(int i = 0; i < nInput;i++){
            nOutput = nOutput.multiply(BigInteger.valueOf(nInput-i));
        }
        
        System.out.println(nOutput);
    }
}