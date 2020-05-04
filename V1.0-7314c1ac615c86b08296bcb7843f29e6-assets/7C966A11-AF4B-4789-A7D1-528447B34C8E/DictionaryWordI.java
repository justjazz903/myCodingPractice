public class Solution {
  public boolean canBreak(String input, String[] dict) {
    // Write your solution here
    Set<String> dictSet = new HashSet<>();
    for(String str : dict){
      dictSet.add(str);
    }
    boolean[] canBreak = new boolean[input.length() + 1];
    canBreak[0] = true;
    for(int i = 1; i < canBreak.length; i++){
      for(int j = 0; j < i; j++){
        if(dictSet.contains(input.substring(j, i)) && canBreak[j]){
          canBreak[i] = true;
          break;
        }
      }
    }
    return canBreak[canBreak.length - 1];
  }
}
