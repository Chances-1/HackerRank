import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nReturnDate = sc.nextInt();
        int nReturnMonth = sc.nextInt();
        int nReturnYear = sc.nextInt();
        
        int nDueDate = sc.nextInt();
        int nDueMonth = sc.nextInt();
        int nDueYear = sc.nextInt();
        
        int nDifDate = nReturnDate-nDueDate;
        int nDifMonth = nReturnMonth-nDueMonth;
        int nDifYear = nReturnYear-nDueYear;
        
        int nFine = 0;
        // if difference in year is less than 0, too early
        if(nDifYear >= 0){
            if(nDifYear > 0){
                nFine = 10000;
            }
            else if(nDifMonth >= 0){
                if(nDifMonth > 0){
                    nFine = nDifMonth*500;
                }
                else if(nDifDate >= 0){
                    if(nDifDate > 0){
                        nFine = nDifDate*15;
                    }
                }
            }
        }
        System.out.println(nFine);
    }
}