import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();sc.nextLine();
        
        for(int cases = 0; cases < nCases; cases++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            boolean bCheck = false;
            
            // what letters are there in the first string?
            ArrayList<String> sLetters = new ArrayList();
            for(int i = 97; i < 122; i++){
                // check for all letters of the alphabet (lowercase)
                if(s1.contains(Character.toString((char)i))){
                    sLetters.add(Character.toString((char)i));
                }
            }
            
            // check if those letters are present in the second string
            for(int i = 0; i < sLetters.size(); i++){
                if(s2.contains(sLetters.get(i))){
                    bCheck = true;
                    break;
                }
            }
            
            System.out.println((bCheck)?"YES":"NO");
            
        }
    }
}