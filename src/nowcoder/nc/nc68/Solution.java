package nowcoder.nc.nc68;

public class Solution {
    public int jumpFloor(int target) {
        int[] answer = new int[41];
        answer[0] = 0;
        answer[1] = 1;
        answer[2] = 2;
        for(int i=3; i<=40; i++){
            answer[i] = answer[i-1]+answer[i-2];
        }
        return answer[target];

    }
}
