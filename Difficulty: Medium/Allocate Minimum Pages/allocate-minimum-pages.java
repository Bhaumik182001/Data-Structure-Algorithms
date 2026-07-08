class Solution {
    boolean possible(int[] nums, int k, long limit){
        int count = 1;
        long pages = 0;
        
        for(int page: nums){
            if(pages + page > limit){
                count++;
                pages = page;
            } else {
                pages += page;
            }
            
            if(count > k) return false;
        }
        
        return true;
    }
    
    public int findPages(int[] pages, int k) {
        if(pages.length < k) return -1;
        
        long low = 0;
        long high = 0;
        
        for(int page: pages){
            low = Math.max(low, page);
            high += page;
        }
        
        long result = -1;
        
        while(low <= high){
            long mid = low + (high - low) / 2;
            
            if(possible(pages, k, mid)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return (int)result;
    }
}