package a08_javaOO;

import java.util.Scanner;

/**
 * 包装类
 * 
 * @author 断点
 * @version 2.0
 * @date 2020年01月21日
 * @copyright 断点
 * @remarks
 */
public class BoxV2 {

  public static void main(String[] args) {
    boolean b1 = Character.isJavaIdentifierPart('$');
    boolean b2 = Character.isJavaIdentifierPart('_');
    boolean b3 = Character.isJavaIdentifierPart('a');
    boolean b4 = Character.isJavaIdentifierPart('1');
    boolean b5 = Character.isJavaIdentifierPart(' ');
    System.out.printf("$: %b, _: %b, 字母: %b, 数字: %b, 空格: %b\n", b1, b2, b3, b4, b5);
  }

  public void test1() {
    Scanner input = new Scanner(System.in);
    System.out.print("请输入一个字符串，来判断是否是一个纯数字：");
    String value = input.next();
    boolean isNum = true;
    for (int i = 0; i < value.length(); i++) {
      if (!Character.isDigit(value.charAt(i))) {// BoxV2.isDigit(value.charAt(i))
        isNum = false;
        break;
      }
    }

    if (isNum) {
      System.out.println("输入的字符串是一个纯数字");
    } else {
      System.out.println("不是一个纯数字");
    }

    input.close();
  }

  /** 判断是否是数字ascii */
  public static boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';
  }
}