class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean hasX = false;
        boolean hasY = false;
        boolean hasZ = false;

        for(int[] arr : triplets){
            if(arr[0] > target[0] || arr[1] > target[1] || arr[2] > target[2]) continue;

            if(arr[0] == target[0]) hasX = true;
            if(arr[1] == target[1]) hasY = true;
            if(arr[2] == target[2]) hasZ = true;

            if(hasX && hasY && hasZ) return true;
        }

        return hasX && hasY && hasZ;
    }
}