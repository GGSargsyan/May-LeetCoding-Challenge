class Solution {
    
    List[] graph;
    
    public int findJudge(int N, int[][] trust) {
        
        //trust[a,b] means a trusts b
        graph = new List[N];
        
        buildGraph(trust);
        int judge = -1;
        
        for(int i = 0; i < graph.length; i++){
            if(graph[i].size() == N-1){
                judge = i + 1;
            }
        }
        
        for(int i = 0; i < graph.length; i++){
            if(graph[i].contains(judge)){
                return -1;
            }
        }
        
        return judge;
    }
    
    private void buildGraph(int[][] trust){
        for(int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<>();
        
        for(int[] relationship : trust){
            int truster = relationship[0];
            int trusted = relationship[1];
            
            graph[trusted-1].add(truster);
        }
    }
}