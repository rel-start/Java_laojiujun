package a08_javaOO;

import java.util.Scanner;

/**
 * 使用面向对象的方式创建一个圆 类，分别计算周长和面积
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 * 
 */
public class Circle {
  // 1.定义类：Circle
  // 2.抽取属性
  // 3.定义方法
  // 4.调用方法并打印结果
  /** 圆的半径 */
  public double radius;
  /** 圆的周长 */
  public double perimeter;
  /** 圆的面积 */
  public double area;

  /** 输入半径 */
  public void inputRaius() {
    Scanner input = new Scanner(System.in);
    System.out.print("请输入圆的半径: ");
    radius = input.nextDouble();
    input.close();
  }

  /** 获取周长 */
  public void getPerimeter() {
    if (radius <= 0)
      inputRaius();
    perimeter = 2 * Math.PI * radius;
    System.out.printf("周长为：%.2f\n", perimeter);
  }

  /** 获取面积 */
  public void getArea() {
    if (radius <= 0)
      inputRaius();
    area = Math.PI * Math.pow(radius, 2);
    System.out.printf("面积为：%.2f\n", area);
  }
}