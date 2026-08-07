class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,nums);
        return result;
    }
    void backtrack (List<List<Integer>>result,List<Integer>temp,int start,int[]nums)
    {
        result.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(result,temp,i+1,nums);
            temp.remove(temp.size()-1);
        }
    }
}
