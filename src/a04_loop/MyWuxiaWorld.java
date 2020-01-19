package a04_loop;

import java.util.Scanner;

/**
 * 模拟我的额无暇世界选择人物功能
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月16日
 * @copyright 断点
 * @remarks 
 * 
 */
public class MyWuxiaWorld {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String answer = "y"; // 用户输入的是否继续
    String name = null;

    do {
      System.out.println("欢迎进入我的武侠世界，请大侠起个响当当的名号闯荡江湖");
      name = input.nextLine();
      System.out.println("头衔：【初入江湖】");
      System.out.println("江湖名号：" + name);
      System.out.printf("%s 大侠，满意您的江湖名号吗？(y/n)", name);
      answer = input.nextLine();
      // } while(!"y".equals(answer));//比较字符串
    } while (!"y".equalsIgnoreCase(answer));// 忽略大小写比较
    String str = String.format("【%s】大侠重入江湖，宵小之辈素素退避！", name);
    System.out.println(str);
    input.close();
  }
}