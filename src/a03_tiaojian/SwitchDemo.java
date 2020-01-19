package a03_tiaojian;

import java.util.Scanner;

/**
 * switch case练习1
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class SwitchDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // int choice = -1;  //用来保存用户的选择
    System.out.print("姓名：");
    String name = input.next();
    switch (name) {
    case "上帝":
      System.out.println("帝哥你好");
      break;
    case "06大侠":
      System.out.println("侠嫂哪去啦？");
      break;
    default:
      break;
    }
    input.close();
  }
}