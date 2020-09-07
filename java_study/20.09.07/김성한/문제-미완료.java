class Solution { 
    public int solution(String[][] relation) { 
        int answer = 0;
        for(int i=0;i<8;i++){ 
            String str=new String(); 
        for(int j=0;j<20;j++){ 
            if(relation[i]!=relation[j]) { 
                answer++; break; 
                }
                else{

                    if(relation[i][j]!=relation[i][j+1])
                    { str=relation[i][j]; 
                    if(relation[i+j][j]!==str){ 
                        answer++; break; 
                        }else{ continue; 
                        } 
                        
                        } 
                        
                } 
                continue; }
} 
} 
return answer; 
} 
}