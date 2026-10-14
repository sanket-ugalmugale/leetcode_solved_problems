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

// class Solution {
//     public int[] twoSum(int[] nums, int target) 
//     {
//         Map<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<nums.length; i++)
//         {
//             map.put(nums[i], i);
//         }

//         for(int i=0; i<nums.length; i++)
//         {
//             int lookupNum = target - nums[i];

//             if(map.containsKey(lookupNum) && map.get(lookupNum) != i)
//             {
//                 return new int[]{
//                     map.get(lookupNum), i
//                 };
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }