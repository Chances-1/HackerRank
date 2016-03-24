import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nChapters = sc.nextInt();
        int nPageLimit = sc.nextInt();
        int nCurrentPage = 1;
        int nOutput = 0;
        
        for(int chapters = 0; chapters < nChapters; chapters++){
            
            // input
            int nChapterProblems = sc.nextInt();
            
            // track current problem in chapter
            int nCurrentProblem = 0;
            
            do{
                
                // next problem
                nCurrentProblem++;
                
                // does the current problem have the same number as the page?
                if(nCurrentProblem == nCurrentPage){
                    nOutput++;
                }
                
                // is the problem over the page limit?
                if(nCurrentProblem % nPageLimit == 0){
                    nCurrentPage++;
                }
            }while(nCurrentProblem!=nChapterProblems);
            
            // since we don't account for perfectly symmetric pages (problem%limit == 0 after calculations) 
            if(nCurrentProblem % nPageLimit != 0)nCurrentPage++;
        }
        
        System.out.println(nOutput);
    }
}