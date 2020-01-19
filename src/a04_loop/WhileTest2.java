package a04_loop;

import java.util.Scanner;

/**
 * 计算输入的整形数字中每位数字之和
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class WhileTest2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("请输入一个整数，来计算各位数字之和：");
    // 1.得到要计算的整形数字
    int num = input.nextInt();
    int tempNum = num;
    // 2.声明相关变量
    // int i = 0; // 循环变量
    int sum = 0; // 累加和
    // 3.循环操作计算累加和
    while (tempNum > 0) {
      sum += tempNum % 10;// 每次循环模10，得到个位数
      tempNum /= 10;// 去掉个位，更新循环变量
    }
    // 4.打印计算结果
    System.out.println(num + "的各位数字之和：" + sum);
    input.close();
  }
}