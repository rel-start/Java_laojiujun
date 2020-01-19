package a04_loop;

import java.util.Scanner;

/**
 * 实现简单的计算器功能：加减乘除取模
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class DoWhileDemo1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num1, num2, result;// 两个操作数和一个结果变量
    String op = "";// 运算符，初值为空字符串
    String choice = null; // 用户的选择，是否继续

    do {
      System.out.println("请输入两个操作数：");
      num1 = input.nextDouble();
      num2 = input.nextDouble();
      result = num1 + num2;// 计算运算结果

      System.out.println("请输入运算符：");
      op = input.next();
      // 根据运算符的判断，进行相应的计算
      switch (op) {
      case "+":
        result = num1 + num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        // 需要判断被除数是否为0
        if (num2 == 0) {
          System.out.println("除数不能为0！");
          result = 0;
        } else {
          result = num1 / num2;
        }
        break;
      case "%":
        result = num1 % num2;
        break;
      default:
        System.out.println("未知运算符，运算失败！");
        result = 0;
      }
      System.out.printf("%.2f %s %.2f = %.2f\n", num1, op, num2, result);
      
      System.out.print("是否继续计算？(y/n)");
      choice = input.next();
      input.close();
    } while ("y".equalsIgnoreCase(choice));
  }
}