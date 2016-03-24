import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for (int cases = 0; cases < nCases; cases++) {
            int y = sc.nextInt();
            int z = y;
            
            while (z % 3 != 0 && z >= 0) {
                z -= 5;
            }
            
            if (z < 0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < z; i++) {
                    System.out.print(5);
                }
                for (int i = 0; i < (y - z); i++) {
                    System.out.print(3);
                }
                System.out.println("");
            }
        }
    }
}