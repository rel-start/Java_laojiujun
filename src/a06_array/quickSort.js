let nums = [];
for (let i = 0; i < 50000; i++) {
  nums[i] = parseInt(Math.random() * 10000);
}

let startTime = Date.now();
let qNums = qSort(nums);
let endTime = Date.now();
console.log(`快速排序用时${endTime - startTime}毫秒`);

let startTime2 = Date.now();
let mpNums = mpSort(nums);
let endTime2 = Date.now();
console.log(`冒泡排序用时${endTime2 - startTime2}毫秒`);

let startTime3 = Date.now();
let xzNums = xzSort(nums);
let endTime3 = Date.now();
console.log(`选择排序用时${endTime3 - startTime3}毫秒`);

// 快速排序
function qSort(list) {
  if (list.length === 1 || list.length === 0) return list;

  let pivot = list[0];//参照值
  let lesser = [];//比参照值小的值集合
  let greater = [];//比参照值大的值集合
  for (let i = 1; i < list.length; i++) {
    if (list[i] < pivot) {
      lesser.push(list[i]);
    } else {
      greater.push(list[i]);
    }
  }

  //重新拼接数组-从小到大
  return qSort(lesser).concat(pivot, qSort(greater));
}

// 冒泡排序
function mpSort(list) {
  // 1.一共会比较数组元素个数-1轮
  // 2.每一轮，比较的次数比上一轮少1
  // 3.如果前面一个数组大于/小于后面一个数字，那么交换
  for (let i = 0; i < list.length - 1; i++) {
    for (let j = 0; j < list.length - 1 - i; j++) {
      if (list[j] > list[j + 1]) {
        [list[j], list[j + 1]] = [list[j + 1], list[j]];
      }
    }
  }
  return list;
}

// 选择排序
function xzSort(list) {
  let min;
  for (let i = 0; i < list.length; i++) {
    min = i;//最小值的下标
    for (let j = i + 1; j < list.length; j++) {
      if (list[min] > list[j]) min = j;
    }

    // 交换
    [list[i], list[min]] = [list[min], list[i]];
  }
  return list;
}