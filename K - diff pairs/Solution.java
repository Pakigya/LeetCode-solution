// The logic is to create a hashmap of all the elements to their count. Then we check if the hashmap contains the key whose value is the key of map - k. If so , increase the count of k. Return count.

public class Solution {
    public int findPairs(int[] nums, int k) {
        if( k < 0)
            return 0;
        HashMap < Integer , Integer > map = new HashMap< Integer , Integer >();
        for ( int i = 0; i < nums.length; i++) {
                if( map.get(nums[i]) != null)
                    map.put(nums[i] , map.get(nums[i]) + 1);
                else
                    map.put(nums[i] , 1);
        }
        int count = 0;
        for( Map.Entry< Integer , Integer> entry : map.entrySet() ) {
            if( k != 0) {
                if( map.containsKey(entry.getKey() - k) )
                    count++;
            }
            else {
                if( entry.getValue() >= 2)
                    count++;
            }
        }
        return count;
    }
}
