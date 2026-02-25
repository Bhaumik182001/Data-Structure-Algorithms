class Solution {

    int[] fact(){
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
       
        int product = 1;
        for(int i = 2; i < 10; i++){
            product *= i;
            arr[i] = product;
        }

        return arr;
    }

    boolean isPerm(int a, int b){
        int[] freq = new int[10];

        while(a > 0){
            freq[a % 10]++;
            a /= 10;
        }

        while(b > 0){
            freq[b % 10]--;
            b /= 10;
        }

        for(int count : freq){
            if( count != 0) return false;
        }

        return true;
    }

    public boolean isDigitorialPermutation(int num) {
        int[] arr = fact();

        int n = num;
        int sum = 0;

        while(n != 0){
            sum += (arr[n % 10]);
            n /= 10;
        }

        return isPerm(sum, num);
    }
}