package a03_tiaojian;

import java.util.Scanner;

/**
 * if语法基础
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月14日
 * @copyright 断点
 * @remarks
 * 
 */
public class IfDemo {

  public static void main(String[] args) {
    // 硬盘盘符一般采用A-Z大写字母表示
    // 使用程序判断用户输入的字符是否是合法的硬盘盘符
    // 1.输入硬盘盘符
    // 2.判断是否合法
    // 3.打印结果

    Scanner input = new Scanner(System.in);
    System.out.print("请输入硬盘盘符：");
    char ch = input.next().charAt(0);// 取用户输入字符串的第一个字符
    if (ch >= 'A' && ch <= 'Z') {
      System.out.println("您输入的盘符是合法盘符！");
    } else {
      System.out.println("输入了非法盘符！！！");
    }

    // 无块级作用域，if 下面只能有1行
    int a = 5, b = 9;
    if (a > b)
      System.out.println("大于");
    // System.out.println("hello");
    else
      System.out.println("小于");
    input.close();
  }
}