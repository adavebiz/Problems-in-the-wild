import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
    // test array
		int x[] = {4};
		System.out.println(new Solution().majorityElement(x));
	}

	public int majorityElement(int[] nums) {
		Map<Integer,Integer> element2Count = new HashMap<>();
		
		// init frequency dist
		for (int x : nums) 
			element2Count.put(x,0);
		// update frequency dist
		for (int x : nums) {
			Integer value = element2Count.get(x);
			element2Count.put(x,value+1);
		}
		// find the max occuring from the frequency distribution
		Integer maxOccurElement = null;
		int maxOccur = 0;
		for (int x : element2Count.keySet()) {
			Integer testValue = element2Count.get(x);
			if(testValue>maxOccur) {
				maxOccur = testValue;
				maxOccurElement = x;
			}
		}
		
		return maxOccurElement.intValue();
	}
}
