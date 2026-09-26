/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int last=-1;
        intervals.sort((a,b)->Integer.compare(a.end,b.end));
        for(Interval it:intervals){
            if(last>it.start){
                return false;
            }
            last=it.end;
        }
        return true;
    }
}
