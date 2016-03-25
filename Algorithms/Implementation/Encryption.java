import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // note to self: extremely unclean, looks like the work of a hackjob
        
        Scanner sc = new Scanner(System.in);
        
        String sInput = sc.nextLine();
        int nLength = (int)Math.ceil(Math.sqrt(sInput.length()));
        int nRows = (int)Math.ceil((double)sInput.length()/nLength);
        
        String[] sEncrypt = new String[nRows];
        
        int nLastItem = 0; // measures the last row of the sEncrypt array
        
        for(int i = 0; i < nRows; i++){
            // are we at the end of our rope?
            if(i == nRows-1){
                sEncrypt[i] = sInput.substring(i*nLength);
                nLastItem = sEncrypt[i].length();
            }else{ // if not, proceed
                sEncrypt[i] = sInput.substring(i*nLength, ((i+1)*nLength));
            }
        }
        String sOutput = ""; 
        
        for(int length = 0; length < nLength; length++){
            // iterate across each row
            for(int i = 0; i < nRows; i++){   
                
                // last row + last item is too much?
                if(i == nRows-1 && nLastItem<=length){}// do nothing
                else sOutput+=sEncrypt[i].substring(length, length+1);
                
            }
            sOutput+=" ";
        }
        
        System.out.println(sOutput);
        
    }
}