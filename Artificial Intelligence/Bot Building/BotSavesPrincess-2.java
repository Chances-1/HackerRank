import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nSize = sc.nextInt();sc.nextLine();
        
        sc.useDelimiter("");
        
        int nMX=0, nMY=0, nPX=0, nPY=0;
        
        for(int y = 0; y < nSize; y++){
            
            for(int x = 0; x < nSize; x++){
                String s = sc.next();
                if(s.equals("m")){
                    nMX = x;nMY = y;
                }
                if(s.equals("p")){
                    nPX = x;nPY = y;
                }
            }
            if(y!=nSize-1)sc.nextLine();
        }
        
        displayPathtoPrincess(nMX, nMY, nPX, nPY);
    }
    
    public static void displayPathtoPrincess(int mx, int my, int px, int py){
        
//        while(mx!=px && my!=py){
            if(mx > px){ // goes left
                System.out.println("LEFT");
                mx--;
            }
            else if(mx < px){ // goes right
                System.out.println("RIGHT");
                mx++;
            }
            else if(my < py){ // goes up
                System.out.println("DOWN");
                my++;
            }
            else if(my > py){ // goes down
                System.out.println("UP");
                my--;
            }
//        }
    }
}