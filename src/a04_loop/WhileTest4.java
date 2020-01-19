package a04_loop;

/**
 * 某宝双十一2015年的交易额为800亿，每年递增25% 问：按此速度哪年交易额达到2000亿？
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class WhileTest4 {

  public static void main(String[] args) {
    double item = 1;
    double sum = 0;
    int i = 0;
    while (item != 0 && i++ < 10) {
      sum += item;
      item -= 0.1;
      System.out.println(item);
    }
    System.out.println(sum);
    // // 声明相关变量
    // int year = 2015;// 年份
    // double money = 800;// 交易额
    // while (money <= 2000) {
    // year++;
    // money *= 1.25;
    // }
    // System.out.printf("%d年，交易额达到2000亿元(%.2f亿元)\n", year, money);
  }
}