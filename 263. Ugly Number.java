class Solution {
    public boolean isUgly(int num) {
        //Ugly numbers are positive numbers whose prime factors only include 2, 3, 5
        // so we need to ensure only that number is divisible by 2 , 3 and 5 .not by others 
         if(num<=0)
            return false;
        while (num % 2 == 0) {
            num /= 2;
        }

        while (num % 3 == 0) {
            num /= 3;
        }

        while (num % 5 == 0) {
            num /= 5;
        }

        return (num == 1);
    }
}