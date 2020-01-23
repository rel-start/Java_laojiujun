package a08_javaOO;

import java.io.UnsupportedEncodingException;

/**
 * String对象常用的方法
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月21日
 * @copyright 断点
 * @remarks
 */
public class StringDemo {

  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // System.out.printf("判断传入的字符串是否是一个正确格式的小数：");
    // String str = input.nextLine();
    // System.out.println(isDecimal(str));
    // input.close();

    // ----
    String pwd = "abcde12314";
    System.out.println(pwd.substring(2,5));
  }

  /**
   * 判断传入的字符串是否是一个正确格式的小数
   * 
   * @des 字符串只能有一个小数点，小数点不能在第一位，也不能在最后一位
   */
  public static boolean isDecimal(String str) {
    // 判断是否是数字
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.') {
        return false;
      }
    }
    // 小数点不能在第一位，也不能在最后一位
    if (str.indexOf(".") == 0 || str.indexOf(".") == str.length() - 1) {
      return false;
    }
    // 只能有一个小数点
    if (!(str.indexOf(".") == str.lastIndexOf(".") && str.contains("."))) {
      return false;
    }

    return true;
  }

  public static void test1() throws UnsupportedEncodingException {

    // ----
    // char[] chArray = { 'a', 'b', 'c' };
    // String chArrayToStr = new String(chArray);
    // System.out.println(chArrayToStr);// => abc

    // char[] newChar = chArrayToStr.toCharArray();// 将此字符串转换为一个新的字符数组。
    // System.out.println(chArray);

    // char[] ch2 = { 104, 101, 108, 108, 111 };
    // System.out.println(new String(ch2)); // => hello

    // String s = "闈掑北";
    // byte[] b = s.getBytes("gbk");// 编码
    // String sa = new String(b, "utf-8");// 解码:用什么字符集编码就用什么字符集解码
    // System.out.println(sa);

    String str1 = "ab";
    String str2 = "ac";
    int result = str1.compareTo(str2);
    System.out.println(result);
  }
}