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
- 📈 Progress toward solving 100+ problems

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

## LeetCode 26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int j =1 ; j<nums.length ; j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}



## leetcode 27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
    int nonval=0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                nums[nonval]=nums[i];
                nonval++;
            }
        }
        return nonval;
    }
}



## leetcode 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}



## leetcode 918. Maximum Sum Circular Subarray

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
              // in kadanes algo algo always initialize with nums[0]
   int max_sum=nums[0];
   int curr_max=nums[0];
    int min_sum=nums[0];
   int curr_min=nums[0];
    int total_sum=nums[0];
  // loop till length-1 from 1 beacuse we have 0 index value 
        for(int i=1 ; i<nums.length ; i++){
            // simple kadane for maximum subArray
            curr_max= Math.max(nums[i],curr_max+nums[i]);
            max_sum=Math.max(curr_max,max_sum);
            // simple minimum subArray kdane 
            curr_min = Math.min(nums[i],curr_min+nums[i]);
            min_sum = Math.min(min_sum,curr_min);
            // calculating totalsum from index 1 - end
            total_sum+=nums[i];
        }
        // If all numbers are negative, max_sum will be the least negative number.
        // In that case, total_sum == min_sum, so total_sum - min_sum = 0 (invalid).
        // So return max_sum directly.
        if(max_sum<0){
            return max_sum;
        }
        // 
        return Math.max(max_sum,total_sum-min_sum);
}
}


## leetcode  54.  Spiral Matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(startrow<=endrow && startcol<=endcol){
             //top
        for(int i =startrow ; i <= endcol ; i++){
            list.add(matrix[startrow][i]);
        }
        //rigth
        for(int i=startrow+1 ; i<= endrow ;i++){
            list.add(matrix[i][endcol]);
        }
        //down
        for(int i = endcol-1 ; i>= startcol ; i--){
            if(startrow==endrow){
                break;
            }
            list.add(matrix[endrow][i]);
        }
        //left
        for(int i = endrow-1 ; i>startrow ; i--){
            if(startcol==endcol){
                break;
            }
            list.add(matrix[i][startcol]);
        }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
       return list;
    }
}



## leetcode 1572. Matrix Diagonal Sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for( int i =0 ; i<mat.length ; i++){
            //primary diagonal
            sum+=mat[i][i];
            //secondary diagonal
            if(i!=mat.length-i-1){ // secondary diagonal where i!=j
                sum+=mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
}



## leetcode 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0 ; i<prices.length ; i++){
            if(buy<prices[i]){
                maxprofit=Math.max(maxprofit,prices[i]-buy);
            }
            else {
                buy=prices[i];
            }
        }
        return maxprofit;
    }
}

#leetcode 867. Transpose Matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++ ){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
}



##leetcode 240. Search a 2D Matrix II

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row  = 0; //rows   
        int col = matrix[0].length-1; //cols
        while(row<matrix.length&& col>=0){ //row<endrow and col>=0
            if(matrix[row][col]==target){
                return true; //found true
            }
            else if (target<matrix[row][col]){
                col--; // staircase search then move toward left
            }
            else{
                row++; // staircase search move toward bottom
            }
        }
        return false;
    }
}


#leetcode 125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i =0 ; i<s.length()/2 ; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}




##leetcode 657. Robot Return to Origin

class Solution {
    public boolean judgeCircle(String moves) {
        int x=0; int y=0;
        for(int i =0 ; i<moves.length() ; i++){
            if(moves.charAt(i)=='R'){
                x++;
            }
            else if (moves.charAt(i)=='L'){
                x--;
            }
            else if (moves.charAt(i)=='U'){
                y++;
            }
            else{
                y--;
            }
        }
        if (x ==0 && y==0){
            return true;
        }
        return false;
    }
}


#leetcode 242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
          s=s.toLowerCase();
         t=t.toLowerCase();
        boolean res=false;
             char[] sc = s.toCharArray();
            char[] tc = t.toCharArray();
        if(s.length()==t.length()){
            Arrays.sort(sc);
            Arrays.sort(tc);
             res = Arrays.equals(sc,tc);
        }
        return res;
    }
}



##leetcode 231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
      return n>0 && (n&(n-1))==0;
    }
}




#leetcode 136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
         for(int num:nums){
             res=res^num;
         }
    return res;
    }
}


#leetcode 476. Number Complement

class Solution {
    public int findComplement(int num) {
         return num = (Integer.highestOneBit(num)*2-1)&(~num);
    }
}

#leetcode 1009. Complement of Base 10 Integer

class Solution {
    public int bitwiseComplement(int num) {
        if (num == 0) return 1;  // Special case
        int mask = Integer.highestOneBit(num) * 2 - 1;
        return ~num & mask;
    }
}



#leetcode 14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
           String prefix =  strs[0];
         for(int i=1 ; i<strs.length ; i++){
             while(!strs[i].startsWith(prefix)){
                 prefix = prefix.substring(0,prefix.length()-1);
                 if(prefix.length()==0){
                     return "";
                 }
             }
         }
        return prefix;
    }
}



#leetcode 283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int order=0;
        for ( int i=0 ; i<nums.length ; i++){
           if(nums[i]!=0){
               nums[order++]=nums[i];
           }
        }
        while(order<nums.length){
            nums[order++]=0;
        }
    }
}


#leetcode 1394. Find Lucky Integer in an Array

class Solution {
    public int findLucky(int[] arr) {
      int lucky = 0;
      int finalcount=0;
      int currcount=0;
      int currlucky=0;
        for(int i =0 ; i<arr.length ; i++){
            for(int j =0 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    currcount++;
                }
            }
            if(currcount>finalcount && currcount == arr[i]){
                 currlucky=arr[i];
                if(currlucky>lucky){
                    lucky=currlucky;
                } 
            }
            currcount=0;
        }
        if(lucky==0){
            return -1;
        }
        return lucky;
    }
}


#leetcode 35. Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
         int start=0; int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}



#leetcode 66. Plus One
class Solution {
    public int[] plusOne(int[] digits) {
      int carry =1; int sum =0;
      for(int i =digits.length-1 ; i>=0 ; i--){
          sum=digits[i]+carry;
          digits[i]=sum%10;
          carry=sum/10;
      }
      if(carry==0) return digits;
      int [] result = new int[digits.length+1];
        result[0]=carry;
    for(int i =0 ; i<digits.length ; i++){
        result[i+1]=digits[i];
    }
        return result;
    }
}


#leetcode 303. Range Sum Query - Immutable

class NumArray {
     private int[] prefix;
    public NumArray(int[] nums) {
     prefix = new int[nums.length+1];
    for(int i =0 ; i<nums.length ; i++){
        prefix[i+1]=prefix[i]+nums[i];
    }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right+1]-prefix[left];
    }
}
---

Stay tuned for daily updates, optimizations, and notes!