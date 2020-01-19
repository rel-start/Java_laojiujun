package a04_loop;

import java.util.Scanner;

/**
 * 使用循环实现三次密码输入错误退出系统
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月16日
 * @copyright 断点
 * @remarks 
 * 
 */
public class WhileTest3 {

  public static void main(String[] args) {
    final String PASSWORD = "123456";
    Scanner input = new Scanner(System.in);
    // 1.声明相关变量
    String password = null;
    int i = 0;
    // 2.写出循环结构
    // 3.考虑循环的次数
    while (i < 3) {
      System.out.print("请输入密码：");
      password = input.next();

      i++;
      // 4.输入并验证用户名和密码
      if (!PASSWORD.equals(password)) { // 判断字符串相等
        if (i == 3) {
          System.out.println("密码输入错误已达三次，强制退出！");
          System.exit(0);
        }
        System.out.printf("密码输入错误，请重新输入！（剩余）%d次\n", (3 - i));

      } else {
        // i = Integer.MAX_VALUE; // 让i的值为整型里的最大值
        break;
      }
    }
    System.out.println("密码正确，成功登录本系统");
    input.close();
  }
}