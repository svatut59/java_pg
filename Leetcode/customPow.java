class Solution {
    public double myPow(double x, int n) {
        if (n==1) return x;
        if (n==0 || x==1) return 1;
        if (n<0) {
           return 1/(myPow(x, -n-1) *x);
        }        
        
        else {
            double result = myPow(x, n/2);
            result *= result;
            if (n%2==1) {
                return result *x;
            }
            else {
                return result;
            }            
        }
    }
}