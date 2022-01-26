package lintcode.p1668;
// https://www.lintcode.com/problem/1668/description?_from=cat
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    /**
     * @param a: the array a
     * @return: return the minimal points number
     */
    public int getAns(List<Interval> a) {
        // write your code here
        Comparator<Interval> myComp = new Comparator<Interval>() {
            @Override
            // 按照区间结束点排序
            public int compare(Interval a, Interval b) {
                if(a.end == b.end) {
                    return b.start - a.start;
                }
                return a.end - b.end;
            }
        };
        Collections.sort(a,myComp);
        int result =0, idx =-1;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).start > idx){
                idx = a.get(i).end;
                result++;
            }
        }

        return result;
    }
}
