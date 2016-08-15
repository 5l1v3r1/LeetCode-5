<!-- This file is written in Chinese -->

### 动态规划（Dynamic programming, DP）

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

其他:
1. 部分动态规划问题可以用状态机来处理，如[LeetCode No309](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/).