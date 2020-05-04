public class Solution {
  public String replace(String input, String source, String target) {
    // Write your solution here
    char[] arr = input.toCharArray();
    char[] src = source.toCharArray();
    char[] tar = target.toCharArray();
    if(src.length >= tar.length){
      int slow = 0;
      for(int fast = 0; fast < arr.length; fast++){
        if(equals(arr, fast, src)){
          fast += src.length - 1;
          for(int i = 0 ; i < tar.length; i++){
            arr[slow] = tar[i];
            slow++;
          }
        }else{
          arr[slow] = arr[fast];
          slow++;
        }
      }
      return new String(arr, 0, slow);
    }else{
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < arr.length; i++){
        if(equals(arr, i, src)){
          i += src.length - 1;
          sb.append(target);
        }else{
          sb.append(arr[i]);
        }
      }
      return sb.toString();
    }
  }
  private boolean equals(char[] arr, int index, char[] src){
    if(arr.length - index < src.length){
      return false;
    }
    for(int i = 0; i < src.length; i++){
      if(arr[i + index] != src[i]){
        return false;
      }
    }
    return true;
  }
}
