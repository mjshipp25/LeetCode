class Solution {
    public boolean isPalindrome(int x) {
        int reverseNum = 0;
        int xCpy = x;
        while (x > 0)
        {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10; 
        }
        if (reverseNum == xCpy)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
