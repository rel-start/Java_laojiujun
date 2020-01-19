package a05_for;

/**
 * 显示break的基本用法
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月25日
 * @copyright 断点
 * @remarks 
 * 
 */
public class BreakDemo {

  public static void main(String[] args) {
    int count = 0;
    long startTime = System.currentTimeMillis();// 1970-1-1到现在的毫秒数
    while (true) {// 死循环
      if (count++ == Integer.MAX_VALUE) {
        break;
      }
    }
    long endTime = System.currentTimeMillis();// 1970-1-1到现在的毫秒数
    System.out.println("循环结束" + count);
    System.out.println("循环用时：" + (endTime - startTime) + "毫秒");
  }
}