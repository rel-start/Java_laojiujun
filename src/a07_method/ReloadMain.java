package a07_method;

/**
 * 方法重载
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月10日
 * @copyright 断点
 * @remarks
 * 
 */
public class ReloadMain {

  public static void main(String[] args) {
    System.out.println(max(5, 10));
    ;
  }

  // static int max(int num1, double num2) {
  //   return (int) (num1 > num2 ? num1 : num2);
  // }

  static double max(double num1, int num2) {
    return (double) (num1 > num2 ? num1 : num2);
  }

}