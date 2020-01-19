package a04_loop;

/**
 * 使用循环计算1-100的累加和 1.需要循环变量 2.需要累加和变量
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月16日
 * @copyright 断点
 * @remarks 
 * 
 */
public class WhileTest1 {

  public static void main(String[] args) {
    // 写出循环结构
    int i = 0;
    int sum = 0; // 用来保存累加和
    while (i < 100) {
      sum += ++i;
    }
    System.out.println("1-100的累加和为：" + sum);
  }
}