// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// https://app.codility.com/demo/results/trainingYTJSQQ-J6R/

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int elem = 0;
		for( int i = 0; i < A.length; i++ ){
			elem ^= A[i];
		}
		return elem;
    }
}
