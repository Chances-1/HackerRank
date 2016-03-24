import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String sInput = sc.nextLine().toUpperCase();
        boolean bCheck = true;
        
        for(int i = 65; i <= 90; i++){
            char c = (char)i;
            
            if(!(sInput.contains(String.valueOf(c)))){
                bCheck = false;
                break;
            }
        }
        System.out.println((bCheck)?"pangram":"not pangram");
    }
}