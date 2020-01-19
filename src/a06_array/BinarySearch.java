package a06_array;

import java.util.Scanner;

/**
 * 二分查找法。数组预先从小到大排列
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks
 * 
 */
public class BinarySearch {

  public static void main(String[] args) {
    // 基本原理：
    // 首先将要查找的元素（key）与数组的中间元素比较
    // 1、如果key小于中间元素，只需要在数组的前一半元素中继续查找
    // 2、如果key和中间元素相等，匹配成功，查找结束
    // 3、如果key大于中间元素，只需要在数组的后一半元素中继续查找key

    Scanner input = new Scanner(System.in);
    int[] array = { 2, 5, 8, 10, 15, 35, 45, 55, 65, 78, 95 };
    System.out.print("请输入要查找的数字：");
    int searchNum = input.nextInt();
    boolean isFind = false;
    int low = 0;// 下界下标
    int high = array.length - 1;// 上界下标

    while (high >= low) {
      int mid = (high + low) / 2;// 中间下标
      // 如果 searchNum 小于中间元素，只需要在数组的前一半元素中继续查找
      if (searchNum < array[mid]) {
        high = mid - 1;
      }
      // 如果 searchNum 大于中间元素，只需要在数组的后一半元素中继续查找
      else if (searchNum > array[mid]) {
        low = mid + 1;
      }
      // 如果 searchNum 和中间元素相等，匹配成功，查找结束
      else {
        isFind = true;
        System.out.println("找到数字！下标为：" + mid);
        break;
      }
      input.close();
    }

    // 没找到的情况
    if (!isFind) {
      System.out.println("没有找到您输入的数字！");
    }
  }
}