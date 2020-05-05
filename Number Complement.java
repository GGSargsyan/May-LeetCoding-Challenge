class Solution {
    public int findComplement(int num) {
        int power = 0;
        int result = 0;
        
        while(num > 0){
            if(num % 2 == 0){
                result += Math.pow(2, power);
            }
            power++;
            num /= 2;
        }
        return result;
    }
}