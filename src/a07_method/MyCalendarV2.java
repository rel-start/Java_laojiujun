package a07_method;

import java.util.Scanner;

/**
 * 日历
 * 
 * @author 断点
 * @version 2.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks
 * 
 */
public class MyCalendarV2 {
  /** 用户输入的年份 */
  public static int year = Integer.MIN_VALUE;
  /** 用户输入的月份 */
  public static int month = Integer.MIN_VALUE;

  public static void main(String[] args) {

    PrintCalendar();
  }

  /**
   * 打印月历的核心方法
   */
  public static void PrintCalendar() {// 静态方法只能调用静态属性
    // 1.让用于输入年份和月份
    inputYearAndMonth();
    // 2.计算1900-1-1(星期一)到用户输入年份月份的总天数
    // - 2_1，计算各年的总天数
    // - 2_2，计算各月的天数之和
    int sum = getDaysOfYear1900();
    sum += getDaysOfMonthToCurYear11();
    sum++;
    // 3.打印年份和月份(英文)
    // 4.打印月份的标题(星期一到星期日)
    printMonthTitle();
    // 5.根据某月1日是星期几，打印月历的内容
    printCalendarMain(sum % 7);
  }

  /**
   * 根据当月1号是周几打印月历的内容
   */
  private static void printCalendarMain(int dayOfWeek) {
    int daysOfMonth = getDaysOfMonth(month); // 用户输入月份的天数
    String hml = null;
    for (int i = 1, j = 0; i <= daysOfMonth + dayOfWeek; i++, j = i - dayOfWeek) {
      hml = i <= dayOfWeek ? " \t" : i % 7 == 0 ? j + "\t\n" : j + "\t";
      System.out.print(hml);
    }
    System.out.println();
  }

  /**
   * 打印月历的标题
   * 
   * @exp 2020年 10月
   */
  private static void printMonthTitle() {
    String[] monthNames = { "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月" };
    String[] weekdays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
    System.out.println("\t\t\t" + year + "年\t" + monthNames[month - 1]);
    for (int i = 0; i < weekdays.length; i++) {
      System.out.print(weekdays[i] + "\t");
    }
    System.out.println();
  }

  /**
   * 当前年份各月天数的集合
   * 
   * @param year 年份
   * @return 12个月的天数数组
   */
  private static int[] daysArrOfMonthInCurYear(int year) {
    int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    // 用户输入的年份为闰年的情况，2月份为29天
    if (isLeapYear(year)) {
      months[1] = 29;
    }
    return months;
  }

  /**
   * 计算用户输入月份至当年1月1日的总天数
   * 
   * @return 输入月份至当年1月1日的总天数
   */
  private static int getDaysOfMonthToCurYear11() {
    int sum = 0;
    for (int i = 0; i < month - 1; i++) {
      sum += getDaysOfMonth(i + 1);
    }
    return sum;
  }

  /**
   * 当月的天数
   * 
   * @param month 月份
   * @return 天数
   */
  private static int getDaysOfMonth(int month) {
    return daysArrOfMonthInCurYear(year)[month - 1];
  }

  /**
   * 获得1900-year年的总天数
   * 
   * @return 1990-year年的总天数
   */
  private static int getDaysOfYear1900() {
    if (year == Integer.MIN_VALUE) {// 判断用户是否已输入年份
      inputYearAndMonth();
    }
    int sum = 0;
    for (int i = 1900; i < year; i++) {
      if (isLeapYear(i)) {
        sum += 366;
      } else {
        sum += 365;
      }
    }
    return sum;
  }

  /**
   * 用来判断是否是闰年
   * 
   * @param year 需判断的年份
   * @return 闰年返回true，反之false
   */
  private static boolean isLeapYear(int year) {
    return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
  }

  /**
   * 接收用户输入的年份和月份
   */
  private static void inputYearAndMonth() {
    Scanner input = new Scanner(System.in);
    System.out.print("请输入年份：");
    year = input.nextInt();
    System.out.print("请输入月份：");
    month = input.nextInt();
    input.close();
    input = null;
  }
}