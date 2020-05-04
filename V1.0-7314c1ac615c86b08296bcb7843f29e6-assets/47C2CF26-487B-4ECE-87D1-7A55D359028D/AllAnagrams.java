public class Solution {
  public List<Integer> allAnagrams(String sh, String lo) {
    // Write your solution here
    List<Integer> res = new ArrayList<>();
    if(sh.length() > lo.length()){
      return res;
    }
    Map<Character, Integer> target = new HashMap<>();
    for(int i = 0; i < sh.length(); i++){
      target.put(sh.charAt(i), target.getOrDefault(sh.charAt(i), 0) + 1);
    }
    int match = 0;
    for(int i = 0; i < lo.length(); i++){
      Integer count = target.get(lo.charAt(i));
      if(count != null){
        target.put(lo.charAt(i), target.get(lo.charAt(i)) - 1);
        if(count == 1){
          match++;
        }
      }
      if(i >= sh.length()){
        count = target.get(lo.charAt(i - sh.length()));
        if(count != null){
          target.put(lo.charAt(i - sh.length()), target.get(lo.charAt(i - sh.length())) + 1);
          if(count == 0){
            match--;
          }
        }
      }
      if(match == target.size()){
        res.add(i - sh.length() + 1);
      }
    }
    return res;
  }
}
