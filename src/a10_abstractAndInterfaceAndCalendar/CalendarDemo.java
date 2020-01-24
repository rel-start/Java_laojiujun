package a10_abstractAndInterfaceAndCalendar;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 演示日历类的常用方法
 */
public class CalendarDemo {
  public static void main(String[] args) throws ParseException {
    // Calendar是一个抽象类，一般由子类GregorianCalendar实现
    Calendar cal = Calendar.getInstance();
    // System.out.println(cal.getClass()); // class java.util.GregorianCalendar
    // System.out.println(cal.getClass().getSuperclass()); // class
    // java.util.Calendar

    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH) + 1;
    int date = cal.get(Calendar.DATE);
    int hour = cal.get(Calendar.HOUR);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);
    int millisecond = cal.get(Calendar.MILLISECOND);
    System.out.println("当前时间：");
    // %02d 不够2位数补0
    String strTime = String.format("%d-%02d-%02d %d:%d:%d %d", year, month, date, hour, minute, second, millisecond);
    System.out.println(strTime);// 2020-01-24 2:16:52 690

    // -----
    // 为日历设定时间
    cal.set(2018, 11, 12, 20, 30, 40);
    Date d1 = cal.getTime();
    System.out.println(d1.toLocaleString()); // 2018-12-12 20:30:40

    // 日历格式化类
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    String strD1 = format.format(d1);
    System.out.println(strD1); // 2018-12-12 20:30:40:690

    // -------
    // 将字符串转换为Date类型
    Date newDate = format.parse("2017-12-30 23:59:59:999");
    System.out.println(newDate.toLocaleString()); // 2017-12-30 23:59:59

    // ------
    // 计算2个日期之间的差值
    Calendar cal2 = new GregorianCalendar(2018, 3, 11);
    long diff = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis());
    int diffDays = (int) (diff / 1000 / 60 / 60 / 24);
    System.out.println("相差" + diffDays + "天"); // 相差245天

    // -----
    cal2.add(Calendar.YEAR, -3);
    cal2.roll(Calendar.MONDAY, 2);
    System.out.printf("cal2对象的年份：%d, 月份: %d\n", cal2.get(Calendar.YEAR), cal2.get(Calendar.MONDAY)); // cal2对象的年份：2015,
                                                                                                     // 月份: 5

    // -----
    // Date d2 = new Date();
    // String StrD2 = format.format(d2);
    Calendar cal3 = new GregorianCalendar();//2020-1-24

    System.out.println(cal3.get(Calendar.DAY_OF_WEEK)); // 6
    System.out.println(cal3.get(Calendar.DAY_OF_MONTH)); // 24
    System.out.println(cal3.get(Calendar.DAY_OF_YEAR)); // 24
    System.out.println(cal3.get(Calendar.WEEK_OF_MONTH)); // 4
    System.out.println(cal3.get(Calendar.WEEK_OF_YEAR)); // 4
    System.out.println(cal3.get(Calendar.AM_PM)); // 1
  }
}