public class Solution {
  public int strstr(String large, String small) {
    // Rabin Karp!!!
    if(large.length() < small.length()){
      return -1;
    }
    if(small.length() == 0){
      return 0;
    }
    int seed = 1;
    int prime = 31;
    int largePrime = 101;
    int targetHash = small.charAt(0) % largePrime;
    for(int i = 1; i < small.length(); i++){
      seed = moduleHash(seed, 0, prime, largePrime);
      targetHash = moduleHash(targetHash, small.charAt(i), prime, largePrime);
    }
    int hash = 0;
    for(int i = 0; i < small.length(); i++){
      hash = moduleHash(hash, large.charAt(i), prime, largePrime);
    }
    if(hash == targetHash && equals(small, large, 0)){
      return 0;
    }
    for(int i = 1; i <= large.length() - small.length(); i++){
      hash = nonNeg(hash - seed * large.charAt(i - 1) % largePrime, largePrime);
      hash = moduleHash(hash, large.charAt(i + small.length() - 1), prime, largePrime);
      if(hash == targetHash && equals(small, large, i)){
        return i;
      }
    }
    return -1;
  }
  private int moduleHash(int hash, int add, int prime, int largePrime){
    return (hash * prime % largePrime + add) % largePrime;
  }
  private boolean equals(String small, String large, int index){
    for(int i = 0; i < small.length(); i++){
      if(large.charAt(index + i) != small.charAt(i)){
        return false;
      }
    }
    return true;
  }
  private int nonNeg(int hash, int largePrime){
    if(hash < 0){
      hash += largePrime;
    }
    return hash;
  }
}
