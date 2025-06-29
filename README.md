# 🚀 Competitive Programming in Java

Welcome to my 30-day CP journey! This repository documents my daily practice, learning, and problem-solving in **Java** across platforms like **LeetCode** and **Codeforces**.

## 📚 Topics Covered
- Arrays & Subarrays (Basic to Advanced)
- Searching Algorithms (Linear, Binary)
- Sorting Algorithms (Coming Soon)
- Two-Pointer & Sliding Window (Coming Soon)
- Prefix Sums, Kadane’s Algorithm
- Recursion, Backtracking, Bit Manipulation (Soon)

## 💻 Platforms
- [LeetCode](https://leetcode.com/)
- [Codeforces](https://codeforces.com/)

## 📦 What You'll Find Here
- ✅ Clean Java code
- 📘 PDF notes for each topic
- 🧠 Dry-run explanations
- 📈 Progress toward solving 300+ problems

## 📅 Challenge Goal
> 300+ CP problems in 30 days across LeetCode and Codeforces 💪

---

### ✅ Day-by-Day Progress

### 🔹 LeetCode 136 - Single Number  
[Problem Link](https://leetcode.com/problems/single-number/)  
```java
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
### 🔹 LeetCode 485 - Max Consecutive Ones
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0; int prevCount=0;
        for(int num :nums){
            if(num==1){
                count=count+1;
                if(count>prevCount){
                    prevCount=count;
                }
            }else {
                count=0;
            }
        }
        return prevCount;
    }
}

### 🔹 LeetCode 344. Reverse String
class Solution {
    public void reverseString(char[] s) {
        int start=0; int end = s.length-1;
        while(start<end){
            char temp = s[start];
            s[start]= s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}


### 🔹 LeetCode 557. Reverse Words in a String III
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse().toString()).append(" ");
        }

        // Remove the trailing space
        return result.toString().trim();
    }
}

### 🔹 LeetCode 169. Majority Element
class Solution {
    public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
        }
    }

### 🔹 LeetCode 704. Binary Search
class Solution {
    public int search(int[] nums, int target) {
       int start = 0; int end=nums.length-1; int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
         return -1;
    }
}


### 🔹 LeetCode 53. Maximum Sub-Array
class Solution {
    public int maxSubArray(int[] nums) {
     int max = nums[0];
     int curr = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            curr = Math.max(nums[i],curr + nums[i]);
            max= Math.max(curr,max);
        }
        return max;
    }
}


### 🔹 LeetCode 42. Traping Rain water
class Solution {
    public int trap(int[] height) {
        int n = height.length;
    int leftmax[]=new int [n];
        leftmax[0]=height[0];
        for(int i =1 ; i<n ; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
    int rightmax[]=new int [n];
        rightmax[n-1]=height[n-1];
        for(int i = n-2 ; i>=0 ; i--){
            rightmax[i]= Math.max(height[i],rightmax[i+1]);
        }
    int trapwater=0;
        for(int i=0 ; i<n; i++){
            trapwater+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return trapwater;
    }
}


 ### 🔹 LeetCode 33. Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {
    int start =0; int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<nums[mid]){
                    end = mid-1; }
                else {
                    start=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[end]){
                    start= mid+1;
                }else{
                    end=mid-1;
                }
            }
            
        }
        return -1;
    }
}

 ### 🔹 LeetCode 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
                for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(curr +  nums[j] == target ){
                    return new int [] {i,j};
                }
            }
        }
        return new int [] {};
    }
}



---

Stay tuned for daily updates, optimizations, and notes!