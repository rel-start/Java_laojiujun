package a02_class2;

/**
 * 类型转换
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 */
public class Test5 {

  public static void main(String[] args) {
    double num = 90.33;
    // 范围大的类型 -> 范围小的需要强制类型转换
    int num1 = (int) num;
    System.out.println(num1);

    // int a = 5 / 2; // => 2
    // double b = 5 / 2; // => 2.0
    // double cc = 5 / 2.0; // => 2.5
    double cd = 5 / 2f; // => 2.5
    System.out.println(cd);

    // int number1 = 2147483647;
    long number2 = 2147483647;

    float number3 = 3.14f;
    double number4 = 3.14;

    number4 = number2 + number3;
    System.out.println(number4);
  }
}