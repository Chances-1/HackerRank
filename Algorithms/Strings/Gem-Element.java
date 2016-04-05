public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // get inputs
        int nRocks = sc.nextInt();sc.nextLine();
        String[] sInputs = new String[nRocks];
        for(int i = 0; i < nRocks; i++){
            sInputs[i] = sc.nextLine();
        }
        
        // consider the first item, since any element in the first string is a potential gem-element.
        String sTemp = sInputs[0];
        ArrayList<String> sContainedLetters = new ArrayList();
        
        // get the first character and replace all repeating characters. add to list after that.
        while(sTemp.length()!=0){
            String s = sTemp.substring(0,1);
            sTemp = sTemp.replaceAll(s, "");
            sContainedLetters.add(s);
        }
        
        // start output
        int nOutput = 0;
        boolean bCheck = true;
        
        // check for the containing letters in all strings. can safely skip element 0 in array.
        for(int letters = 0; letters < sContainedLetters.size(); letters++){
            bCheck = true;
            
            for(int rocks = 0; rocks < nRocks; rocks++){
                if(!sInputs[rocks].contains(sContainedLetters.get(letters))){
                    bCheck = false;
                    break;
                }
            }
            if(bCheck)nOutput++;
        }
        
        System.out.println(nOutput);
        
    }