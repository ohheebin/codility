/**
 * Created by heebin on 2018. 8. 3..
 */
import java.util.LinkedList;
class Solution {
    public int solution(int N){
        LinkedList<Integer> list = new LinkedList<>();
        //N 값을 2진수로 만들어 준다.
        while(N > 0){
            if(N == 1){
                list.add(N);
            }else{
                list.add(N % 2);
            }
            N /= 2;
        }
        String str = "";
        while(!list.isEmpty()){
            str += list.pollLast();
        }
        boolean start = false; // 처음 1이 시작되는 지점을 찾기위해
        int num = 0; // 1과 1 사이의 0의 갯수를 확인
        int max = 0;
        for(int i = 0; i < str.length(); i++){
            //1이 시작되는 지점을 찾으며 start 를 true
            if(start == false && str.charAt(i) == '1'){
                start = true;
            }else if(start == true && str.charAt(i) == '0'){
                num++;
            }else if(start == true && str.charAt(i) == '1'){
                //다음 1을 만나는 경우 0의 최대값을 저장한다
                if(max < num){
                    max = num;
                }
                num = 0;
            }
        }
        return max;
    }
}
