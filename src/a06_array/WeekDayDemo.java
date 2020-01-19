package a06_array;

import java.util.Scanner;

/**
 * 打印三个国家的星期方式
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月08日
 * @copyright 断点
 * @remarks
 * 
 */
public class WeekDayDemo {

  public static void main(String[] args) {
    System.out.print("请输入今天是星期几：");
    Scanner input = new Scanner(System.in);
    int dayOfWeek = input.nextInt();
    input.close();

    // 中文
    ShowWeekDayByChinese(dayOfWeek);
    // 日文
    ShowWeekDayByJpanese(dayOfWeek);
    // 英文
    ShowWeekDayByEnglish(dayOfWeek);
  }

  /**
   * 以中文的方式，打印星期几
   * 
   * @param dayOfWeek 0-6之间的整型数字，用来表示星期几
   */
  public static void ShowWeekDayByChinese(int dayOfWeek) {
    if (!isRight(dayOfWeek)) {
      return;
    }
    String[] weekdays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
    System.out.println(weekdays[dayOfWeek]);
  }

  /**
   * 以日文的方式，打印星期几
   * 
   * @param dayOfWeek 0-6之间的整型数字，用来表示星期几
   */
  public static void ShowWeekDayByJpanese(int dayOfWeek) {
    if (!isRight(dayOfWeek)) {
      return;
    }
    String[] weekdays = { "日曜日", "月曜日", "火耀日", "水曜日", "木曜日", "金曜日", "土耀日" };
    System.out.println(weekdays[dayOfWeek]);
  }

  /**
   * 以英文的方式，打印星期几
   * 
   * @param dayOfWeek 0-6之间的整型数字，用来表示星期几
   */
  public static void ShowWeekDayByEnglish(int dayOfWeek) {
    if (!isRight(dayOfWeek)) {
      return;
    }
    String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    System.out.println(weekdays[dayOfWeek]);
  }

  /**
   * 用来判断传入的参数是否在0-6之间
   * 
   * @param dayOfWeek 要判断的整型数字：星期几
   * @return 如果合法，返回true, 非法，返回false
   */
  private static boolean isRight(int dayOfWeek) {
    if (dayOfWeek < 0 || dayOfWeek > 6) {
      System.out.println("必须输入0-6之间的数字");
      return false;
    }
    return true;
  }
}