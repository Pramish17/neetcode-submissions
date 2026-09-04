class Number implements Comparable<Number>{
    int element;
    int freq;
    
    Number(int element, int freq){
        this.element = element;
        this.freq = freq;
    }

    @Override
    public int compareTo(Number that){
        return Integer.compare(that.freq,this.freq);
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq =new PriorityQueue<>();
        HashMap<Integer, Integer> map =new HashMap<>();

        for(int element: nums){
        map.put(element, map.getOrDefault(element,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(new Number(entry.getKey(), entry.getValue()));
        }

        int index = 0;
        int[] result = new int[k];
        while(index < k){
            result[index] =  pq.poll().element;
            index++;
        }
    return result;
    }
}
