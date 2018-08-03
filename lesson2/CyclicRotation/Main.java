import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException{
        int[] A = {3, 8, 9, 7, 6};
        int k = 3;
        int[] B = new int[A.length];

        if(A.length == 0){
            System.out.println(A);
        }else {
            int size = k % A.length;
            int check = A.length - size;
            if(size != 0) {
                for (int i = 0; i < A.length; i++) {
                    B[i] = A[check];
                    check++;
                    if (check == A.length) {
                        check = 0;
                    }
                }
                System.out.println(B);
            }else{
                System.out.println(A);
            }
        }
    }
}







