import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nSize = sc.nextInt();
        
        int nOutput = 0;
        for(int i = 0; i < nSize; i++){
            nOutput ^= sc.nextInt();
        }
        System.out.println(nOutput);
    }
}