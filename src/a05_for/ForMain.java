package a05_for;

import java.util.Scanner;

/**
 * 求游戏工会玩家的平均战斗力
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks
 * 
 */
public class ForMain {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int power = 0; // 玩家的战斗力
    double avg = 0; // 平均值
    int sum = 0; // 累加和
    // 输入三个战力，求平均值
    for (int i = 0; i < 3; i++) {
      System.out.printf("请输入第%d位玩家的战斗力：\n", (i + 1));
      power = input.nextInt();
      sum += power;
    }
    avg = sum / 3.0;
    System.out.printf("三位玩家的战斗力平均值位：%.2f", avg);
    input.close();
  }
}