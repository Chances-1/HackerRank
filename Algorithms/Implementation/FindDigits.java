import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nCases = sc.nextInt();
        
        for (int cases = 0; cases < nCases; cases++) {
            
            int nInput = sc.nextInt();
            int nOut = 0;
            String sEdit = Integer.toString(nInput);
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> number = new ArrayList<>();
            
            
            for(int i = 1; i < 10; i++){
                if(sEdit.contains(Integer.toString(i))){
                    list.add(i);
                    number.add(sEdit.length() - sEdit.replace(Integer.toString(i), "").length());
                    sEdit = sEdit.replaceAll(Integer.toString(i), "");
                }
            }
            
            for(int i = 0; i < list.size(); i++){
                if(nInput%list.get(i) == 0){
                    nOut+=number.get(i);
                }
            }
            
            System.out.println(nOut);
        }
    }
}