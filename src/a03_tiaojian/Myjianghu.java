package a03_tiaojian;

import java.util.Scanner;

/**
 * 根据角色的内力值打印角色的能力描述
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月15日
 * @copyright 断点
 * @remarks 
 * 
 */
public class Myjianghu {

  public static void main(String[] args) {
    String pj = ""; // 内力所对应的评价
    Scanner input = new Scanner(System.in);
    int nl = input.nextInt(); // 用户输入的内力

    if (nl >= 0 && nl < 1000) {
      pj = "不堪一击";
    } else if (nl >= 1000 && nl < 3000) {
      pj = "毫不足虑";
    }

    System.out.println("雁南飞大侠" + pj);
    input.close();
  }
}