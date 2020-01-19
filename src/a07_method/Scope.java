package a07_method;

/**
 * 作用域
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月11日
 * @copyright 断点
 * @remarks
 * 
 */
public class Scope {

  public static void main(String[] args) {

  }

  // for循环作用域中的变量
  public static void Method() {
    int len = 5;
    for (int i = 0; i < len; i++) {
    }
    // System.out.println(i); //报错。i无法解析为变量
  }

  // 方法内的局部变量，声明以后需要赋值，否则调用时报错
  public static void Method2() {
    // int name;
    // System.out.println(name); //报错。本地变量名称可能尚未初始化
  }

  public static void Method3() {
    // int num1 = 9;
    // int num2 = 10;
  }

  public static void Method4() {
    // System.out.printf("num1: %s,num2: %s", num1, num2);// 报错
  }
}