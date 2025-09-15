class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> solution = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            solution.add(index[i], nums[i]);
        }

        return solution.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}