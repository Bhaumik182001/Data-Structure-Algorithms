class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rB = 0;
        int rE = matrix.length - 1;
        int cB = 0;
        int cE = matrix[0].length - 1;

        List<Integer> res = new ArrayList<>();

        while(rB <= rE && cB <= cE){
            for(int i = cB; i <= cE; i++){
                res.add(matrix[rB][i]);
            }

            rB++;

            for(int i = rB; i <= rE; i++){
                res.add(matrix[i][cE]);
            }

            cE--;

            if(rB <= rE){
                for(int i = cE; i >= cB; i--){
                    res.add(matrix[rE][i]);
                }
            }
            

            rE--;

            if(cB <= cE){
                for(int i = rE; i >= rB; i--){
                    res.add(matrix[i][cB]);
                }
            }
           

            cB++;
        }

        return res;
    }
}