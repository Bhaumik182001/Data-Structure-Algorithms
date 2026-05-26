class NumArray {

    private int[] segTree;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        segTree = new int[n * 4];

        buildTree(0, 0, n - 1, nums);
    }

    void buildTree(int node, int left, int right, int[] nums){
        if(left == right){
            segTree[node] = nums[left];
            return;
        }

        int mid = left + (right - left) / 2;
        buildTree(2 * node + 1, left, mid, nums);
        buildTree(2 * node + 2, mid + 1, right, nums);
        segTree[node] = segTree[2 * node + 1] + segTree[2 * node + 2];
    }
    
    public void update(int index, int val) {
        update(0, 0, n - 1, index, val);
    }

    private void update(int node, int left, int right, int index, int val){
        if(left == right){
            segTree[node] = val;
            return; 
        }

        int mid = left + (right - left) / 2;
        if(index <= mid) update(2 * node + 1, left, mid, index, val);
        else update(2 * node + 2, mid + 1, right, index, val);

        segTree[node] = segTree[2 * node + 1] + segTree[2 * node + 2];
    }
    
    public int sumRange(int left, int right) {
        return query(0, 0, n - 1, left, right);
    }

    private int query(int node, int start, int end, int left, int right){
        if(right < start || left > end) return 0;
        if(left <= start && end <= right) return segTree[node];

        int mid = start + (end - start) / 2;
        return query(2 * node + 1, start, mid, left, right) + query(2 * node + 2, mid + 1, end, left, right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */