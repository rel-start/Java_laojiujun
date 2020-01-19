package a02_class2;

/**
 * Java常见错误举例
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class Err {

  public static void main(String[] args) {
    /* 值溢出 */
    int value = 2147483647 + 1;
    System.out.println(value); // => -2147483648

    /* 取整错误 */
    System.out.println(1 - 0.9);
    
  }
}