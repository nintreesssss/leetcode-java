//LeetCode 2073:买票需要的时间
//https://leetcode.cn/problems/time-needed-to-buy-tickets/

package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class timeRequiredToBuy_2073 {
    public int Solution(int[] tickets,int k){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < tickets.length;i++)queue.offer(i);

        int time = 0;
        while (!queue.isEmpty()) {
            int front = queue.poll();
            time++;
            tickets[front]--;

            if (front == k && tickets[front] == 0) {
                return time;
            }
            
            if (tickets[front] == 0){
                continue;
            }

            queue.offer(front);
        }
        return time;
    }
}
