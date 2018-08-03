/**
 * Created by heebin on 2018. 8. 3..
 */
class Solution {
    public int[] solution(int[] A, int K){
        int[] B = new int[A.length];
        //A의 length 가 0 이면 그대로 return
        if(A.length == 0){
            return A;
        }else {
            int size = K % A.length; // K/A.length 의 나머지 만큼만 이동 시키면 된다
            int check = A.length - size; // 먼저 배열에 넣을 Integer 를 구한다
            if(size != 0) {
                for (int i = 0; i < A.length; i++) {
                    B[i] = A[check];
                    check++;
                    if (check == A.length) {
                        check = 0;
                    }
                }
                return B;
            }else{
                return A;
            }
        }
    }
}
