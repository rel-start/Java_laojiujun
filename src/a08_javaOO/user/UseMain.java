package a08_javaOO.user;

import java.util.Scanner;

/**
 * 用户注册
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月21日
 * @copyright 断点
 * @remarks
 */
public class UseMain {

  public static void main(String[] args) {
    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.println("请输入用户名");
      String userName = input.nextLine();
      System.out.println(userName);
      System.out.println("请输入密码");
      String passworld = input.nextLine();
      System.out.println(StringUtil.validatePassword(passworld));
      input.close();
    }

  }
}