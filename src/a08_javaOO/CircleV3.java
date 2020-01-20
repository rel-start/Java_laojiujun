package a08_javaOO;

/**
 * 封装
 * 
 * @author 断点
 * @version 3.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
public class CircleV3 {
  /** 圆的半径 */
  private double radius;
  /** 圆的周长 */
  private double perimeter;
  /** 圆的面积 */
  private double area;

  public CircleV3() {
  }

  /**
   * @param radius 半径
   */
  public CircleV3(double radius) {
    this.setRadius(radius);
  }

  /** 获取半径 */
  public double getRadius() {
    return radius;
  }

  /** 设置半径 */
  public void setRadius(double radius) {
    if (radius <= 0)
      this.radius = 1;
    else
      this.radius = radius;
  }

  /** 获取周长 */
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  /** 获取面积 */
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}