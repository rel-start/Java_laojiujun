package a05_for;

import java.util.Scanner;

/**
 * 循环输入玩家的个人贡献度，如果为负则停止输入，提示输入错误 - 一旦输入的值为负，使用break跳出循环
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class GXHomeWork {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double exp = 0; // 个人贡献度
    double sum = 0;// 个人总贡献度

    for (;;) {
      // exp = new Scanner(System.in).nextDouble();//匿名的方式调用
      exp = input.nextDouble();
      if (exp < 0) {
        System.out.println("个人贡献度不能为负！程序强制退出");
        break;
      } else {
        sum += exp;
      }
    }
    System.out.println("当前个人总贡献度为：" + sum);

    input.close();
  }
}