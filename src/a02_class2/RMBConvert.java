package a02_class2;

import java.util.Scanner;

/**
 * 将给定的钱数分成较小的货币单位
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 */
public class RMBConvert {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("请输入小钱钱的数量：");
    double money = input.nextDouble();

    // 处理圆部分
    int yuan = (int) money;
    int numOfShiYuan = yuan / 10; // 10元纸币的数量
    int numOfWuYuan = yuan % 10 / 5; // 5元纸币的数量
    int numOfYiYuan = yuan % 10 % 5; // 1元纸币的数量

    // 处理角部分
    int jiao = ((int) (money * 10)) % 10;
    int numOfWuJIao = jiao / 5; // 5角纸币的数量
    int numOfYiJiao = jiao % 5; // 1角纸币的数量

    System.out.printf("10元纸币的数量：%s\n5元纸币的数量：%s\n1元纸币的数量：%s\n5角纸币的数量：%s\n1角纸币的数量：%s\n", numOfShiYuan, numOfWuYuan,
        numOfYiYuan, numOfWuJIao, numOfYiJiao);
        input.close();
  }
}