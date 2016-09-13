<!-- This file is partly written in Chinese -->

# 动态规划（Dynamic programming, DP）

### 解题思路

1. 判断是否是动态规划的题目
    - 重叠子问题
    - 最优子结构
2. 分割问题成最小的子问题
3. 确定子问题传递的参数
    - 确定依赖的范围: n 依赖至 n-1 还是 n-2
    - 确定状态的个数
4. 处理边界条件
5. 剪枝
    - 缓存中间结果
    - 提前返回

### 解法

1. 常规动态规划问题一般有循环(自底向上)和递归(自顶向下)两种解法，一般建议用循环解，因为递归剪枝困难、常常需要一个O(n)的辅助数组来缓存运算结果
2. 部分动态规划问题还可以用状态机来处理，如[LeetCode No309](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/).

### Summary of DP Problems and solutions

#### EASY

##### [No070(Climbing Stairs)](https://leetcode.com/problems/climbing-stairs/):

Classic DP problem, using bottom-up loop or up-bottom recursive with cache.

##### [No121(Best Time to Buy and Sell Stock)](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

A simple version of the Kadane's Algorithm of the max sub-array problem (related to No053), an important type of DP thoughts.

##### [No198(House Robber)](https://leetcode.com/problems/house-robber/)

General DP problem with two parameters.

##### [No303(Range Sum Query Immutable)](https://leetcode.com/problems/range-sum-query-immutable/)

It is a math problem rather than a DP one.

#### MEDIUM

##### [No053(Maximum Subarray)](https://leetcode.com/problems/maximum-subarray/)

Classic DP problem, see more at [Kadane's Algorithm](https://zh.wikipedia.org/wiki/%E6%9C%80%E5%A4%A7%E5%AD%90%E6%95%B0%E5%88%97%E9%97%AE%E9%A2%98#Kadane.E7.AE.97.E6.B3.95)

##### [No062(Unique Paths)](https://leetcode.com/problems/unique-paths/)

Math problem, using combinations will be faster.

##### [No063(Unique Paths II)](https://leetcode.com/problems/unique-paths-ii/)

DP with two directions, using bottom-up loop or up-bottom recursive with cache.

##### [No064(Minimum Path Sum)](https://leetcode.com/problems/minimum-path-sum/)

DP with two directions, similar with No063.

##### [No091(Decode Ways)](https://leetcode.com/problems/decode-ways/)

General DP problem with two parameters.

##### [No095(Unique Binary Search Trees II)](https://leetcode.com/problems/unique-binary-search-trees-ii/)

Similar with No096.

##### [No096(Unique Binary Search Trees)](https://leetcode.com/problems/unique-binary-search-trees/)

DP related all state before.