class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer>Set=new HashSet<>();
        int n= grid.length;
        int sq=n*n;
        int CurSum=0;
        int result[]=new int[2];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(Set.contains(grid[i][j])){
                    result[0]=grid[i][j];

                }else{
                    Set.add(grid[i][j]);
                    CurSum +=grid[i][j];
                }
            }
                
        }
        int totalSum=sq*(sq+1)/2;
        result[1]=totalSum-CurSum;
        return result;
        
    }
}