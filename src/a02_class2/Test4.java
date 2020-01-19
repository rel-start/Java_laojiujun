package a02_class2;

import java.util.Scanner;

/**
 * Scanner
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月7日
 * @copyright 断点
 * @remarks 
 */

public class Test4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("请输入圆半径");
    double radius = input.nextDouble();
    double area = 3.14 * radius * radius;
    System.out.printf("圆面积为：%.2f\n", area);
    input.close();
  }
}