package a06_array;

import java.util.Arrays;

/**
 * 排序
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月29日
 * @copyright 断点
 * @remarks
 * 
 */
public class SortDemo {
public static void main(String[] args) {
  final int N = 10;// 常量
  int nums[] = new int[N];
  for (int i = 0; i < nums.length; i++) {
    nums[i] = (int) (Math.random() * 10000);
  }

  // 冒泡
  // long startTime = System.currentTimeMillis();
  // mpSort(nums);
  // long endTime = System.currentTimeMillis();
  // System.out.println("冒泡排序共耗时：" + (endTime - startTime) + "毫秒");

  // // 选择
  // long startTime2 = System.currentTimeMillis();
  // xzSort(nums);
  // long endTime2 = System.currentTimeMillis();
  // System.out.println("冒泡排序共耗时：" + (endTime2-startTime2) + "毫秒");
  for (int i : nums) {
    System.out.print(i + ", ");
  }
  long startTime3 = System.currentTimeMillis();
  Arrays.sort(nums);
  long endTime3 = System.currentTimeMillis();
  System.out.println("Arrays.sort()排序共耗时：" + (endTime3 - startTime3) + "毫秒");
}

  // 冒泡排序
  static int[] mpSort(int[] nums) {
    // 1.一共会比较数组元素个数-1轮
    // 2.每一轮，比较的次数比上一轮少1
    // 3.如果前面一个数组大于/小于后面一个数字，那么交换

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    return nums;
  }

  // 选择排序
  static int[] xzSort(int[] list) {
    // 每次循环，交换i的值和minIndex的值
    for (int i = 0; i < list.length; i++) {
      int min = i;// 最小的下标
      for (int j = i + 1; j < list.length; j++) {
        if (list[min] > list[j]) {
          min = j;
        }
      }

      int temp = list[i];
      list[i] = list[min];
      list[min] = temp;
    }

    return list;
  }
}