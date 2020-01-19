package a06_array;

import java.util.Scanner;

/**
 * 查找数组中对应的元素，如果找到了，打印下标，没找到，打印-1
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks
 * 
 */
public class IndexOfDemo {

  public static void main(String[] args) {
    // 随机生成一个数组，求里面的奇偶个数
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 10000) % 1001;// 0-1000随机数
    }

    // 打印数组每项
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + ", ");
    }
    System.out.println();

    System.out.println("请输入要查找的元素：");
    Scanner input = new Scanner(System.in);
    int searchNum = input.nextInt();
    int searchIndex = -1;
    // 核心
    for (int i = 0; i < nums.length; i++) {
      if (searchNum == nums[i]) {
        searchIndex = i;
        break;
      }
    }

    if (-1 == searchNum) {
      System.out.println("没找到" + searchIndex);
    } else {
      System.out.println("找到了，下标为：" + searchIndex);
    }
    input.close();
  }
}