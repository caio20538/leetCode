# Two Sum - LeetCode Problem

Given an array of integers `nums` and an integer `target`, return **indices of the two numbers** such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you **may not use the same element twice**.

You can return the answer in **any order**.

---

## 🧠 Problem Statement

> Given an array of integers `nums` and an integer `target`, find two indices `i` and `j` such that:
>
> ```
> nums[i] + nums[j] == target
> ```
> 
> - Return `[i, j]`
> - Only one valid solution is guaranteed
> - The same element cannot be used twice

---

## 💡 Examples

```text
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]  
Explanation: nums[0] + nums[1] == 9 → 2 + 7 == 9

Input: nums = [3, 2, 4], target = 6  
Output: [1, 2]  
Explanation: nums[1] + nums[2] == 6 → 2 + 4 == 6

Input: nums = [3, 3], target = 6  
Output: [0, 1]  
Explanation: nums[0] + nums[1] == 6 → 3 + 3 == 6
