package a08_javaOO;

/**
 * CircleTest
 */
public class CircleTest {

  public static void main(String[] args) {
    // //Circle类
    // Circle c1 = new Circle();
    // c1.getArea();
    // c1.getPerimeter();

    // //CircleV2类
    // CircleV2 c2 = new CircleV2(25);
    // c2.getArea();

    // CircleV3类
    CircleV3 c3 = new CircleV3(23);
    System.out.printf("圆的面积: %.2f, 周长: %.2f, 半径: %.2f\n", c3.getArea(), c3.getPerimeter(), c3.getRadius());
  }
}