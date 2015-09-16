class recursion_1_and_2
{
    public String stringClean(String str) 
    {
        if (str.length() < 2) //reached two characters in extracted string
            return str;

        if (str.charAt(0) == str.charAt(1)) //if letters are the same
            return stringClean(str.substring(1)); //convert double letter to single letter and return it

        else
            return str.charAt(0) + stringClean(str.substring(1)); //the current letter, and the one after it
    }

    public int countHi(String str) 
    {
        if (str.length() < 2) 
            return 0;
        if (str.substring(0, 2).equals("hi"))
            return 1 + countHi(str.substring(2));

        return countHi(str.substring(1));
    }

    public int count8 (int n) 
    {
        if (n == 0) 
            return 0;
        if (n >= 88 && n % 100 == 88) 
            return 2 + count8(n / 10);
        if (n % 10 == 8) 
            return 1 + count8(n / 10);

        return count8(n / 10);
    }

    public boolean groupSum(int start, int[] nums, int target) 
    {
        if (start >= nums.length)
            return target == 0;
        return groupSum (start + 1, nums, target - nums[start]) || groupSum (start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) 
    {
        if (start >= nums.length) 
            return target == 0;

        if (nums[start] % 5 == 0) 
        {
            if (start < nums.length - 1 && nums[start + 1] == 1)
                return groupSum5(start + 2, nums, target - nums[start]);

            return groupSum5(start + 1, nums, target - nums[start]);
        }
        return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
    }
}