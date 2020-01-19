package a06_array;

import java.util.Scanner;

/**
 * ArrayMain
 */
public class ArrayMain {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // 要求用户动态录入10个学生的成绩，求平均成绩
    final int N = 10; // 学生的数量
    double scores[] = new double[N];
    double sum = 0, len, avg;
    for (int i = 0; i < scores.length; i++) {
      System.out.println("请输入第" + (i + 1) + "位同学的成绩：");
      // 将用户输入的double类型数字，赋值给数组中的第i个元素
      scores[i] = input.nextDouble();
    }

    // 计算总成绩
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    len = scores.length; // 数组长度
    avg = sum / len;// 平均值
    System.out.printf("%s位学生的平均成绩为：%s\n", len, avg);

    input.close();
  }

  // 数组空指针异常
  static void arrkzzyc() {
    // int[] nums = null;
    // nums[0] = 9;// java.lang.NullPointerException=空指针异常
  }
}