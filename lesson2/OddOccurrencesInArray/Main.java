import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static int main(String args[]) throws IOException{
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < A.length; i++){
            if(map.isEmpty()){
                map.put(A[i],1);
                list.add(A[i]);
            }else{
                if(map.containsKey(A[i]) == true){
                    int k = map.get(A[i]) + 1;
                    map.put(A[i],k);
                }else{
                    map.put(A[i],1);
                    list.add(A[i]);
                }
            }
        }
        while(!list.isEmpty()){
            int check = list.poll();
            if(map.get(check) % 2 != 0){
                result = check;
                break;
            }
        }
        return result;
    }
}







