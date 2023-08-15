class OptimalStringPartion {
    public static void main(String args[]) {
        String str = "abacaba";
        //   System.out.println(countOptimalSubString(str));
    }
}
  
  /*static int countOptimalSubStrings(String str){
    int mask = 0;
    int index = 0;
    int count = 0;
    for(int i = 0;i<str.length();i++){
      index = 1<<(str.charAt(i)-'a');
      if(index & mask >0){
        count++;
        mask =0;
      }
      mask |= index;
    }
    return count+1;
  }
}*/

//Another approach with space complexity -> By using HashMap or String Manipulation we can do this.
