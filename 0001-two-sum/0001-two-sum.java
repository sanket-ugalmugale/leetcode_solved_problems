class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int lookupNum = target - nums[i];

            if(map.containsKey(lookupNum))
            {
                return new int[]
                {
                    i,
                    map.get(lookupNum)
                };
            }
            map.put(nums[i], i);
        }
        return new int[]{1, -1};
    }
}