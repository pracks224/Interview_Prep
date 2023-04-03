class BoatTwoSave{
  /*
  * You are given an array people where people[i] is the weight of the ith person, and an infinite number of
  boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, 
  provided the sum of the weight of those people is at most limit.
  Return the minimum number of boats to carry every given person.
  */
  public static void main(String args[]){
    int[] people = {5,1,4,2};
    int limit = 6;
    numRescueBoats(int[] people, int limit)   
  }
  public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        int i =0;
        int j = people.length-1;
        while(i<=j){
          if(people[i]+people[j]<=limit){
            i++;
          }
          ans++;
          j--;
        }
        return ans;
    }
}
