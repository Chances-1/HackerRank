import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Sequence A
        int nSizeA = sc.nextInt();
        Map<Integer, Integer> countNumbersA = new HashMap(); // key is the number, value is the count
        for(int size = 0; size < nSizeA; size++){
            int n = sc.nextInt();
            if(countNumbersA.containsKey(n)){ // is it in?
                // increment the associated value
                countNumbersA.put(n, countNumbersA.get(n)+1);
            }else{ // no?
                // add the value to the map
                countNumbersA.put(n,1);
            }
        }
        
        // Sequence B
        int nSizeB = sc.nextInt();
        Map<Integer, Integer> countNumbersBa = new HashMap(); // key is the number, value is the count
        for(int size = 0; size < nSizeB; size++){
            int n = sc.nextInt();
            if(countNumbersBa.containsKey(n)){ // is it in?
                // increment the associated value
                countNumbersBa.put(n, countNumbersBa.get(n)+1);
            }else{ // no?
                // add the value to the map
                countNumbersBa.put(n,1);
            }
        }
        Map<Integer, Integer> countNumbersB = new TreeMap<Integer, Integer>(countNumbersBa);
        
        // compare the two sequences
        for (Map.Entry<Integer, Integer> entry : countNumbersB.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            int nDiff = 0;
            if(countNumbersA.containsKey(key)){// does countNumbersA have the key?
                // calculate the difference
                nDiff = countNumbersB.get(key) - countNumbersA.get(key);
            }else{ // no it doesn't
                nDiff = countNumbersB.get(key);
            }
            if(nDiff > 0){
                System.out.print(key + " ");
            }
        }
    }
}