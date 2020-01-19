package a02_class2;

import java.util.Scanner;

/**
 * 该类的主要作用
 * @author 断点
 * @version 1.0
 * @date 2019年12月7日
 * @copyright 断点
 * @remarks 
 */
public class HomeWork1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("生 命值：●●●●●●○○");
    System.out.println("物理攻击：●●●●●○○○");
    System.out.println("技能伤害：●●●●●●○○");
    double attack = 57.88; // 伤害
    double attackGrowth = 4.5;

    // System.out.println("伤害：");
    // attack = input.nextDouble();
    // System.out.println("伤害成长值");
    // attackGrowth = input.nextDouble();

    String line1 = String.format("\n伤害：%.2f(+%.2f)\n", attack, attackGrowth);

    System.out.println(line1);
    input.close();
  }
}