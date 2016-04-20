public class Solution {
    public String intToRoman(int num) {
        if(num<1){
            return "The num is out of range";
        }
        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roString = new StringBuilder();
        int i=0;
        int times;
        while(num>0){
            times = num/numbers[i];
            num-=times*numbers[i];
            for(;times>0;times--){
                roString.append(roman[i]);
            }
            i++;
        }
        return roString.toString();
    }
}