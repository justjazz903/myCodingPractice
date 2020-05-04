public class Solution {
  public String[] topKFrequent(String[] combo, int k) {
    // Write your solution here
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < combo.length; i++){
      map.put(combo[i], map.getOrDefault(combo[i], 0) + 1);
    }
    PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k,
    new Comparator<Map.Entry<String, Integer>>(){
      @Override
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
        if(o1.getValue().equals(o2.getValue())){
          return 0;
        }
        return o1.getValue() > o2.getValue() ? 1 : -1;
      }
    });
    //Set<Map.Entry<String, Integer>> entry = map.entrySet();
    for(Map.Entry<String, Integer> e : map.entrySet()){
      if(minHeap.size() < k){
        minHeap.offer(e);
      }else{
        if(e.getValue() > minHeap.peek().getValue()){
          minHeap.poll();
          minHeap.offer(e);
        }
      }
    }
    String[] res = new String[minHeap.size()];
    for(int i = res.length - 1; i >= 0; i--){
      res[i] = minHeap.poll().getKey();
    }
    return res;
  }
}
