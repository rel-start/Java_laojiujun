package a05_for;

import java.util.Scanner;

/**
 * continue的基本应用
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class HomeWork3 {

  public static void main(String[] args) {
    // 1.循环录入5个玩家的消费金额
    // 2.录入后立刻判断是否小于500
    // 3.累加小于500的总次数

    Scanner input = new Scanner(System.in);
    int count = 0;// 小于500的总次数
    double money = Double.MAX_VALUE;// 玩家的消费金额

    for (int i = 0; i < 5; i++) {
      System.out.printf("请输入第%s位玩家的消费金额：", i + 1);
      money = input.nextInt();

      if (money >= 500)
        continue;
      count++;
      // if (money < 500)
      // count++;
    }

    System.out.println("消费金额小于500的玩家个数：" + count);
    input.close();
  }
}