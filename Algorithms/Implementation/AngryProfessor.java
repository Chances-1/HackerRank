import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nNumberOfCases = sc.nextInt();
        
        for(int cases = 0; cases<nNumberOfCases;cases++){
            int nNumberOfStudents = sc.nextInt();
            int nMinNumber = sc.nextInt();
            int nChecker = 0;
            
            for(int i = 0; i < nNumberOfStudents;i++){
                if(sc.nextInt() <= 0){
                    nChecker++;
                }
            }
            
            System.out.println((nChecker>=nMinNumber)?"NO":"YES");
        }
        
    }
}