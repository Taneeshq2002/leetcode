/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  let sum = 0;
  let res = [];
  let flag = 0;
  for (let i = 0; i < nums.length; i++) {
    sum = 0;
    for (let j = 0; j < nums.length; j++) {
      if (i == j) {
        continue;
      }
      sum = nums[i] + nums[j];
      if (sum == target) {
        res.push(i);
        res.push(j);
        flag = 1;
        break;
      }
    }
    if (flag == 1) {
      break;
    }
  }
  return res;
};
