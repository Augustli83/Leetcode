public class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid;
        long sq;
        while(start + 1 < end){
            mid = start + (end - start) / 2;
            sq = mid * mid;
            if(sq==x){
                return mid;
            }
            else if(sq > x){
                end = mid;
            }
            else{
                start = mid;
            }
        }
      sq = end * end;
      if(sq > x){
          return end -1;
      }
      else{
          return end;
      }
    }
}
