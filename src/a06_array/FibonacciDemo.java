package a06_array;

/**
 * 斐波那契数列
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月26日
 * @copyright 断点
 * @remarks
 */
public class FibonacciDemo {

  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
  public static void main(String[] args) {
    // 规律：前两个元素值为定值，第三个开始是前两个元素之和
    int[] nums = new int[15];
    int sum = 0;
    double avg;
    nums[0] = 0;
    nums[1] = 1;
    for (int i = 2; i < nums.length; i++) {
      nums[i] = nums[i - 1] + nums[i - 2];
    }

    // 打印数列
    // for (int i = 0; i < nums.length; i++) {
    // System.out.print(nums[i] + ", ");
    // sum += nums[i];
    // }
    for (int num : nums) {
      System.out.print(num + ", "); // =>1, 2, 3
    }
    avg = sum / nums.length;
    System.out.println();
    System.out.printf("数列的和为：%s, 数列的平均值为：%s\n", sum, avg);

  }
}