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





---

Stay tuned for daily updates, optimizations, and notes!