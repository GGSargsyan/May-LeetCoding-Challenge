class Solution {
    public boolean isPerfectSquare(int num) {
        //num = i*i
        //i = num/i
        if(num == 1)
            return true;
        
        int left = 1;
        int right = num/2;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mid < num/mid)
                left = mid + 1;
            else 
                right = mid;
        }
        return left*left == num;
    }
}