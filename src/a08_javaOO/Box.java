package a08_javaOO;

/**
 * 包装类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
public class Box {

  public static void main(String[] args) {
    Integer num1 = 100;
    Integer num2 = 100;
    // 此方法将始终缓存-128至127范围内的值
    System.out.println(num1 == num2);// => true
    Integer num3 = 128;
    Integer num4 = 128;
    System.out.println(num3 == num4);// => true
    Integer num5 = new Integer(100);
    Integer num6 = new Integer(101);
    System.out.println(num5.compareTo(num6));// => false

    // int num1 = 13;

    // /** 装箱 */
    // Integer iNum1 = new Integer(num1);
    // Integer iNum2 = Integer.valueOf(num1);
    // Integer iNum3 = num1;// 自动装箱

    // /** 拆箱 */
    // int a = iNum2;// 自动拆箱
    // int b = iNum1.intValue();
    // System.out.println(iNum2);
  }
}