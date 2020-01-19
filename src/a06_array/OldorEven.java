package a06_array;

/**
 * 求数组中的奇偶个数
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks
 * 
 */
public class OldorEven {

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

    int oddCount = 0, eventCount = 0;// 奇偶个数
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        eventCount++;
      } else {
        oddCount++;
      }
    }

    System.out.printf("奇数个数：%s，偶数个数：%s\n", oddCount, eventCount);
  }
}