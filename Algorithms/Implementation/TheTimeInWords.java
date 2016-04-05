import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<Integer, String> map_hour = new HashMap<Integer, String>();
        Map<Integer, String> map_minute = new HashMap<Integer, String>();
        
        // load up the hour map
        map_hour.put(1, "one");
        map_hour.put(2, "two");
        map_hour.put(3, "three");
        map_hour.put(4, "four");
        map_hour.put(5, "five");
        map_hour.put(6, "six");
        map_hour.put(7, "seven");
        map_hour.put(8, "eight");
        map_hour.put(9, "nine");
        map_hour.put(10, "ten");
        map_hour.put(11, "eleven");
        map_hour.put(12, "twelve");
        
        // load up the minute map
        map_minute.put(0, "o' clock");
        map_minute.put(1, "one ");
        map_minute.put(2, "two");
        map_minute.put(3, "three");
        map_minute.put(4, "four");
        map_minute.put(5, "five");
        map_minute.put(6, "six");
        map_minute.put(7, "seven");
        map_minute.put(8, "eight");
        map_minute.put(9, "nine");
        map_minute.put(10, "ten");
        map_minute.put(11, "eleven");
        map_minute.put(12, "twelve");
        map_minute.put(13, "thirteen");
        map_minute.put(14, "fourteen");
        map_minute.put(15, "quarter");
        map_minute.put(16, "sixteen");
        map_minute.put(17, "seventeen");
        map_minute.put(18, "eighteen");
        map_minute.put(19, "nineteen");
        map_minute.put(20, "twenty");
        map_minute.put(21, "twenty one");
        map_minute.put(22, "twenty two");
        map_minute.put(23, "twenty three");
        map_minute.put(24, "twenty four");
        map_minute.put(25, "twenty five");
        map_minute.put(26, "twenty six");
        map_minute.put(27, "twenty seven");
        map_minute.put(28, "twenty eight");
        map_minute.put(29, "twenty nine");
        map_minute.put(30, "half past");
        
        int nHour = sc.nextInt();
        int nMinute = sc.nextInt();
        
        if(nMinute == 0){
            System.out.println(map_hour.get(nHour) + " " + map_minute.get(nMinute));
        }else{
            // is half?
            if(nMinute == 30){
                System.out.println(map_minute.get(nMinute) + " " + map_hour.get(nHour));
            }else if(nMinute > 30){ // is more than 30?
                nMinute = 60-nMinute;
                if(nMinute == 15){
                    System.out.println(map_minute.get(nMinute) + " to " + map_hour.get(nHour+1));
                }else{
                    System.out.println(map_minute.get(nMinute) + " minutes to " + map_hour.get(nHour+1));
                }
            }else{ // is normal
                if(nMinute == 15){
                    System.out.println(map_minute.get(nMinute) + " past " + map_hour.get(nHour));
                }else{
                    System.out.println(map_minute.get(nMinute) + " minutes past " + map_hour.get(nHour));
                }
            }
        }
    }
}