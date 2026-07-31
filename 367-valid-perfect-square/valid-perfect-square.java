class Solution {
    public boolean isPerfectSquare(int num) {
        long left=0;
        long right=num;
        
        while(right>=left){

        long mid = left + (right - left) / 2;
        long square = mid * mid;

        if(square==num){
            return true;
        }
        else if(square>num){
            right=mid-1;


        }
        else{
            left=mid+1;
        }

        }
        return false;
        
    }
}