package a09_extends;


/**
 * 使用单例模式
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public class StaticDemoTest {

  public static void main(String[] args) {
    StaticDemo sd1 = StaticDemo.getInstance();
    System.out.println(sd1.normal_number);// =>1

    StaticDemo sd2 = StaticDemo.getInstance();
    sd2.normal_number = 1024;
    System.out.println(sd1.normal_number);// =>1024
    System.out.println(sd2.normal_number);// =>1024

    System.out.println(sd1 == sd2);// =>true
  }

}