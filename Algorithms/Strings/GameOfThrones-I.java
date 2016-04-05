import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String sInput = sc.nextLine(), sTemp = sInput;
        int nLength = sInput.length();
        
        // get the characters and their number of occurences.
        Map<String, Integer> map_character_value = new HashMap();
        
        while(sTemp.length()!=0){ // we want something repeatable
            String s = sTemp.substring(0,1);
            int n = sTemp.length();
            sTemp = sTemp.replaceAll(s, "");
            n -= sTemp.length(); // n always > sTemp
            map_character_value.put(s, n);
        }
        
        boolean bCheck = true;
        // conditions for palindrome:
        // all characters must have even numbers, unless length is odd, in which case only one may be odd.
        if(nLength%2 == 0){ // even
            for (Map.Entry<String, Integer> entrySet : map_character_value.entrySet()) {
                if(entrySet.getValue()%2 != 0){
                   bCheck = false;break;
                }
            }
        }else{ // odd
            int counter = 0;
            for (Map.Entry<String, Integer> entrySet : map_character_value.entrySet()) {
                if(entrySet.getValue()%2 != 0){
                   counter++;
                   if(counter > 1){
                       bCheck = false;break;
                   }
                }
            }
        }
        System.out.println((bCheck)?"YES":"NO");
    }
}