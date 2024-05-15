# 121. Best Time to Buy and Sell Stock

You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

## Example 1:

Input: `prices` = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

## Example 2:

Input: `prices` = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

## Constraints:

- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4

## Approach used -
max_profit = price[0] - buy 

## Problem Solution Explanation

`maxProfit` method: This method takes an array of integer `prices` as input and returns an integer representing the maximum profit that can be achieved.

`buy` and `max_profit` variables: `buy` represents the price at which the stock is bought initially, initialized with the first price in the array. `max_profit` represents the maximum profit obtained so far, initialized as 0.

For loop: Iterates through the `prices` array.

Inside the loop:
- If the current price is less than the buying price (`buy`), update the buying price to the current price.
- Else, if the difference between the current price and the buying price is greater than the current maximum profit (`max_profit`), update `max_profit` to this difference.

Finally, return `max_profit`, which represents the maximum profit that can be obtained by buying and selling the stock based on the `prices` array.

Explanation:

- We initialize the `buy` variable with the first price because we can't sell before we buy.
- As we iterate through the `prices` array, we update `buy` if we find a lower price and update `max_profit` if selling at the current price gives us a higher profit.
- At the end of the iteration, `max_profit` holds the maximum profit achievable by buying and selling the stock optimally.

This approach only requires a single pass through the `prices` array, making it efficient with a time complexity of **O(n),** where n is the length of the `prices` array. It efficiently identifies the buying price and calculates the maximum profit in one go, hence the name "One Pass" approach.
