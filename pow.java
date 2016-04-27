public class Solution {
    double result;
    public double myPow(double x, int n) {
        if(n<0){
            result = myPow(x,-n);
        }
        else if(n==0){
            result = 1.0;
        }
        else if(n==1){
            result = x;
        }
        else if(n%2==0){
            result = myPow(x,n/2)*myPow(x,n/2);
        }
        else if(n%2==1){
            result = myPow(x,(n-1)/2)*myPow(x,(n+1)/2);
        }
        
        return result;
    }
}