package a05_for;

/**
 * 日历
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class MyCalendar {

  public static void main(String[] args) {
    // 打印月历
    // 请使用循环打印1997年7月的月历
    // 已知：1997年7月1日（星期二），香港回归举国同庆
    System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");

    int getDay = 2;// 星期二
    int daysOfMonth = 31; // 1997年7月一共有31天
    String hml = null;

    for (int i = 1, j = 0; i <= daysOfMonth+2; i++, j = i - getDay) {
      // if (i <= getDay) {
      // System.out.print(" \t");
      // } else {
      // System.out.print(j + "\t");
      // }
      hml = i <= getDay ? " \t" : i % 7 == 0 ? j + "\t\n" : j + "\t";
      System.out.print(hml);

      // if (i % 7 == 0) {
      // System.out.print('\n');
      // }
    }
  }
}