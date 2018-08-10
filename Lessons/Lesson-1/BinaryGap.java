// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// https://app.codility.com/demo/results/training3WR6ZV-RRF/

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryString = Integer.toBinaryString(N);
        int count = 0;
        boolean flag = false;
        char[] binaryChar = binaryString.toCharArray();
        for (int i = 0, j = 0; i < binaryChar.length; i++)
        {
            if(flag || (binaryChar[i]) == '0' && i > 0  && binaryChar[i-1] == '1' && i < binaryChar.length-1){
                flag = true;
                if((binaryChar[i]) == '0')
                    j++;
            }
            if(binaryChar[i] == '1' && flag) {
                flag = false;
                if (j > count)
                    count = j;
                j = 0;
            }
        }
        return count;
    }
}
