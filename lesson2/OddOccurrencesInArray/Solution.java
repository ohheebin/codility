/**
 * Created by heebin on 2018. 8. 3..
 */
import java.util.HashMap;
import java.util.LinkedList;
class Solution {
    public int solution(int[] A){

        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // key값은 배열의 값 value 값은 같은 숫자의 수
        LinkedList<Integer> list = new LinkedList<>(); // 마지막에 map에 있는 value값을 찾기 위한 list

        //map의 중복을 허용하지 않는 기능을 이용한다
        for(int i = 0; i < A.length; i++){
            if(map.isEmpty()){
                map.put(A[i],1);
                list.add(A[i]);
            }else{
                if(map.containsKey(A[i]) == true){ //map에 숫자를 넣을때 만약 키값이 존재한다면 value값을 1 증가 시켜서 다시 넣는다
                    int k = map.get(A[i]) + 1;
                    map.put(A[i],k);
                }else{ //map에 키값이 존재하지 않는 경우에 list에 그 숫자를 넣고 map에 value값을 1로 해서 넣는다
                    map.put(A[i],1);
                    list.add(A[i]);
                }
            }
        }
        //map의 value값이 홀수라면 그 숫자는 매핑이 되지 않은 숫자가 되므로 그 숫자를 반환한다
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
