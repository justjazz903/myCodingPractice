public class Solution {
  public String compress(String input) {
    // Write your solution here
    char[] arr = input.toCharArray();
    int slow = 0;
    int fast = 0;
    int newLen = 0;
    while(fast < arr.length){
      int begin = fast;
      while(fast < arr.length && arr[fast] == arr[begin]){
        fast++;
      }
      if(fast - begin < 10){
        newLen += 2;
      }else{
        int bit = countBit(fast - begin);
        newLen += bit + 1;
      }
    }
    char[] res = new char[newLen];
    fast--;
    slow = newLen - 1;
    while(fast >= 0){
      int begin = fast;
      while(fast >= 0 && arr[fast] == arr[begin]){
        fast--;
      }
      int count = begin - fast;
      int bit = countBit(count);
      for(int i = 0; i < bit; i++){
        res[slow] = (char)('0' + count % 10);
        count = (count - (count % 10)) / 10;
        slow--;
      }
      res[slow] = arr[begin];
      slow--;
    }
    return new String(res);
  }
  private int countBit(int n){
    int bit = 1;
    while(n / 10 != 0){
      bit++;
      n /= 10;
    }
    return bit;
  }
}
