class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            queue.add(stone);
        }
        int a= 0;
        int b= 0;
        int diff = 0;
        while(queue.size()>1){
            a= queue.poll();
            b= queue.poll();
            if(a>b){
                diff = a-b;
                queue.offer(diff);
            }
        }
        return queue.isEmpty() ? 0:queue.poll();
    }
}
