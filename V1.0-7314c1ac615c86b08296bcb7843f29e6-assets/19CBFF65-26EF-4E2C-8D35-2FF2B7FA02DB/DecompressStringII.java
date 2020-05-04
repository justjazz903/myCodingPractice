public class Solution {
  public String decompress(String input) {
    // Write your solution here
    if(input.length() < 1){
      return new String();
    }
    char[] arr = input.toCharArray();
    int slow = 0;
    int fast = arr.length - 1;
    int newLen = 0;
    while(fast > 0){
      if(arr[fast] >= '0' && arr[fast] <= '9'){
        newLen += arr[fast] - '0';
      }
      fast--;
    }
    char[] res = new char[newLen];
    while(fast < arr.length){
      if(arr[fast] >= 'a' && arr[fast] <= 'z'){
        char cur = arr[fast];
        fast++;
        for(int i = 0; i < arr[fast] - '0'; i++){
          res[slow] = cur;
          slow++;
        }
      }
      fast++;
    }
    return new String(res);
  }
}
// Or use a StringBuilder, you know.
