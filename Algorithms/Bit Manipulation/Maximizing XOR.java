import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nMin = sc.nextInt();
        int nMax = sc.nextInt();
        
        int nOut = 0;
        
        for(int a = nMin; a <= nMax; a++){
            for(int b = nMin; b <= nMax; b++){
                nOut = ((a^b)>nOut)?a^b:nOut;
            }
        }
        
        System.out.println(nOut);
    }
}