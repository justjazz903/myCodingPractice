public class Solution {
  public List<String> subSets(String set) {
    // Write your solution here.
    List<String> res = new ArrayList<>();
    if(set == null){
      return res;
    }
    char[] arr = set.toCharArray();
    StringBuilder sb = new StringBuilder();
    subSets(arr, 0, sb, res);
    return res;
  }
  private void subSets(char[] arr, int index, StringBuilder sb, List<String> res){
    if(index == arr.length){
      res.add(sb.toString());
      return;
    }
    sb.append(arr[index]);
    subSets(arr, index + 1, sb, res);
    sb.deleteCharAt(sb.length() - 1);
    subSets(arr, index + 1, sb, res);
  }
}
