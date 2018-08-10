// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// Test Result
// https://app.codility.com/demo/results/training7FX5BY-CPP/

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if( A == null || A.length == 0 )
            return A;
        for( int i = 0; i < K; i++ ){
            int temp = A[A.length -1];
            for( int j = A.length -1; j > 0; j-- )
                A[j] = A[j-1];
            A[0] = temp;
        }
        return A;
    }
}
