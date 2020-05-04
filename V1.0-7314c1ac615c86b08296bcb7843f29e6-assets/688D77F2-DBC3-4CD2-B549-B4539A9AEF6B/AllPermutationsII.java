public class Solution {
  public List<String> permutations(String input) {
    // Write your solution here
    List<String> res = new ArrayList<>();
    if(input == null){
      return res;
    }
    if(input.length() == 0){
      res.add("");
      return res;
    }
    char[] arr = input.toCharArray();
    permutations(arr, 0, res);
    return res;
  }
  private void permutations(char[] arr, int index, List<String> res){
    if(index == arr.length - 1){
      res.add(new String(arr));
      return;
    }
    Set<Character> set = new HashSet<>();
    for(int i = index; i < arr.length; i++){
      if(set.add(arr[i])){
        swap(arr, index, i);
        permutations(arr, index + 1, res);
        swap(arr, index, i);
      }
    }
  }
  private void swap(char[] arr, int i, int j){
    char tem = arr[i];
    arr[i] = arr[j];
    arr[j] = tem;
  }
}
