public class Solution {
  public List<List<Integer>> combinations(int target, int[] coins) {
    // Write your solution here
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    combinations(target, coins, 0, cur, res);
    return res;
  }
  private void combinations(int target, int[] coins, int index, List<Integer> cur, List<List<Integer>> res){
    if(index == coins.length - 1){
      if(target % coins[index] == 0){
        cur.add(target / coins[index]);
        res.add(new ArrayList<Integer>(cur));
        cur.remove(cur.size() - 1);
      }
      return;
    }
    int max = target / coins[index];
    for(int i = 0; i <= max; i++){
      cur.add(i);
      combinations(target - i * coins[index], coins, index + 1, cur, res);
      cur.remove(cur.size() - 1);
    }
  }
}
