class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int rowB=0;
        int rowE=matrix.length-1;
        int colB=0;
        int colE=matrix[0].length-1;
        while(rowB<=rowE && colB<=colE){
            // top
            for(int i=colB;i<=colE;i++){
                ans.add(matrix[rowB][i]);
            }
            // right
            for(int i=rowB+1;i<=rowE;i++){
                ans.add(matrix[i][colE]);
            }
            // bottom
            for(int i=colE-1;i>=colB;i--){
                if(rowB==rowE){
                    break;
                }
                ans.add(matrix[rowE][i]);
            }
            // left
            for(int i=rowE-1;i>=rowB+1;i--){
                if(colB==colE){
                    break;
                }
                ans.add(matrix[i][colB]);
            }
            rowB++;
            colB++;
            rowE--;
            colE--;
        }
        return ans;
        
    }
}